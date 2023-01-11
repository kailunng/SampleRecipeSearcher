package com.ngkai.recipesearcher.ui.components.card

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ngkai.recipesearcher.data.models.Recipe
import com.ngkai.recipesearcher.ui.features.RecipeAppViewModel
import com.ngkai.recipesearcher.ui.features.composables.Home
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun RecipeItem(recipe: Recipe) {
    Row {
        Column {
            Text(text = recipe.name, style = typography.h6)
            CoilImage(
                imageModel = { recipe.thumbnail },
                modifier = Modifier,
                // shows an error text message when request failed.
                failure = {
                    Text(text = "image request failed.")
                })
            Text(text = recipe.description?: "", style = typography.caption)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeItemPreview() {
    RecipeItem(Recipe(0,20,10,"Butterscotch Cookies", "", 3, "Delicious Cookies", 30))
}