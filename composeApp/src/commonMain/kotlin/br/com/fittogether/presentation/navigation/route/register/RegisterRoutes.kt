package br.com.fittogether.presentation.navigation.route.register

import kotlinx.serialization.Serializable

sealed class RegisterRoutes {
    @Serializable
    data object Graph : RegisterRoutes()

    @Serializable
    data class Signup(
        val text: String
    ) : RegisterRoutes()
}