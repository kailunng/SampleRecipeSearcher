package com.ngkai.recipesearcher.utilities

import java.util.concurrent.TimeUnit

object Constants {

    object Api {
        const val AUTHORIZE = "authorize"
        const val TOKEN = "token"
        const val BASE_URL = "https://tasty.p.rapidapi.com/"
        const val API_HOST = "tasty.p.rapidapi.com"
        const val LIST = "recipes/list"
    }

    object Data {
        const val DATABASE_NAME = "database"
    }

    object Error {
        const val UNKNOWN_ERROR = "Unknown Error"
    }

    object Route {
        const val NO_ROUTE = ""
        const val HOME = "home"
        const val RECIPES = "recipes"
    }

    object SharedPref {
        const val SHARED_PREFERENCES = "shared_preferences"
    }

    // Shared preference preference constants
    object Pref {
        const val PREF_RATE_LIMITER = "pref_rate_limiter"
    }

    object RateLimiter {
        const val TIMEOUT = 24
        val TIME_UNIT = TimeUnit.HOURS
        const val RECIPE_RATE_LIMITER = "recipeRateLimiter"
    }
}