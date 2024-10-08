package ru.sogya.healthivity.ui.enter

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.sogya.healthivity.core.ui.uikit.BaseStateViewModel

internal class EnterVM :
    BaseStateViewModel<EnterState, EnterIntent, EnterEvent>(initialState = EnterState()) {
    override fun obtainIntent(viewIntent: EnterIntent) {
        viewModelScope.launch{
            when(viewIntent){
                is EnterIntent.CheckIsUserExist -> TODO()
            }
        }
    }
}