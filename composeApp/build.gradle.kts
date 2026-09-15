import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    id("carbroz.kmp.compose")
}

kotlin {
    android {
        namespace = "com.carbroz.partner.shared"
        androidResources.enable = true
    }

    listOf("iosArm64", "iosSimulatorArm64").forEach { targetName ->
        targets.named<KotlinNativeTarget>(targetName) {
            binaries.framework {
                baseName = "ComposeApp"
                isStatic = true
            }
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":feature:splash"))
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(libs.kotlinx.coroutines.core)
        }
    }
}
