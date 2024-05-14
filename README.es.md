
# AOS-NumericKeypad
[![en](https://img.shields.io/badge/lang-en-red.svg)](https://github.com/thinkupsoft/AOS-NumericKeypad/blob/main/README.md)
[![es](https://img.shields.io/badge/lang-es-yellow.svg)](https://github.com/thinkupsoft/AOS-NumericKeypad/blob/main/README.es.md)

NumericKeypad es una librería de Jetpack Compose que proporciona un teclado numérico personalizable, diseñado especialmente para aplicaciones Android que requieren una entrada numérica elegante y funcional.

## Características
- Diseño simple y personalizable.
- Eventos para cada número y la acción de borrado.
- Estilos y colores ajustables para cada tecla.
- Compatible con Material Theme.

### Instalación
Para incluir `NumericKeypad` en tu proyecto, añade la siguiente dependencia a tu archivo `build.gradle`:
```groovy
dependencies {
    implementation 'com.thinkup:numeric-keypad-library:1.0'
}
```

### Ejemplo de Uso
Aquí hay un ejemplo básico de cómo integrar `NumericKeypad` en tu aplicación:
```kotlin
import com.thinkup.numeric_keypad.NumericKeypad
```

```kotlin
NumericKeypad(
    onNumberClick = { /* manejo de número */ },
    onDeleteClick = { /* manejo del borrado */ },
)
```

### Parámetros Disponibles

#### NumericKeypad
Componente principal que muestra el teclado numérico.

**Parámetros**:
- `modifier`: Modificador para personalizar la disposición del teclado.
- `onNumberClick`: Lambda que se ejecuta cuando se presiona un número.
- `onDeleteClick`: Lambda que se ejecuta cuando se presiona el botón de borrado.
- `keyColor`: Color de las teclas del teclado.
- `fontStyle`: Estilo de fuente para el texto de las teclas.
- `textStyle`: Estilo del texto para las teclas.
- `deleteIcon`: ID del recurso del icono de borrado.


### Ejemplo Avanzado
Este es un ejemplo de cómo se puede personalizar el `NumericKeypad` con diferentes colores y estilos:
```kotlin
NumericKeypad(
    onNumberClick = { /* manejo del número */ },
    onDeleteClick = { /* manejo del borrado */ },
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