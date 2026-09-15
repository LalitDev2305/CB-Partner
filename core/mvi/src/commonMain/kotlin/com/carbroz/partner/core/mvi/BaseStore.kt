package com.carbroz.partner.core.mvi

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

abstract class BaseStore<S : UiState, I : UiIntent, E : UiEffect>(
    initialState: S,
    private val reducer: Reducer<S, I>,
) : Store<S, I, E> {

    private val mutableState = MutableStateFlow(initialState)
    private val mutableEffects = MutableSharedFlow<E>(extraBufferCapacity = 1)

    final override val state = mutableState.asStateFlow()
    final override val effects = mutableEffects.asSharedFlow()

    final override fun dispatch(intent: I) {
        mutableState.update { currentState ->
            reducer.reduce(currentState, intent)
        }
        onIntent(intent)
    }

    protected open fun onIntent(intent: I) = Unit

    protected fun emitEffect(effect: E) {
        mutableEffects.tryEmit(effect)
    }

    protected fun updateState(transform: (S) -> S) {
        mutableState.update(transform)
    }
}
