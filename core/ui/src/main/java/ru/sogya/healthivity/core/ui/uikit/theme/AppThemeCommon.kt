package ru.sogya.healthivity.core.ui.uikit.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp


data class HealthivityColors(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val accent: Color,
    val white: Color,
    val disable: Color,
    val secondaryText: Color,
    val accentDisabled: Color
)

data class HealthivityTypography(
    val heading: TextStyle,
    val regular: TextStyle,
    val regularBold: TextStyle,
    val regularMedium: TextStyle
)

data class HealthivityShape(
    val padding: Dp,
    val cornersStyle: Shape
)

object HealthivityTheme {
    internal val colors: HealthivityColors
        @Composable
        internal get() = LocalHealthivityColors.current

    internal val typography: HealthivityTypography
        @Composable
        internal get() = LocalHealthivityTypography.current

    internal val shape: HealthivityShape
        @Composable
        internal get() = LocalHealthivityShape.current
}

enum class HealthivitySize {
    Small, Medium, Big
}

enum class HealthivityCorners {
    Flat, Rounded
}


internal val LocalHealthivityColors = staticCompositionLocalOf<HealthivityColors>{
    error("No colors provided")
}

internal val LocalHealthivityTypography = staticCompositionLocalOf<HealthivityTypography> {
    error("No fonts provided")
}

internal val LocalHealthivityShape = staticCompositionLocalOf<HealthivityShape> {
    error("No shapes provided")
}