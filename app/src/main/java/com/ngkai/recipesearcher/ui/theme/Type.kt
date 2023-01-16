package com.ngkai.recipesearcher.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ngkai.recipesearcher.R

private val TWCenMT = FontFamily(
    Font(R.font.twcenmtstd, FontWeight.Normal),
    Font(R.font.twcenmtstdbold, FontWeight.Bold)
)

@Immutable
data class MyTypography internal constructor(
    val title1: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 64.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 72.sp
    ),
    val title2: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 56.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 64.sp
    ),

    val heading1: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 40.sp
    ),
    val heading2: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 32.sp
    ),
    val heading3: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp
    ),
    val heading4: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp
    ),
    val heading5: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp
    ),
    val heading6: TextStyle = TextStyle(
        fontFamily = TWCenMT,
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 18.sp
    ),
    val subheading1: TextStyle = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 28.sp
    ),
    val text1: TextStyle = TextStyle(
        fontSize = 32.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 28.sp
    ),
    val body1: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 24.sp
    ),
    val body1Strong: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp
    ),
    val body2: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 20.sp
    ),
    val body2Strong: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp
    ),
    val body3: TextStyle = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 16.sp
    ),
    val body3Strong: TextStyle = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 16.sp
    ),
    val link1: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp
    ),
    val link1Hover: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp
    ),
    val link2: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp
    ),
    val link2Hover: TextStyle = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 20.sp
    ),
    val label1: TextStyle = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 24.sp
    ),
    val label2: TextStyle = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 16.sp
    ),
    val materialTypography: Typography = Typography(
        body1 = body1
    )
)