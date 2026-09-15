package com.carbroz.partner.feature.splash

import com.carbroz.partner.core.mvi.Reducer

object SplashReducer : Reducer<SplashState, SplashIntent> {
    override fun reduce(state: SplashState, intent: SplashIntent): SplashState =
        when (intent) {
            SplashIntent.Started -> state.copy(initialized = true)
        }
}
