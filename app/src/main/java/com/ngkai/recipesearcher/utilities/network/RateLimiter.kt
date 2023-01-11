package com.ngkai.recipesearcher.utilities.network

import android.os.SystemClock
import com.ngkai.recipesearcher.utilities.Constants
import com.ngkai.recipesearcher.utilities.SharedPreferenceUtils
import java.util.concurrent.TimeUnit

/**
 * Utility class that decides whether we should fetch some data or not.
 */
object RateLimiter {
    private var timestamps = SharedPreferenceUtils.loadMap(Constants.Pref.PREF_RATE_LIMITER)
    private val timeout = Constants.RateLimiter.TIME_UNIT.toMillis(Constants.RateLimiter.TIMEOUT.toLong())

    @Synchronized
    fun shouldFetch(key: String): Boolean {
        val lastFetched = timestamps[key]
        val now = now()
        if (lastFetched == null) {
            timestamps[key] = now
            SharedPreferenceUtils.saveMap(timestamps, Constants.Pref.PREF_RATE_LIMITER)
            return true
        }
        if (now - lastFetched > timeout) {
            timestamps[key] = now
            SharedPreferenceUtils.saveMap(timestamps, Constants.Pref.PREF_RATE_LIMITER)
            return true
        }
        return false
    }

    private fun now() = SystemClock.uptimeMillis()

    @Synchronized
    fun lastFetched(key: String): String {
        return if (timestamps[key] != null) {
            val millis = now() - timestamps[key]!!
            when {
                TimeUnit.MILLISECONDS.toHours(millis) > 1.toLong() -> {
                    String.format("%d hours ago",
                        TimeUnit.MILLISECONDS.toHours(millis)
                    )
                }
                TimeUnit.MILLISECONDS.toHours(millis) > 0.toLong()  -> {
                    String.format("%d hour ago",
                        TimeUnit.MILLISECONDS.toHours(millis)
                    )
                }
                TimeUnit.MILLISECONDS.toMinutes(millis) > 1.toLong()  -> {
                    String.format("%d minutes ago",
                        TimeUnit.MILLISECONDS.toMinutes(millis)
                    )
                }
                TimeUnit.MILLISECONDS.toMinutes(millis) > 0.toLong()  -> {
                    String.format("%d minute ago",
                        TimeUnit.MILLISECONDS.toMinutes(millis)
                    )
                }
                else -> {
                    "just now"
                }
            }
        } else {
            "just now"
        }
    }

    @Synchronized
    fun reset(key: String) {
        timestamps.remove(key)
    }
}