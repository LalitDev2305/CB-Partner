# CarBrozPartnerApp

Minimal **Compose Multiplatform + MVI + UDF** starter. No product features or business logic are included.

## Targets

- Android application
- iOS framework target
- Desktop JVM application

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

## Modules

- `composeApp` — shared Compose UI and MVI/UDF foundation
- `androidApp` — Android entry point
- `desktopApp` — Desktop entry point

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

For iOS, the shared module already exposes `MainViewController()` through the `ComposeApp` framework; an Xcode host can be added when iOS application work begins.
