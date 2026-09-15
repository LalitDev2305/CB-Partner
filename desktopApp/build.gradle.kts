import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    id("carbroz.desktop.application")
}

dependencies {
    implementation(project(":composeApp"))
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "com.carbroz.partner.desktop.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "CarBrozPartnerApp"
            packageVersion = "1.0.0"
        }
    }
}
