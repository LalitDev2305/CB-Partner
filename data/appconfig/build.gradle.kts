plugins {
    id("carbroz.kmp.library")
}

kotlin {
    android {
        namespace = "com.carbroz.partner.data.appconfig"
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":core:network"))
            implementation(project(":domain:appconfig"))
        }
    }
}
