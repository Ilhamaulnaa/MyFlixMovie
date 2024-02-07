package id.aej.myflix.impl.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.aej.myflix.impl.presentation.FavoriteFeatureImpl

/**
 * Created by ilhamaulnaa on 19/01/24.
 */

@Module
@InstallIn(SingletonComponent::class)
object FavoriteFeatureModule {

  @Provides
  fun provideFavoriteFeature() = FavoriteFeatureImpl()
  
}