package com.ngkai.recipesearcher.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.ngkai.recipesearcher.data.remote.api.RecipeApi
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.buffer
import okio.source
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@RunWith(JUnit4::class)
class ApiTest {
    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var api: RecipeApi
    private lateinit var mockWebServer: MockWebServer

    @Before
    fun createService() {
        mockWebServer = MockWebServer()
        api = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RecipeApi::class.java)
    }

    @After
    fun stopService() {
        mockWebServer.shutdown()
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun getRecipes() = runTest {
        enqueueResponse("response.json")
        val result = api.getRecipe(0, 10, tags = "", "")
        val request = mockWebServer.takeRequest()

        Assert.assertEquals(request.path, "/recipes/list?from=0&size=10&tags=&q=")

        Assert.assertEquals(
            result.results[0].name,
            "How To Make Classic French Toast"
        )
        Assert.assertEquals(
            result.results[1].name,
            "Easy Beef Hand Pies"
        )
        Assert.assertEquals(
            result.results[2].name,
            "Instant Pot Texas Smoked Brisket Chowder"
        )
    }

    private fun enqueueResponse(fileName: String, headers: Map<String, String> = emptyMap()) {
        val source = javaClass.classLoader!!
            .getResourceAsStream(fileName)
            .source()
            .buffer()
        val mockResponse = MockResponse()
        for ((key, value) in headers) {
            mockResponse.addHeader(key, value)
        }
        mockWebServer.enqueue(
            mockResponse
                .setBody(source.readString(Charsets.UTF_8))
        )
    }
}