package com.example.jetpack_compose.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.democompose.R


val DancingScript = FontFamily(
    listOf(
        Font(
            R.font.dancingscript_regular,
            weight = FontWeight.Normal
        ),
        Font(
            R.font.dancingscript_bold,
            weight = FontWeight.Bold
        ),
        Font(
            R.font.dancingscript_medium,
            weight = FontWeight.Medium
        ),
        Font(
            R.font.dancingscript_medium,
            weight = FontWeight.SemiBold
        ),
    )
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = DancingScript,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = DancingScript,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = DancingScript,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val SilkscreenFamily = FontFamily(
    listOf(
        Font(
            R.font.silkscreen_regular,
            weight = FontWeight.Normal
        ),
        Font(
            R.font.silkscreen_bold,
            weight = FontWeight.Bold
        )
    )
)

val TekoFamily = FontFamily(
    listOf(
        Font(
            R.font.teko_regular,
            weight = FontWeight.Normal
        ),
        Font(
            R.font.teko_bold,
            weight = FontWeight.Bold
        ),
        Font(
            R.font.teko_semibold,
            weight = FontWeight.SemiBold
        ),
        Font(
            R.font.teko_light,
            weight = FontWeight.Light
        ),
        Font(
            R.font.teko_medium,
            weight = FontWeight.Medium
        ),
    )
)