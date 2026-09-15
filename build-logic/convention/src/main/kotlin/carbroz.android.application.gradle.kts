import org.gradle.api.JavaVersion
import org.gradle.api.artifacts.VersionCatalogsExtension

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.plugin.compose")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
val androidCompileSdkVersion = libs.findVersion("androidCompileSdk").get().requiredVersion.toInt()
val androidMinSdkVersion = libs.findVersion("androidMinSdk").get().requiredVersion.toInt()
val androidTargetSdkVersion = libs.findVersion("androidTargetSdk").get().requiredVersion.toInt()

android {
    compileSdk = androidCompileSdkVersion

    defaultConfig {
        minSdk = androidMinSdkVersion
        targetSdk = androidTargetSdkVersion
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }
}
