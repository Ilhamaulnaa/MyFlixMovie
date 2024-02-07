package id.aej.myflix.impl.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.aej.myflix.api.FavoriteFeature
import id.aej.myflix.impl.presentation.FavoriteFeatureImpl

/**
 * Created by ilhamaulnaa on 19/01/24.
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class FavoriteModule {

  @Binds
  abstract fun bindFavoriteFeature(
   favoriteFeature: FavoriteFeatureImpl
  ): FavoriteFeature

}