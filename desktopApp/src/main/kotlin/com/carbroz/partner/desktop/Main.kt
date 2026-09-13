package com.carbroz.partner.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.carbroz.partner.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CarBroz Partner",
    ) {
        App()
    }
}
