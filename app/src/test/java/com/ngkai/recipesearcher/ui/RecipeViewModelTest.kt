package com.ngkai.recipesearcher.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.ngkai.recipesearcher.data.models.Recipe
import com.ngkai.recipesearcher.data.repository.RecipeRepository
import com.ngkai.recipesearcher.ui.features.viewmodels.RecipeViewModel
import com.ngkai.recipesearcher.utilities.MainCoroutineRule
import com.ngkai.recipesearcher.utilities.network.Resource
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.kotlin.*

class RecipeViewModelTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private val repository = mock<RecipeRepository>()

    private val viewModel by lazy { RecipeViewModel(repository) }

    @Before
    fun setup() {
        repository.stub {
            on { getRecipe(any()) } doAnswer {
                flow {
                    Resource.Success(
                        listOf(
                            Recipe(
                                id = 1,
                                cookTime = 20,
                                prepTime = 10,
                                name = "Bacon",
                                thumbnail = "http://bacon.image.com",
                                servingNumber = 4,
                                description = "Delicious Bacon",
                                totalTime = 30
                            )
                        )
                    )
                }
            }
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `test get recipe success`() = runTest {
        repository.stub {
            on { getRecipe("Bacon") } doReturn
                flow {
                    emit(Resource.Success(
                        listOf(
                            Recipe(
                                id = 1,
                                cookTime = 20,
                                prepTime = 10,
                                name = "Bacon",
                                thumbnail = "http://bacon.image.com",
                                servingNumber = 4,
                                description = "Delicious Bacon",
                                totalTime = 30
                            )
                        )
                    )
                )
                }
        }
        viewModel.getRecipe("Bacon")
        advanceUntilIdle()

        assertEquals(listOf(
            Recipe(
                id = 1,
                cookTime = 20,
                prepTime = 10,
                name = "Bacon",
                thumbnail = "http://bacon.image.com",
                servingNumber = 4,
                description = "Delicious Bacon",
                totalTime = 30
            )
        ), viewModel.recipeList.value)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `test loading recipe no data`() = runTest {
        repository.stub {
            on { getRecipe("Bacon") } doReturn
                    flow {
                        emit(Resource.Loading())
                    }
        }
        viewModel.getRecipe("Bacon")
        advanceUntilIdle()

        assertEquals(mutableListOf<Recipe>(), viewModel.recipeList.value)
        assertEquals(true, viewModel.isLoading.value)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `test loading recipe from cache`() = runTest {
        repository.stub {
            on { getRecipe("Bacon") } doReturn
                    flow {
                        emit(Resource.Loading(
                            listOf(
                                Recipe(
                                    id = 1,
                                    cookTime = 20,
                                    prepTime = 10,
                                    name = "Bacon",
                                    thumbnail = "http://bacon.image.com",
                                    servingNumber = 4,
                                    description = "Delicious Bacon",
                                    totalTime = 30
                                )
                            )
                        )
                        )
                    }
        }
        viewModel.getRecipe("Bacon")
        advanceUntilIdle()

        assertEquals(listOf(
            Recipe(
                id = 1,
                cookTime = 20,
                prepTime = 10,
                name = "Bacon",
                thumbnail = "http://bacon.image.com",
                servingNumber = 4,
                description = "Delicious Bacon",
                totalTime = 30
            )
        ), viewModel.recipeList.value)
        assertEquals(false, viewModel.isLoading.value)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun `test get recipe fail`() = runTest {
        repository.stub {
            on { getRecipe("Bacon") } doReturn
                    flow {
                        emit(Resource.Error(java.lang.Exception()))
                    }
        }
        viewModel.getRecipe("Bacon")
        advanceUntilIdle()

        assertEquals("Unknown Error", viewModel.error.value)
        assertEquals(false, viewModel.isLoading.value)
    }
}