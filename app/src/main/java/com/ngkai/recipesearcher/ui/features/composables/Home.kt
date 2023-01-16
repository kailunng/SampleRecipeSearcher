package com.ngkai.recipesearcher.ui.features.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ngkai.recipesearcher.ui.components.buttons.PrimaryButton
import com.ngkai.recipesearcher.ui.components.navigation.Screens
import com.ngkai.recipesearcher.ui.components.title.GreetingTitle
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.features.viewmodels.HomeViewModel
import com.ngkai.recipesearcher.ui.theme.MyTheme

@Composable
fun Home(viewModel: RecipeAppViewModel, ) {
    viewModel.setCurrentBottomNavScreen(Screens.BottomNavScreens.Home)
    val homeViewModel: HomeViewModel = viewModel()
    Column(
        modifier = Modifier.semantics { contentDescription = "Home Screen" }
    ){
        GreetingTitle(modifier = Modifier, text = "My Recipes")
        PrimaryButton(modifier = Modifier.padding(MyTheme.sizes.thirtyTwoDp), onClick = { /*TODO*/ }, text = "Add a recipe")
        Text(
            modifier = Modifier.semantics { testTag = "text1" },
            text = "Hello World"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    val viewModel: RecipeAppViewModel = viewModel()
    Home(viewModel)
}