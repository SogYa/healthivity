package ru.sogya.healthivity.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.sogya.healthivity.auth.ui.enter.EnterController
import ru.sogya.healthivity.core.ui.di.DaggerViewModelFactory

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    factory: DaggerViewModelFactory
) {
    val getVmFactory: () -> ViewModelProvider.Factory = remember {
        { factory }
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Auth.Enter
    ) {
        composable<Auth.Enter> {
            EnterController(
                viewModelFactory = getVmFactory
            )
        }
    }
}