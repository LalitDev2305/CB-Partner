package com.carbroz.partner.feature.splash

import com.carbroz.partner.core.mvi.UiEffect
import com.carbroz.partner.core.mvi.UiIntent
import com.carbroz.partner.core.mvi.UiState

data class SplashState(
    val initialized: Boolean = false,
) : UiState

sealed interface SplashIntent : UiIntent {
    data object Started : SplashIntent
}

sealed interface SplashEffect : UiEffect
