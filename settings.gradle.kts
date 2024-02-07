pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
  }
}

rootProject.name = "MyFlix"
include(":app")
include(":feature-auth:api")
include(":feature-auth:impl")
include(":feature-home:impl")
include(":design-system")
include(":feature-home:api")
include(":core-data")
include(":feature-profile:api")
include(":feature-profile:impl")
include(":feature-favorite:api")
include(":feature-favorite:impl")
