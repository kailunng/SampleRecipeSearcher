package com.ngkai.recipesearcher.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

@Immutable
data class MyShapes internal constructor(
    val ToastCornerRadius: Shape = RoundedCornerShape(5.dp),
    val ButtonCornerRadius: Shape = RoundedCornerShape(5.dp),
    val RoundCornerRadius: Shape = RoundedCornerShape(5.dp),
    val CardCornerRadius: Shape = RoundedCornerShape(5.dp),
    val CardCornerRadiusSecondary: Shape = RoundedCornerShape(20.dp),
    val TileCornerRadius: Shape = RoundedCornerShape(20.dp)
)