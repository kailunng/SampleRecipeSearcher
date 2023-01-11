package com.ngkai.recipesearcher.data.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ngkai.recipesearcher.data.models.Recipe
import com.ngkai.recipesearcher.data.persistence.entities.RecipeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(productInfo: RecipeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipes(vararg dependant: RecipeEntity?)

    @Query("SELECT * FROM recipe_table WHERE name LIKE :queryString")
    fun getRecipe(queryString: String): Flow<List<Recipe?>>
}