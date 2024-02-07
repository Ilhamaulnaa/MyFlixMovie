package id.aej.myflix.impl.presentation

sealed class FavoriteRoute (val route: String){
    object Favorite: FavoriteRoute("favorite")
}
