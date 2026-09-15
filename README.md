# CB-Partner

## Clone the project

```bash
git clone https://github.com/LalitDev2305/CB-Partner.git
cd CB-Partner
```

## Run Android app

1. Open the project root folder in Android Studio.
2. Wait for Gradle sync to complete.
3. Select the `androidApp` run configuration.
4. Select an Android emulator or connected device.
5. Click **Run**.

## Run Desktop app

### Windows

```bash
gradlew.bat :desktopApp:run
```

### macOS / Linux

```bash
./gradlew :desktopApp:run
```

## Run iOS app

> iOS requires macOS with Xcode installed.

1. Open `iosApp/iosApp.xcodeproj` in Xcode.
2. Select the `iosApp` target.
3. Select an iPhone simulator or connected iOS device.
4. Click **Run** in Xcode.
