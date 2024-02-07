package id.aej.myflix.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import id.aej.myflix.api.FavoriteFeature
import id.android.api.HomeFeature
import id.aej.myflix.auth.api.AuthFeature
import id.aej.myflix.design_system.utils.register

/**
 * Created by dinopriyano on 27/11/23.
 */

@Composable fun AppNavigation(
  modifier: Modifier = Modifier,
  startDestination: String,
  navController: NavHostController,
  authFeature: AuthFeature,
  homeFeature: HomeFeature,
  favoriteFeature: FavoriteFeature
) {

  NavHost(
    navController = navController,
    startDestination = startDestination,
    modifier = modifier
  ) {

    register(
      authFeature,
      navController
    )
    register(
      homeFeature,
      navController
    )
    register(
      favoriteFeature,
      navController
    )

  }

}