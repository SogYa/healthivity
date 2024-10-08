package ru.sogya.healthivity.ui.enter

internal data class EnterState(
    val loading: Boolean = false,
)

internal sealed class EnterEvent {
    data object ToSignIn : EnterEvent()
    data object ToRegistration : EnterEvent()
}

internal sealed class EnterIntent {
    data class CheckIsUserExist(val email: String) : EnterIntent()
}
