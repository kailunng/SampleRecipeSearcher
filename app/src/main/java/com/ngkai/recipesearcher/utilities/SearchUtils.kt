package com.ngkai.recipesearcher.utilities

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import com.ngkai.recipesearcher.data.models.Recipe

@Stable
class SearchState(
    query: TextFieldValue,
    focused: Boolean,
    searching: Boolean,
    searchResults: List<Recipe?>
) {
    var query by mutableStateOf(query)
    var focused by mutableStateOf(focused)
    var searching by mutableStateOf(searching)
    var searchResults by mutableStateOf(searchResults)

    override fun toString(): String {
        return "State query: $query, focused: $focused, searching: $searching " +
                "searchResults: ${searchResults.size}"
    }
}