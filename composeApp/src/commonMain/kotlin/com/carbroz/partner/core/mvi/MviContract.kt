package com.carbroz.partner.core.mvi

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface UiState

interface UiIntent

interface UiEffect

fun interface Reducer<S : UiState, I : UiIntent> {
    fun reduce(state: S, intent: I): S
}

interface Store<S : UiState, I : UiIntent, E : UiEffect> {
    val state: StateFlow<S>
    val effects: SharedFlow<E>

    fun dispatch(intent: I)
}
