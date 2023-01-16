package com.ngkai.recipesearcher.ui.components.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.utilities.Constants

sealed class Screens(val route: String, val title: Int, val alternateTitle: Int? = null) {

    sealed class BottomNavScreens(
        route: String,
        title: Int,
        val selectedIcon: ImageVector,
        val unSelectedIcon: ImageVector,
        alternateTitle: Int? = null
    ) : Screens(
        route,
        title,
        alternateTitle
    ) {
        object Home : BottomNavScreens(Constants.Route.HOME, R.string.home, Icons.Default.Home, Icons.Default.Home)
        object Recipes : BottomNavScreens(Constants.Route.RECIPES, R.string.recipes, Icons.Default.AccountCircle, Icons.Default.AccountCircle)
    }

}

val Screens.altTitle get() = alternateTitle ?: title

val screensInHomeFromBottomNav = listOf(
    Screens.BottomNavScreens.Home,
    Screens.BottomNavScreens.Recipes
)