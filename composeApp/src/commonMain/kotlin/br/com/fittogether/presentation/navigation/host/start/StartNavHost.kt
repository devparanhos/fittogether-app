package br.com.fittogether.presentation.navigation.host.start

import androidx.compose.material.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import br.com.fittogether.presentation.feature.onboarding.screen.OnboardingScreen
import br.com.fittogether.presentation.feature.welcome.screen.WelcomeScreen
import br.com.fittogether.presentation.navigation.route.register.RegisterRoutes
import br.com.fittogether.presentation.navigation.route.start.StartRoutes

fun NavGraphBuilder.startNavHost(navHostController: NavHostController) {
    navigation<StartRoutes.Graph>(startDestination = StartRoutes.Welcome) {
        composable<StartRoutes.Welcome> {
            WelcomeScreen(
                navigateOnboarding = {
                    navHostController.navigate(
                        StartRoutes.Onboarding
                    )
                }
            )
        }

        composable<StartRoutes.Onboarding> {
            OnboardingScreen {
                it.savedStateHandle.set(
                    "startDestination",
                    RegisterRoutes.Signup("teste")
                )
            }
        }
    }
}