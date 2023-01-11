package com.ngkai.recipesearcher.data.remote.api

import com.ngkai.recipesearcher.data.remote.responses.dto.RecipesDTO
import com.ngkai.recipesearcher.utilities.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {

    @GET(Constants.Api.LIST)
    suspend fun getRecipe(
        @Query("from") from: Int,
        @Query("size") size: Int,
        @Query("tags") tags: String?,
        @Query("q") query: String?
    ): RecipesDTO

}