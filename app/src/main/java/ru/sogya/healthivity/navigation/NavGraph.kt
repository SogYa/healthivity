package ru.sogya.healthivity.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Auth {
    @Serializable
    object Enter : Auth()

    @Serializable
    object Login : Auth()

    @Serializable
    object Registration : Auth()
}

@Serializable
object Home
