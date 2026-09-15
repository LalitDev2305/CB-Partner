package com.carbroz.partner.feature.splash.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.carbroz.partner.feature.splash.SplashIntent
import com.carbroz.partner.feature.splash.SplashStore

@Composable
fun SplashRoute() {
    val store = remember { SplashStore() }
    val state by store.state.collectAsState()

    LaunchedEffect(Unit) {
        store.dispatch(SplashIntent.Started)
    }

    SplashScreen(state = state)
}
