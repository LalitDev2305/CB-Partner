package com.carbroz.partner.feature.splash.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.carbroz.partner.feature.splash.SplashState

@Composable
fun SplashScreen(
    state: SplashState,
) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = "CarBroz Partner",
                style = MaterialTheme.typography.headlineMedium,
            )
            Text(
                text = if (state.initialized) "Splash Screen" else "Starting...",
                style = MaterialTheme.typography.bodyLarge,
            )
        }
    }
}
