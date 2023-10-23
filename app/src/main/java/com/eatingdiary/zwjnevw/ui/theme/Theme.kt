package com.eatingdiary.zwjnevw.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.obfuscation.obf
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Arsenic,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Arsenic,
    secondary = Teal200,
    surface = BrightGray,
    onError = PermanentGeraniumLake,
    onSurface = Arsenic,
    background = Color.White
)

@Composable
fun TrackItTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val systemUiController = rememberSystemUiController()

    val colors: Colors

    if (darkTheme){
        colors = DarkColorPalette
        if (obf()) systemUiController.setSystemBarsColor(
            color = colors.background
        )
        systemUiController.setNavigationBarColor(
            color = colors.primaryVariant
        )
    }
    else {
        colors = LightColorPalette
        if (obf()) systemUiController.setSystemBarsColor(
            color = colors.background
        )
        systemUiController.setStatusBarColor(
            color = colors.primaryVariant
        )
        if (obf()) systemUiController.setNavigationBarColor(
            color = colors.primaryVariant
        )
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

@Composable
fun ChartsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        shapes = shapes,
        content = content
    )
}