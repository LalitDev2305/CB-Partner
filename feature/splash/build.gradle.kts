plugins {
    id("carbroz.kmp.compose")
}

kotlin {
    android {
        namespace = "com.carbroz.partner.feature.splash"
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:mvi"))
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
        }
    }
}
