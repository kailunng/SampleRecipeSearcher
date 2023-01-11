package com.ngkai.recipesearcher.ui.components.navigation

import androidx.compose.animation.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.theme.RecipeSearcherTheme

@Composable
fun AppScaffold(modifier: Modifier = Modifier) {
    val viewModel: RecipeAppViewModel = viewModel()
    val navController = rememberNavController()
    val scaffoldState = rememberScaffoldState()
    val currentNavScreen by viewModel.currentBottomNavScreen.collectAsState()

    val bottomBar: @Composable () -> Unit = {
        BottomBar(
            navController = navController,
            screens = screensInHomeFromBottomNav,
            currentNavScreen = (currentNavScreen as Screens.BottomNavScreens).route
        )
    }

    Scaffold(
        topBar = {
        },
        bottomBar = {
            bottomBar()
        },
        content = { padding ->
            Column(modifier = Modifier.padding(padding)) {
                NavigationHost(navController = navController, viewModel = viewModel)
            }
        },
        scaffoldState = scaffoldState,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecipeSearcherTheme() {
        AppScaffold()
    }
}