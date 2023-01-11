package com.ngkai.recipesearcher

import android.app.Application
import com.ngkai.recipesearcher.utilities.SharedPreferenceUtils
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App: Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialise shared preferences
        SharedPreferenceUtils.sharedPreferencesInit(this)

        // Set up Timber logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }
}