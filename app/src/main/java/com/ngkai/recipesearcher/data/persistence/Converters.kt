package com.ngkai.recipesearcher.data.persistence

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ngkai.recipesearcher.data.remote.responses.dto.Instruction
import com.ngkai.recipesearcher.data.remote.responses.dto.Nutrition
import com.ngkai.recipesearcher.data.remote.responses.dto.Tag
import com.ngkai.recipesearcher.data.remote.responses.dto.UserRatings
import java.lang.reflect.Type

object Converters {
    @TypeConverter
    @JvmStatic
    fun fromString(value: String?): MutableList<String> {
        return if (value != "null") {
            val listType =
                object : TypeToken<ArrayList<String?>?>() {}.type
            Gson().fromJson(value, listType)
        } else {
            mutableListOf()
        }
    }

    @TypeConverter
    @JvmStatic
    fun fromInt(value: String?): MutableList<Int> {
        return if (value != "null") {
            val listType =
                object : TypeToken<ArrayList<Int?>?>() {}.type
            Gson().fromJson(value, listType)
        } else {
            mutableListOf()
        }
    }

    @TypeConverter
    @JvmStatic
    fun fromList(list: MutableList<String?>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }

    @TypeConverter
    @JvmStatic
    fun fromIntList(list: MutableList<Int?>?): String {
        val gson = Gson()
        return gson.toJson(list)
    }

    @TypeConverter
    fun fromListToString(list: List<*>): String {
        val type = object: TypeToken<List<*>>() {}.type
        return Gson().toJson(list, type)
    }

    @TypeConverter
    fun toInstruction(dataString: String?): List<Instruction> {
        if(dataString == null || dataString.isEmpty()) {
            return mutableListOf()
        }
        val type: Type = object : TypeToken<List<Instruction>>() {}.type
        return Gson().fromJson(dataString, type)
    }

    @TypeConverter
    fun toTag(dataString: String?): List<Tag> {
        if(dataString == null || dataString.isEmpty()) {
            return mutableListOf()
        }
        val type: Type = object : TypeToken<List<Instruction>>() {}.type
        return Gson().fromJson(dataString, type)
    }

    @TypeConverter
    fun toNutrition(dataString: String?): Nutrition {
        val type: Type = object : TypeToken<Nutrition>() {}.type
        return Gson().fromJson(dataString, type)
    }

    @TypeConverter
    fun toUserRatings(dataString: String?): UserRatings {
        val type: Type = object : TypeToken<UserRatings>() {}.type
        return Gson().fromJson(dataString, type)
    }
}