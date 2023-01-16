package com.ngkai.recipesearcher.ui.components.search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.input.TextFieldValue
import com.ngkai.recipesearcher.ui.theme.MyTheme

@Composable
fun SearchTextField(
    query: TextFieldValue,
    onQueryChange: (TextFieldValue) -> Unit,
    onSearchFocusChange: (Boolean) -> Unit,
    onClearQuery: () -> Unit,
    searching: Boolean,
    modifier: Modifier = Modifier
) {

    val focusRequester = remember { FocusRequester() }

    Surface(
        modifier = modifier
            .then(
                Modifier
                    .height(MyTheme.sizes.fiftySixDp)
                    .padding(
                        top = MyTheme.sizes.eightDp,
                        bottom = MyTheme.sizes.eightDp,
                        start = MyTheme.sizes.sixteenDp,
                        end = MyTheme.sizes.sixteenDp
                    )
            ),
        color = MyTheme.colors.backgroundSecondary,
        shape = MyTheme.shape.RoundCornerRadius,
    ) {

        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Box(
                contentAlignment = Alignment.CenterStart,
                modifier = modifier
            ) {

                if (query.text.isEmpty()) {
                    SearchHint(modifier.padding(start = MyTheme.sizes.twentyFourDp, end = MyTheme.sizes.eightDp))
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    BasicTextField(
                        value = query,
                        onValueChange = onQueryChange,
                        modifier = Modifier
                            .fillMaxHeight()
                            .weight(1f)
                            .onFocusChanged {
                                onSearchFocusChange(it.isFocused)
                            }
                            .focusRequester(focusRequester)
                            .padding(top = MyTheme.sizes.twelveDp, bottom = MyTheme.sizes.eightDp, start = MyTheme.sizes.twentyFourDp, end = MyTheme.sizes.eightDp),
                        singleLine = true
                    )

                    when {
                        searching && query.text.isNotEmpty() -> {
                            CircularProgressIndicator(
                                modifier = Modifier
                                    .padding(horizontal = MyTheme.sizes.eightDp)
                                    .size(MyTheme.sizes.thirtyTwoDp)
                            )
                        }
                        query.text.isNotEmpty() -> {
                            IconButton(onClick = onClearQuery) {
                                Icon(imageVector = Icons.Filled.Close, contentDescription = null)
                            }
                        }
                    }
                }
            }
        }
    }
}