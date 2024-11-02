package br.com.fittogether.presentation.navigation.host.app

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.toRoute
import br.com.fittogether.presentation.navigation.host.register.registerNavHost
import br.com.fittogether.presentation.navigation.host.start.startNavHost
import br.com.fittogether.presentation.navigation.route.register.RegisterRoutes
import br.com.fittogether.presentation.navigation.route.start.StartRoutes

@Composable
fun AppNavHost(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = StartRoutes.Graph
    ) {
        startNavHost(navHostController = navHostController)

        registerNavHost(
            startDestination = navHostController.currentBackStackEntry?.savedStateHandle?.get("startDestination") ?: RegisterRoutes.Signup("teset")
        )
    }
}