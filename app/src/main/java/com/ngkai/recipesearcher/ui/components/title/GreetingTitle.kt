package com.ngkai.recipesearcher.ui.components.title

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.ngkai.recipesearcher.R
import com.ngkai.recipesearcher.ui.theme.MyTheme

@Composable
fun GreetingTitle(modifier: Modifier, text: String) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(MyTheme.colors.backgroundEvening),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = Modifier.padding(MyTheme.sizes.twentyFourDp, MyTheme.sizes.twelveDp, MyTheme.sizes.zeroDp, MyTheme.sizes.twelveDp)
                .weight(1f),
            text = text,
            style = MyTheme.typography.heading2,
            color = MyTheme.colors.textPrimaryInverse
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingTitlePreview() {
    GreetingTitle(
        modifier = Modifier,
        text = stringResource(id = R.string.app_name)
    )
}