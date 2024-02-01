package id.aej.myflix.presentation.navigation

import id.aej.myflix.R
import id.aej.myflix.design_system.domain.model.Tab

/**
 * Created by ilhamaulnaa on 25/01/24.
 */

val TabDestinations = listOf(
    Tab(
        route = "home",
        selectedIcon = id.aej.myflix.design_system.R.drawable.ic_home_filled,
        unselectedIcon = id.aej.myflix.design_system.R.drawable.ic_home_outlined
    ),
    Tab(
        route = "bookmark",
        selectedIcon = id.aej.myflix.design_system.R.drawable.ic_bookmark_filled,
        unselectedIcon = id.aej.myflix.design_system.R.drawable.ic_bookmark_outlined
    ),
    Tab(
        route = "profile",
        selectedIcon = id.aej.myflix.design_system.R.drawable.ic_profile_filled,
        unselectedIcon = id.aej.myflix.design_system.R.drawable.ic_profile_outlined
    )

)