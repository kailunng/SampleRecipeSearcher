package com.ngkai.recipesearcher.di

import com.ngkai.recipesearcher.data.persistence.database.RoomDatabase
import com.ngkai.recipesearcher.data.remote.api.RecipeApi
import com.ngkai.recipesearcher.data.repository.RecipeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRecipeRepository (
        api: RecipeApi,
        db: RoomDatabase
    ) = RecipeRepository (
        api = api,
        db = db
    )
}