package com.ngkai.recipesearcher.data.persistence.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "recipe_table")
data class RecipeEntity(

    @PrimaryKey
    @ColumnInfo(name="id")
    val id: Int,

    @ColumnInfo(name="cook_time")
    val cookTime: Int,

    @ColumnInfo(name="description")
    val description: String?,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="preparation_time")
    val prepTime: Int,

    @ColumnInfo(name="thumbnail")
    val thumbnail: String?,

    @ColumnInfo(name="total_time")
    val totalTime: Int,

    @ColumnInfo(name="serving_number")
    val servingNumber: Int

): Parcelable