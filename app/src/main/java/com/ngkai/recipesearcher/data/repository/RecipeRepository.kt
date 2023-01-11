package com.ngkai.recipesearcher.data.repository

import androidx.room.withTransaction
import com.ngkai.recipesearcher.data.persistence.database.RoomDatabase
import com.ngkai.recipesearcher.data.remote.api.RecipeApi
import com.ngkai.recipesearcher.data.remote.responses.extensions.RecipeExtensions.asRecipeEntity
import com.ngkai.recipesearcher.utilities.Constants
import com.ngkai.recipesearcher.utilities.network.RateLimiter
import com.ngkai.recipesearcher.utilities.network.networkBoundResource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class RecipeRepository @Inject constructor(
    private val api: RecipeApi,
    private val db: RoomDatabase
) {
    private val recipeDao = db.recipeDao()
    private val recipeRateLimiter = RateLimiter

    fun getRecipe(query: String) = networkBoundResource(
        query = {
            recipeDao.getRecipe("%$query%")
        },
        fetch = {
            api.getRecipe(from = 0, size = 20, tags = null, query = query)
        },
        saveFetchResult = { item ->
            db.withTransaction {
                item.asRecipeEntity()?.let { recipeDao.insertRecipes(*it) }
            }
        },
        shouldFetch = {
            // only fetches once every 24 hours
            recipeRateLimiter.shouldFetch(Constants.RateLimiter.RECIPE_RATE_LIMITER)
        }
    )
}