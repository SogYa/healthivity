package ru.sogya.healthivity.auth.ui.enter

internal data class EnterState(
    val loading: Boolean = false,
    val email: String = "",
    val isButtonEnabled: Boolean = false
)

internal sealed class EnterEvent {
    data object ToSignIn : EnterEvent()
    data object ToRegistration : EnterEvent()
}

internal sealed class EnterIntent {
    data class UpdateEmail(val email: String) : EnterIntent()
    data object CheckIsUserExist : EnterIntent()
}
