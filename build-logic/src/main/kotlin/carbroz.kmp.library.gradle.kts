import org.gradle.api.artifacts.VersionCatalogsExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.kotlin.multiplatform.library")
}

val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
val androidCompileSdkVersion = libs.findVersion("androidCompileSdk").get().requiredVersion.toInt()
val androidMinSdkVersion = libs.findVersion("androidMinSdk").get().requiredVersion.toInt()

kotlin {
    android {
        compileSdk = androidCompileSdkVersion
        minSdk = androidMinSdkVersion

        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    jvm("desktop") {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    iosArm64()
    iosSimulatorArm64()
}
