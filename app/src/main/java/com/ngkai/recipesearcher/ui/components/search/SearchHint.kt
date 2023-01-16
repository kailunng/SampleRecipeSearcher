package com.ngkai.recipesearcher.ui.components.search

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.ui.theme.MyTheme

@Composable
fun SearchHint(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .then(modifier)

    ) {
        Text(
            color = MyTheme.colors.textPrimary,
            text = stringResource(id = R.string.search_recipe),
        )
    }
}