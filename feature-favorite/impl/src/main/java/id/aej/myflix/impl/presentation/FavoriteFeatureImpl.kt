package id.aej.myflix.impl.presentation

import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import id.aej.myflix.api.FavoriteFeature
import id.aej.myflix.design_system.utils.nonAnimationComposable
import id.aej.myflix.impl.presentation.screen.favorite.FavoriteScreen

class FavoriteFeatureImpl: FavoriteFeature {
    override val favoriteRoute: String
        get() = FavoriteRoute.Favorite.route

    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController,
        modifier: Modifier
    ) {
        navGraphBuilder.nonAnimationComposable(
            route = FavoriteRoute.Favorite.route
        ){
            FavoriteScreen()
        }
    }
}