package br.com.fittogether.presentation.navigation.host.register

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import br.com.fittogether.presentation.navigation.route.register.RegisterRoutes

fun NavGraphBuilder.registerNavHost(startDestination: RegisterRoutes) {
    navigation<RegisterRoutes.Graph>(
        startDestination = startDestination
    ) {
        composable<RegisterRoutes.Signup> {
            val test = it.toRoute<RegisterRoutes.Signup>()
            Text("test")
        }
    }
}