package ru.sogya.healthivity.core.ui.uikit

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow

abstract class BaseStateViewModel<ViewState : Any, ViewIntent, ViewEvent>(initialState: ViewState) :
    ViewModel() {
    private val _viewStates = MutableStateFlow(initialState)

    private val _viewActions =
        MutableSharedFlow<ViewEvent?>(replay = 1, onBufferOverflow = BufferOverflow.DROP_OLDEST)

    fun viewActions(): WrappedSharedFlow<ViewEvent?> =
        WrappedSharedFlow(_viewActions.asSharedFlow())

    fun viewStates(): WrappedStateFlow<ViewState> =
        WrappedStateFlow(_viewStates.asStateFlow())


    protected var viewAction: ViewEvent?
        get() = _viewActions.replayCache.last()
        set(value) {
            _viewActions.tryEmit(value)
        }

    protected var viewState: ViewState
        get() = _viewStates.value
        set(value) {
            _viewStates.value = value
        }

    abstract fun obtainIntent(viewIntent: ViewIntent)
}