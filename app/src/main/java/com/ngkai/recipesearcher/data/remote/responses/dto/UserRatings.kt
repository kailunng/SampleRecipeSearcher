package com.ngkai.recipesearcher.data.remote.responses.dto

data class UserRatings(
    val count_negative: Int,
    val count_positive: Int,
    val score: Double
)