plugins {
    id("carbroz.kmp.library")
}

kotlin {
    android {
        namespace = "com.carbroz.partner.core.mvi"
    }

    sourceSets {
        commonMain.dependencies {
            api(libs.kotlinx.coroutines.core)
        }
    }
}
