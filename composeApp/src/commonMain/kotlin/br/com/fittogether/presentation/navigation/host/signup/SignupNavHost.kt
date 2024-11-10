package br.com.fittogether.presentation.navigation.host.signup

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import br.com.fittogether.presentation.feature.signup.verifyEmail.screen.VerifyEmailScreen
import br.com.fittogether.presentation.navigation.route.signup.SignupRoutes

fun NavGraphBuilder.signupNavHost() {
    navigation<SignupRoutes.Graph>(
        startDestination = SignupRoutes.VerifyEmail
    ) {
        composable<SignupRoutes.VerifyEmail> {
            VerifyEmailScreen()
        }
    }
}