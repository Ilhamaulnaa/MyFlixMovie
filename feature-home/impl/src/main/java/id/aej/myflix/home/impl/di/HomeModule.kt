package id.aej.myflix.home.impl.di

import id.android.api.HomeFeature
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import id.aej.myflix.home.impl.presentation.HomeFeatureImpl

/**
 * Created by ilhamaulnaa on 19/01/24.
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeModule {

  @Binds
  abstract fun bindHomeFeature(
    homeFeature: HomeFeatureImpl
  ): HomeFeature

}