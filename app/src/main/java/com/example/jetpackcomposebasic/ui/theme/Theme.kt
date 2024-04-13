package com.example.reply.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import com.example.jetpackcomposebasic.ui.theme.android_dark_background
import com.example.jetpackcomposebasic.ui.theme.android_dark_error
import com.example.jetpackcomposebasic.ui.theme.android_dark_errorContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_inverseOnSurface
import com.example.jetpackcomposebasic.ui.theme.android_dark_inversePrimary
import com.example.jetpackcomposebasic.ui.theme.android_dark_inverseSurface
import com.example.jetpackcomposebasic.ui.theme.android_dark_onBackground
import com.example.jetpackcomposebasic.ui.theme.android_dark_onError
import com.example.jetpackcomposebasic.ui.theme.android_dark_onErrorContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_onPrimary
import com.example.jetpackcomposebasic.ui.theme.android_dark_onPrimaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_onSecondary
import com.example.jetpackcomposebasic.ui.theme.android_dark_onSecondaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_onSurface
import com.example.jetpackcomposebasic.ui.theme.android_dark_onSurfaceVariant
import com.example.jetpackcomposebasic.ui.theme.android_dark_onTertiary
import com.example.jetpackcomposebasic.ui.theme.android_dark_onTertiaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_outline
import com.example.jetpackcomposebasic.ui.theme.android_dark_outlineVariant
import com.example.jetpackcomposebasic.ui.theme.android_dark_primary
import com.example.jetpackcomposebasic.ui.theme.android_dark_primaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_scrim
import com.example.jetpackcomposebasic.ui.theme.android_dark_secondary
import com.example.jetpackcomposebasic.ui.theme.android_dark_secondaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_dark_surface
import com.example.jetpackcomposebasic.ui.theme.android_dark_surfaceTint
import com.example.jetpackcomposebasic.ui.theme.android_dark_surfaceVariant
import com.example.jetpackcomposebasic.ui.theme.android_dark_tertiary
import com.example.jetpackcomposebasic.ui.theme.android_dark_tertiaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_background
import com.example.jetpackcomposebasic.ui.theme.android_light_error
import com.example.jetpackcomposebasic.ui.theme.android_light_errorContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_inverseOnSurface
import com.example.jetpackcomposebasic.ui.theme.android_light_inversePrimary
import com.example.jetpackcomposebasic.ui.theme.android_light_inverseSurface
import com.example.jetpackcomposebasic.ui.theme.android_light_onBackground
import com.example.jetpackcomposebasic.ui.theme.android_light_onError
import com.example.jetpackcomposebasic.ui.theme.android_light_onErrorContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_onPrimary
import com.example.jetpackcomposebasic.ui.theme.android_light_onPrimaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_onSecondary
import com.example.jetpackcomposebasic.ui.theme.android_light_onSecondaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_onSurface
import com.example.jetpackcomposebasic.ui.theme.android_light_onSurfaceVariant
import com.example.jetpackcomposebasic.ui.theme.android_light_onTertiary
import com.example.jetpackcomposebasic.ui.theme.android_light_onTertiaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_outline
import com.example.jetpackcomposebasic.ui.theme.android_light_outlineVariant
import com.example.jetpackcomposebasic.ui.theme.android_light_primary
import com.example.jetpackcomposebasic.ui.theme.android_light_primaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_scrim
import com.example.jetpackcomposebasic.ui.theme.android_light_secondary
import com.example.jetpackcomposebasic.ui.theme.android_light_secondaryContainer
import com.example.jetpackcomposebasic.ui.theme.android_light_surface
import com.example.jetpackcomposebasic.ui.theme.android_light_surfaceTint
import com.example.jetpackcomposebasic.ui.theme.android_light_surfaceVariant
import com.example.jetpackcomposebasic.ui.theme.android_light_tertiary
import com.example.jetpackcomposebasic.ui.theme.android_light_tertiaryContainer


private val LightColors = lightColorScheme(
    primary = android_light_primary,
    onPrimary = android_light_onPrimary,
    primaryContainer = android_light_primaryContainer,
    onPrimaryContainer = android_light_onPrimaryContainer,
    secondary = android_light_secondary,
    onSecondary = android_light_onSecondary,
    secondaryContainer = android_light_secondaryContainer,
    onSecondaryContainer = android_light_onSecondaryContainer,
    tertiary = android_light_tertiary,
    onTertiary = android_light_onTertiary,
    tertiaryContainer = android_light_tertiaryContainer,
    onTertiaryContainer = android_light_onTertiaryContainer,
    error = android_light_error,
    errorContainer = android_light_errorContainer,
    onError = android_light_onError,
    onErrorContainer = android_light_onErrorContainer,
    background = android_light_background,
    onBackground = android_light_onBackground,
    surface = android_light_surface,
    onSurface = android_light_onSurface,
    surfaceVariant = android_light_surfaceVariant,
    onSurfaceVariant = android_light_onSurfaceVariant,
    outline = android_light_outline,
    inverseOnSurface = android_light_inverseOnSurface,
    inverseSurface = android_light_inverseSurface,
    inversePrimary = android_light_inversePrimary,
    surfaceTint = android_light_surfaceTint,
    outlineVariant = android_light_outlineVariant,
    scrim = android_light_scrim,
)


private val DarkColors = darkColorScheme(
    primary = android_dark_primary,
    onPrimary = android_dark_onPrimary,
    primaryContainer = android_dark_primaryContainer,
    onPrimaryContainer = android_dark_onPrimaryContainer,
    secondary = android_dark_secondary,
    onSecondary = android_dark_onSecondary,
    secondaryContainer = android_dark_secondaryContainer,
    onSecondaryContainer = android_dark_onSecondaryContainer,
    tertiary = android_dark_tertiary,
    onTertiary = android_dark_onTertiary,
    tertiaryContainer = android_dark_tertiaryContainer,
    onTertiaryContainer = android_dark_onTertiaryContainer,
    error = android_dark_error,
    errorContainer = android_dark_errorContainer,
    onError = android_dark_onError,
    onErrorContainer = android_dark_onErrorContainer,
    background = android_dark_background,
    onBackground = android_dark_onBackground,
    surface = android_dark_surface,
    onSurface = android_dark_onSurface,
    surfaceVariant = android_dark_surfaceVariant,
    onSurfaceVariant = android_dark_onSurfaceVariant,
    outline = android_dark_outline,
    inverseOnSurface = android_dark_inverseOnSurface,
    inverseSurface = android_dark_inverseSurface,
    inversePrimary = android_dark_inversePrimary,
    surfaceTint = android_dark_surfaceTint,
    outlineVariant = android_dark_outlineVariant,
    scrim = android_dark_scrim,
)

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (!useDarkTheme) {
        LightColors
    } else {
        DarkColors
    }

    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}