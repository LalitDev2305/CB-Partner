plugins {
    `kotlin-dsl`
}

group = "com.carbroz.partner.buildlogic"

dependencies {
    implementation(libs.androidGradlePlugin)
    implementation(libs.kotlinGradlePlugin)
    implementation(libs.composeGradlePlugin)
    implementation(libs.composeCompilerGradlePlugin)
}
