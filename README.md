# CarBrozPartnerApp

Minimal **Compose Multiplatform + MVI + UDF** starter. No product features or business logic are included.

## Applications and shared module

- `androidApp` — Android host application
- `iosApp` — native iOS/Xcode host application
- `desktopApp` — Desktop JVM host application
- `composeApp` — shared Compose Multiplatform UI and MVI/UDF foundation

The platform relationship is:

`androidApp / iosApp / desktopApp -> composeApp`

## Architecture foundation

`composeApp/src/commonMain/.../core/mvi` contains only the reusable MVI/UDF contracts:

- `UiState`
- `UiIntent`
- `UiEffect`
- `Reducer`
- `Store`
- `BaseStore`

The intended flow is:

`UI -> Intent -> Store -> Reducer -> State -> UI`

One-time events flow through `UiEffect`.

## iOS integration

`composeApp` exposes the static `ComposeApp` framework and `MainViewController()` from `iosMain`.

The native `iosApp` SwiftUI host embeds that controller through `UIViewControllerRepresentable`. Its Xcode build phase runs:

```bash
./gradlew :composeApp:embedAndSignAppleFrameworkForXcode
```

Open `iosApp/iosApp.xcodeproj` in Xcode to run the iOS app. For a physical device, select your Apple Development Team in Signing & Capabilities (or set `TEAM_ID` in `iosApp/Configuration/Config.xcconfig`).

## Versions

- Kotlin `2.4.20`
- Compose Multiplatform `1.12.0`
- Android Gradle Plugin `9.3.1`
- Gradle `9.5.0`
- JDK `17`

## Run

Android: run the `androidApp` configuration from Android Studio.

Desktop:

```bash
./gradlew :desktopApp:run
```

iOS: open `iosApp/iosApp.xcodeproj` in Xcode and run the `iosApp` target on a simulator or device.
