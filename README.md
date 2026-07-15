# LlanquihueTourApp

## Desarrollo Orientado a Objetos I - Semana 8

## Descripción

LlanquihueTourApp es un proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I** de Duoc UC. El sistema representa distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour utilizando los principios de la Programación Orientada a Objetos.

En esta octava semana se incorpora una **interfaz gráfica** mediante `JOptionPane`, permitiendo al usuario interactuar con el sistema para agregar y visualizar servicios turísticos de forma dinámica.

---

# Objetivo de la Semana 8

- Implementar una interfaz gráfica con `JOptionPane`.
- Crear la interfaz `Registrable` para unificar contratos.
- Permitir la gestión dinámica de servicios turísticos.
- Aplicar polimorfismo en la visualización de entidades.

---

# Estructura del proyecto

```
src/
├── model/
│   ├── ServicioTuristico.java    # Superclase base
│   ├── RutaGastronomica.java     # Servicio gastronómico
│   ├── PaseoLacustre.java        # Servicio lacustre
│   ├── ExcursionCultural.java    # Servicio cultural
│   ├── Guia.java                 # Guía turístico
│   └── Registrable.java          # Interfaz común
├── data/
│   └── GestorServicios.java      # Gestión de servicios
└── ui/
    ├── Main.java                 # Punto de entrada
    └── Interfaz.java             # Interfaz gráfica (JOptionPane)
```

---

# Clases del proyecto

## model

### ServicioTuristico

Superclase que representa un servicio turístico genérico. Implementa la interfaz `Registrable`.

Atributos:

- nombre
- duracionHoras

Métodos:

- `mostrarInformacion()`
- `mostrarResumen()` (de `Registrable`)
- `toString()`

---

### RutaGastronomica

Hereda de `ServicioTuristico`.

Atributo adicional:

- numeroDeParadas

Sobrescribe:

- `mostrarInformacion()`
- `mostrarResumen()`

---

### PaseoLacustre

Hereda de `ServicioTuristico`.

Atributo adicional:

- tipoEmbarcacion

Sobrescribe:

- `mostrarInformacion()`
- `mostrarResumen()`

---

### ExcursionCultural

Hereda de `ServicioTuristico`.

Atributo adicional:

- lugarHistorico

Sobrescribe:

- `mostrarInformacion()`
- `mostrarResumen()`

---

### Registrable

Interfaz que define el contrato común para todas las entidades del sistema.

Método:

- `mostrarResumen()`

---

### Guia

Clase heredada de actividades anteriores que se mantiene dentro del proyecto.

---

## data

### GestorServicios

Gestiona la colección de servicios turísticos.

Implementa una colección genérica:

```java
ArrayList<Registrable>
```

Almacena:

- 2 Rutas Gastronómicas
- 2 Paseos Lacustres
- 2 Excursiones Culturales

Métodos principales:

- `agregarEntidad(Registrable)` — permite agregar nuevas entidades desde la GUI.
- `obtenerServicios()` — devuelve un `String` con toda la información para mostrar en `JOptionPane`.
- `mostrarServicios()` — imprime por consola (compatibilidad con Semana 7).

---

## ui

### Main

Clase principal del proyecto. Crea una instancia de `Interfaz` y ejecuta el menú principal.

### Interfaz

Interfaz gráfica basada en `JOptionPane`. Presenta un menú con las siguientes opciones:

1. Agregar Ruta Gastronómica
2. Agregar Paseo Lacustre
3. Agregar Excursión Cultural
4. Mostrar Servicios
5. Salir

---

# Cambios realizados en la Semana 8

Respecto de la Semana 7:

- Se creó la interfaz `Registrable` con el método `mostrarResumen()`.
- `ServicioTuristico` ahora implementa `Registrable`.
- Se agregó `mostrarResumen()` en todas las subclases.
- `GestorServicios` cambia de `List<ServicioTuristico>` a `ArrayList<Registrable>`.
- Se agregó el método `agregarEntidad()` para gestión dinámica.
- Se agregó el método `obtenerServicios()` que retorna un `String`.
- Se creó la clase `Interfaz` con menú basado en `JOptionPane`.
- `Main` ahora instancia `Interfaz` en lugar de `GestorServicios`.

---

# Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Uso de `@Override`
- Interfaces (`Registrable`)
- Colecciones genéricas (`ArrayList`)
- Interfaz gráfica (`JOptionPane`)

---

# Ejecución del proyecto

1. Abrir el proyecto en IntelliJ IDEA (u otro IDE Java).
2. Compilar el proyecto.
3. Ejecutar la clase:

```
ui.Main
```

---

# Salida esperada

El programa mostrará un menú gráfico con las opciones del sistema.

Al seleccionar **Mostrar Servicios**, se desplegará un cuadro de diálogo con la información de todos los servicios turísticos registrados:

- Rutas Gastronómicas
- Paseos Lacustres
- Excursiones Culturales

Cada servicio ejecutará automáticamente su propia implementación del método `toString()`, demostrando el uso del polimorfismo.

---

# Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Git
- GitHub

---

## Autor

Desarrollado por **Vicente Javier Valdés Lizama** como parte de las actividades de la asignatura **Desarrollo Orientado a Objetos I** en **Duoc UC**.
