# CB-Partner

## Clone the project

```bash
git clone https://github.com/LalitDev2305/CB-Partner.git
cd CB-Partner
```

## Run Android app

Start an Android emulator or connect an Android device first.

### Windows

```bash
gradlew.bat :androidApp:installDebug
adb shell am start -n com.carbroz.partner/com.carbroz.partner.android.MainActivity
```

### macOS / Linux

```bash
./gradlew :androidApp:installDebug
adb shell am start -n com.carbroz.partner/com.carbroz.partner.android.MainActivity
```

You can also open the project in Android Studio, select the `androidApp` run configuration, choose an emulator or connected device, and click **Run**.

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
