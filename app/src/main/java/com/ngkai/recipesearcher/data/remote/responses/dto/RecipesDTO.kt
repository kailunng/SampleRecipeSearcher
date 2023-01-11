package com.ngkai.recipesearcher.data.remote.responses.dto

data class RecipesDTO(
    val count: Int,
    val results: List<RecipeDTO>
)