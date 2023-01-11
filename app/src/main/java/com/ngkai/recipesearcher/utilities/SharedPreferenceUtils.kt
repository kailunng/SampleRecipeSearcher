package com.ngkai.recipesearcher.utilities

import android.content.Context
import android.content.SharedPreferences
import android.util.ArrayMap
import androidx.core.content.edit
import org.json.JSONObject

object SharedPreferenceUtils {
    lateinit var sharedPref: SharedPreferences

    /**
     * Initialises shared preferences with activity [context]
     */
    fun sharedPreferencesInit(context: Context) {
        sharedPref = context.getSharedPreferences(
            Constants.SharedPref.SHARED_PREFERENCES,
            Context.MODE_PRIVATE
        )
    }

    /**
     * Clears shared preferences
     */
    fun clearSharedPreferences() {
        sharedPref.edit {
            clear()
        }
    }


    fun loadMap(mapKey: String): MutableMap<String, Long> {
        val outputMap: MutableMap<String, Long> = ArrayMap()
        val jsonString = sharedPref.getString(mapKey, JSONObject().toString())
        val jsonObject = JSONObject(jsonString!!)
        val keysItr = jsonObject.keys()
        while (keysItr.hasNext()) {
            val key = keysItr.next()
            outputMap[key] = jsonObject.get(key).toString().toLong()
        }
        return outputMap
    }

    fun saveMap(inputMap: MutableMap<String, Long>, mapKey: String) {
        val jsonObject = JSONObject(inputMap as Map<*, *>)
        val jsonString = jsonObject.toString()
        val editor: SharedPreferences.Editor = sharedPref.edit()
        editor.remove(mapKey).apply()
        editor.putString(mapKey, jsonString).apply()
    }
}