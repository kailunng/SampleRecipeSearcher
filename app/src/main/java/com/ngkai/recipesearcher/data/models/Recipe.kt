package com.ngkai.recipesearcher.data.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe (
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "cook_time")
    val cookTime : Int,
    @ColumnInfo(name = "preparation_time")
    val prepTime : Int,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "thumbnail")
    val thumbnail: String,
    @ColumnInfo(name = "serving_number")
    val servingNumber: Int,
    @ColumnInfo(name = "description")
    val description: String?,
    @ColumnInfo(name = "total_time")
    val totalTime: Int,
): Parcelable