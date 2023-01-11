package com.ngkai.recipesearcher.ui.components.navigation

import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.utilities.Constants

sealed class Screens(val route: String, val title: Int, val alternateTitle: Int? = null) {

    sealed class BottomNavScreens(
        route: String,
        title: Int,
        val selectedIcon: Int,
        val unSelectedIcon: Int,
        alternateTitle: Int? = null
    ) : Screens(
        route,
        title,
        alternateTitle
    ) {
        object Home : BottomNavScreens(Constants.Route.HOME, R.string.home, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground)
        object Recipes : BottomNavScreens(Constants.Route.RECIPES, R.string.recipes, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_foreground)
    }

}

val Screens.altTitle get() = alternateTitle ?: title

val screensInHomeFromBottomNav = listOf(
    Screens.BottomNavScreens.Home,
    Screens.BottomNavScreens.Recipes
)