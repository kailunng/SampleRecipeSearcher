package com.ngkai.recipesearcher.ui.features

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ngkai.recipesearcher.ui.theme.RecipeSearcherTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ngkai.recipesearcher.ui.components.navigation.AppScaffold

@Composable
fun RecipeApp(viewModel: RecipeAppViewModel = viewModel()) {
    Box {
        AppScaffold()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecipeSearcherTheme {
        RecipeApp()
    }
}