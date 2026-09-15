pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "CarBrozPartnerApp"

include(":composeApp")
include(":androidApp")
include(":desktopApp")
include(":core:mvi")
include(":feature:splash")
