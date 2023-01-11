package com.ngkai.recipesearcher.ui.components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.features.composables.Home
import com.ngkai.recipesearcher.ui.features.composables.Recipes

@Composable
fun NavigationHost(navController: NavController, viewModel: RecipeAppViewModel) {
    NavHost(
        navController = navController as NavHostController,
        startDestination = Screens.BottomNavScreens.Home.route
    ) {
        composable(Screens.BottomNavScreens.Home.route) { Home(viewModel = viewModel) }
        composable(Screens.BottomNavScreens.Recipes.route) { Recipes(viewModel = viewModel) }
    }
}