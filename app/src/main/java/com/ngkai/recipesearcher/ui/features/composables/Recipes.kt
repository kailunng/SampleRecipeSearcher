package com.ngkai.recipesearcher.ui.features.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ngkai.recipesearcher.ui.components.card.RecipeItem
import androidx.hilt.navigation.compose.hiltViewModel
import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.ui.components.navigation.Screens
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.features.viewmodels.RecipeViewModel

@Composable
fun Recipes(
    viewModel: RecipeAppViewModel,
    recipeViewModel: RecipeViewModel = hiltViewModel()
) {
    viewModel.setCurrentBottomNavScreen(Screens.BottomNavScreens.Recipes)
    val recipes by recipeViewModel.recipeList.collectAsState()

    Column {
        Text(stringResource(id = R.string.recipe_list))
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = recipes,
                itemContent = {
                    RecipeItem(recipe = it!!)
                }
            )
        }
    }
}