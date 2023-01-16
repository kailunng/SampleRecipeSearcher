package com.ngkai.recipesearcher.ui.features.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.ngkai.recipesearcher.ui.components.card.RecipeItem
import androidx.hilt.navigation.compose.hiltViewModel
import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.ui.components.navigation.Screens
import com.ngkai.recipesearcher.ui.components.search.SearchBar
import com.ngkai.recipesearcher.ui.components.search.rememberSearchState
import com.ngkai.recipesearcher.ui.components.title.GreetingTitle
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.features.viewmodels.RecipeViewModel
import com.ngkai.recipesearcher.utilities.SearchState

@Composable
fun Recipes(
    viewModel: RecipeAppViewModel,
    recipeViewModel: RecipeViewModel = hiltViewModel()
) {
    viewModel.setCurrentBottomNavScreen(Screens.BottomNavScreens.Recipes)
    val recipes by recipeViewModel.recipeList.collectAsState()
    val state: SearchState = rememberSearchState()

    Column {
        GreetingTitle(modifier = Modifier, stringResource(id = R.string.recipe_list))
        SearchBar(
            query = state.query,
            onQueryChange = { state.query = it },
            onSearchFocusChange = { state.focused = it },
            onClearQuery = { state.query = TextFieldValue("") },
            searching = state.searching,
            modifier = Modifier
        )

        LaunchedEffect(state.query.text) {
            recipeViewModel.getRecipe(state.query.text)
        }

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
