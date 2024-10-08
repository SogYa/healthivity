package ru.sogya.healthivity.core.ui.uikit.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.sogya.healthivity.core.ui.R

@Composable
internal fun AppTheme(
    textSize: HealthivitySize = HealthivitySize.Medium,
    paddingSize: HealthivitySize = HealthivitySize.Medium,
    corners: HealthivityCorners = HealthivityCorners.Rounded,
    content: @Composable () -> Unit
) {

    val colors = basePalette

    val typography = HealthivityTypography(
        heading = TextStyle(
            fontSize = when (textSize) {
                HealthivitySize.Small -> 18.sp
                HealthivitySize.Medium -> 20.sp
                HealthivitySize.Big -> 22.sp
            },
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.roboto_regular))
        ),
        regular = TextStyle(
            fontSize = when (textSize) {
                HealthivitySize.Small -> 12.sp
                HealthivitySize.Medium -> 14.sp
                HealthivitySize.Big -> 16.sp
            },
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily(Font(R.font.roboto_regular))
        ),
        regularBold = TextStyle(
            fontSize = when (textSize) {
                HealthivitySize.Small -> 12.sp
                HealthivitySize.Medium -> 14.sp
                HealthivitySize.Big -> 16.sp
            },
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily(Font(R.font.roboto_bold))
        ),
        regularMedium = TextStyle(
            fontSize = when (textSize) {
                HealthivitySize.Small -> 12.sp
                HealthivitySize.Medium -> 14.sp
                HealthivitySize.Big -> 16.sp
            },
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily(Font(R.font.roboto_medium))
        )
    )

    val shapes = HealthivityShape(
        padding = when (paddingSize) {
            HealthivitySize.Small -> 12.dp
            HealthivitySize.Medium -> 16.dp
            HealthivitySize.Big -> 20.dp
        },
        cornersStyle = when (corners) {
            HealthivityCorners.Flat -> RoundedCornerShape(0.dp)
            HealthivityCorners.Rounded -> RoundedCornerShape(16.dp)
        }
    )

    CompositionLocalProvider(
        LocalHealthivityColors provides colors,
        LocalHealthivityTypography provides typography,
        LocalHealthivityShape provides shapes,
        content = content
    )
}

object AppTheme {
    val colors: HealthivityColors
        @Composable
        @ReadOnlyComposable
        get() = LocalHealthivityColors.current

    val typography: AppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalAppTypography.current
}

//
//@Composable
//fun AppTheme(
//    useDarkTheme: Boolean = true,
//    typography: AppTypography = AppTheme.typography,
//    content: @Composable () -> Unit,
//) {
//    val colors = basePalette
//    MaterialTheme(
//        colorScheme = debugColors(),
//        typography = MaterialTypography,
//    ) {
//        CompositionLocalProvider(
//            LocalAppTypography provides typography,
//            LocalContentColor provides colors.darkBlue,
//            content = content,
//        )
//    }
//}
//
//object AppTheme {
//    val colors: AppColors
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalAppColors.current
//
//    val typography: AppTypography
//        @Composable
//        @ReadOnlyComposable
//        get() = LocalAppTypography.current
//}
//
//fun debugColors() = Colors(
//    primary = DebugColor,
//    primaryVariant = DebugColor,
//    secondary = DebugColor,
//    secondaryVariant = DebugColor,
//    background = DebugColor,
//    surface = DebugColor,
//    error = DebugColor,
//    onPrimary = DebugColor,
//    onSecondary = DebugColor,
//    onBackground = DebugColor,
//    onSurface = DebugColor,
//    onError = DebugColor,
//)
//
//private val DebugColor = Color.Magenta
