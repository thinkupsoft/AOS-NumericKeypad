
# AOS-NumericKeypad
[![en](https://img.shields.io/badge/lang-en-red.svg)](https://github.com/thinkupsoft/AOS-NumericKeypad/blob/main/README.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](https://github.com/thinkupsoft/AOS-NumericKeypad/blob/main/README.es.md)

NumericKeypad is a Jetpack Compose library that provides a customizable numeric keypad, specifically designed for Android applications requiring sleek and functional numeric input.

## Features
- Simple and customizable design.
- Events for each number and delete action.
- Adjustable styles and colors for each key.
- Compatible with Material Theme.

### Installation
To include `NumericKeypad` in your project, add the following dependency to your `build.gradle` file:
```groovy
dependencies {
    implementation 'com.thinkup:numeric-keypad-library:1.0'
}
```

### Usage Example
Here is a basic example of how to integrate `NumericKeypad` into your application:
```kotlin
import com.thinkup.numeric_keypad.NumericKeypad
```

```kotlin
NumericKeypad(
    onNumberClick = { /* handle number */ },
    onDeleteClick = { /* handle delete */ },
)
```

### Available Parameters

#### NumericKeypad
Main component that displays the numeric keypad.

**Parameters**:
- `modifier`: Modifier to customize the layout of the keypad.
- `onNumberClick`: Lambda that is executed when a number is pressed.
- `onDeleteClick`: Lambda that is executed when the delete button is pressed.
- `keyColor`: Color of the keypad keys.
- `fontStyle`: Font style for the key text.
- `textStyle`: Text style for the keys.
- `deleteIcon`: Resource ID of the delete icon.

### Advanced Example
This is an example of how you can customize the `NumericKeypad` with different colors and styles:
```kotlin
NumericKeypad(
    onNumberClick = { /* handle number */ },
    onDeleteClick = { /* handle delete */ },
    keyColor = Color.Yellow,
    fontStyle = FontStyle.Italic,
    textStyle = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 54.sp
    ),
    deleteIcon = R.drawable.ic_delete
)
```

| Preview | Enter Amount | Enter Pin |
|---|---|---|
| <img src="https://github.com/thinkupsoft/AOS-NumericKeypad/assets/4175950/ddf987fb-5ca6-4995-9267-24283e0fe011" width="200">   | <img src="https://github.com/thinkupsoft/AOS-NumericKeypad/assets/4175950/75098e26-2778-4d2e-b5a8-078d65b6af27" width="200"> | <img src="https://github.com/thinkupsoft/AOS-NumericKeypad/assets/4175950/05502a2e-9fd7-4795-b4f8-ee1ed2071e5b" width="200"> |
