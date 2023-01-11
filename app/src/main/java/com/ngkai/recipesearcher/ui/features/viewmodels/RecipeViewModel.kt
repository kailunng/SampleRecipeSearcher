package com.ngkai.recipesearcher.ui.features.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ngkai.recipesearcher.data.models.Recipe
import com.ngkai.recipesearcher.data.repository.RecipeRepository
import com.ngkai.recipesearcher.utilities.Constants
import com.ngkai.recipesearcher.utilities.network.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    repository: RecipeRepository
) : ViewModel() {
    private val recipes = repository.getRecipe(query = "Cookie")

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean>
        get() = _isLoading.asStateFlow()

    private val _recipeList = MutableStateFlow<List<Recipe?>>(emptyList())
    val recipeList: StateFlow<List<Recipe?>>
        get() = _recipeList.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?>
        get() = _error.asStateFlow()

    init {
        load()
    }

    private fun load() {
        viewModelScope.launch {
            recipes.collect {
                when (it) {
                    is Resource.Loading -> {
                        when (it.data) {
                            null -> {
                                _isLoading.value = true
                            }
                            else -> {
                                _recipeList.value = it.data
                            }
                        }
                    }
                    is Resource.Success -> {
                        _recipeList.value = it.data?: emptyList()
                    }
                    is Resource.Error -> {
                        _isLoading.value = false
                        _error.value = it.error?.localizedMessage?: Constants.Error.UNKNOWN_ERROR
                    }
                }
            }
        }
    }
}