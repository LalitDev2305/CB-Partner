plugins {
    id("carbroz.android.application")
}

android {
    namespace = "com.carbroz.partner.android"

    defaultConfig {
        applicationId = "com.carbroz.partner"
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(project(":composeApp"))
    implementation(libs.androidx.activity.compose)
}
