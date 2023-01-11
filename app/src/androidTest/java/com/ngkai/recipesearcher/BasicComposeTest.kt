package com.ngkai.recipesearcher

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.features.composables.Home
import com.ngkai.recipesearcher.ui.theme.RecipeSearcherTheme
import org.junit.Rule
import org.junit.Test

class BasicComposeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testHomePage() {
        composeTestRule.setContent {
            RecipeSearcherTheme {
                Home(viewModel = RecipeAppViewModel())
            }
        }
        composeTestRule
                .onNodeWithContentDescription("Home Screen")
            .assertIsDisplayed()
        composeTestRule.onNodeWithText("Hello World").assertIsDisplayed()

        composeTestRule.onNodeWithText("Hello World").performClick()
    }

}