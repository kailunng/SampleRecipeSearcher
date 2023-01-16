package com.ngkai.recipesearcher.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.*

@Composable
fun RecipeSearcherTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colors: MyColorPalette = if (darkTheme) darkColorPalette() else lightColorPalette(),
    typography: MyTypography = MyTheme.typography,
    shapes: MyShapes = MyTheme.shape,
    sizes: MySize = MyTheme.sizes,
    content: @Composable () -> Unit
) {
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography,
        LocalShapes provides shapes,
        LocalSizes provides sizes
    ) {
        content()
    }
}

object MyTheme {
    val colors: MyColorPalette
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: MyTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shape: MyShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val sizes: MySize
        @Composable
        @ReadOnlyComposable
        get() = LocalSizes.current
}

internal val LocalColors = staticCompositionLocalOf { lightColorPalette() }

internal val LocalTypography = staticCompositionLocalOf { MyTypography() }

internal val LocalShapes = staticCompositionLocalOf { MyShapes() }

internal val LocalSizes = staticCompositionLocalOf { MySize() }