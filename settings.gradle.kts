pluginManagement {
    includeBuild("build-logic")

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
include(":core:network")
include(":domain:appconfig")
include(":data:appconfig")
include(":feature:splash")
