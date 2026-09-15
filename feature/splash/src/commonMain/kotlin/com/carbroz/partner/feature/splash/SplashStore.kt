package com.carbroz.partner.feature.splash

import com.carbroz.partner.core.mvi.BaseStore

class SplashStore : BaseStore<SplashState, SplashIntent, SplashEffect>(
    initialState = SplashState(),
    reducer = SplashReducer,
)
