# Mobile Testing - Actividad Práctica Integradora 4

## Descripción
Proyecto realizado en Kotlin para validar mediante pruebas unitarias la visualización de un listado de productos.

## Funcionalidad
- Determina si existen productos para mostrar.
- Genera una representación textual de cada producto.
- Diferencia productos disponibles y productos sin stock.

## Pruebas unitarias
Se implementaron dos pruebas:
1. Validar que un listado con productos pueda mostrarse.
2. Validar que un listado vacío no muestre información.

## Tecnologías
- Kotlin
- Android Studio
- JUnit 4
- Gradle

## Ejecución de pruebas
```bash
./gradlew :app:testDebugUnitTest
```
