package com.ngkai.recipesearcher.data.persistence.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.ngkai.recipesearcher.data.persistence.Converters
import com.ngkai.recipesearcher.data.persistence.dao.RecipeDao
import com.ngkai.recipesearcher.data.persistence.entities.RecipeEntity

@Database(entities = [
    RecipeEntity::class],
    version = 1,
    exportSchema = false)
@TypeConverters(Converters::class)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}