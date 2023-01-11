package com.ngkai.recipesearcher.ui.features

import androidx.lifecycle.ViewModel
import com.ngkai.recipesearcher.ui.components.navigation.Screens
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RecipeAppViewModel : ViewModel() {

    private val _showBottomBar = MutableStateFlow(false)
    private val _currentBottomNavScreen = MutableStateFlow<Screens>(Screens.BottomNavScreens.Home)

    val showBottomBar: StateFlow<Boolean> = _showBottomBar
    val currentBottomNavScreen: StateFlow<Screens> = _currentBottomNavScreen

    fun setCurrentBottomNavScreen(screen: Screens) {
        _currentBottomNavScreen.value = screen
    }

}