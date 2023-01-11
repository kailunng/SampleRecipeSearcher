package com.ngkai.recipesearcher.data.remote.responses.extensions

import com.ngkai.recipesearcher.data.persistence.entities.RecipeEntity
import com.ngkai.recipesearcher.data.remote.responses.dto.RecipesDTO

object RecipeExtensions {
    fun RecipesDTO.asRecipeEntity() : Array<RecipeEntity>? {
        return this.results.map { recipe ->
            RecipeEntity(
                id = recipe.id,
                cookTime = recipe.cook_time_minutes,
                description = recipe.description,
                name = recipe.name,
                prepTime = recipe.prep_time_minutes,
                servingNumber = recipe.num_servings,
                thumbnail = recipe.thumbnail_url,
                totalTime = recipe.total_time_minutes
            )
        }.toTypedArray()
    }
}