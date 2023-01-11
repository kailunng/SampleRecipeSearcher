package com.ngkai.recipesearcher.di

import android.app.Application
import android.content.Context
import androidx.annotation.StringRes
import androidx.room.Room
import com.ngkai.recipesearcher.data.persistence.database.RoomDatabase
import com.ngkai.recipesearcher.utilities.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application) : RoomDatabase =
        Room.databaseBuilder(app, RoomDatabase::class.java, Constants.Data.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()

}