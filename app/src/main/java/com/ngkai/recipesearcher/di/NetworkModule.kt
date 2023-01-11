package com.ngkai.recipesearcher.di

import com.ngkai.recipesearcher.data.remote.RetrofitFactory
import com.ngkai.recipesearcher.data.remote.api.RecipeApi
import com.ngkai.recipesearcher.utilities.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideRecipeApi(): RecipeApi =
        RetrofitFactory.retrofit(Constants.Api.BASE_URL)
            .create(RecipeApi::class.java)

}