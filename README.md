# LlanquihueTourApp

## Desarrollo Orientado a Objetos I - Semana 7

## Descripción

LlanquihueTourApp es un proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I** de Duoc UC. El sistema representa distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour utilizando los principios de la Programación Orientada a Objetos.

En esta séptima semana se incorporan los conceptos de **polimorfismo** y **colecciones genéricas**, permitiendo gestionar distintos tipos de servicios turísticos mediante una única colección y recorrerlos dinámicamente utilizando referencias de la superclase.

---

# Objetivo de la Semana 7

Extender la jerarquía de clases creada en la Semana 6 para aplicar:

- Polimorfismo.
- Sobrescritura de métodos.
- Colecciones genéricas (`List`).
- Recorrido de objetos mediante un ciclo `for-each`.

---

# Estructura del proyecto

```
src
│
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   └── Guia.java
│
├── data
│   └── GestorServicios.java
│
└── ui
    └── Main.java
```

---

# Clases del proyecto

## model

### ServicioTuristico

Superclase que representa un servicio turístico genérico.

Contiene:

- nombre
- duracionHoras
- método `mostrarInformacion()`
- método `toString()`

---

### RutaGastronomica

Hereda de `ServicioTuristico`.

Atributo adicional:

- numeroDeParadas

Sobrescribe el método:

- `mostrarInformacion()`

---

### PaseoLacustre

Hereda de `ServicioTuristico`.

Atributo adicional:

- tipoEmbarcacion

Sobrescribe el método:

- `mostrarInformacion()`

---

### ExcursionCultural

Hereda de `ServicioTuristico`.

Atributo adicional:

- lugarHistorico

Sobrescribe el método:

- `mostrarInformacion()`

---

### Guia

Clase heredada de actividades anteriores que se mantiene dentro del proyecto.

---

## data

### GestorServicios

Gestiona la colección de servicios turísticos.

Implementa una colección genérica:

```java
List<ServicioTuristico>
```

Dentro de ella almacena:

- 2 Rutas Gastronómicas
- 2 Paseos Lacustres
- 2 Excursiones Culturales

Posteriormente recorre la colección utilizando un ciclo **for-each**, invocando el método `mostrarInformacion()` para cada objeto.

---

## ui

### Main

Clase principal del proyecto.

Su función es crear una instancia de `GestorServicios` y ejecutar la visualización de todos los servicios turísticos.

---

# Cambios realizados en la Semana 7

Se realizaron las siguientes modificaciones respecto de la Semana 6:

- Se incorporó el método `mostrarInformacion()` en la superclase `ServicioTuristico`.
- Se sobrescribió `mostrarInformacion()` en todas las subclases utilizando la anotación `@Override`.
- Se reemplazó la creación individual de objetos por una colección genérica `List<ServicioTuristico>`.
- Se almacenaron diferentes tipos de servicios turísticos dentro de la misma colección.
- Se implementó un recorrido utilizando un ciclo `for-each`.
- Se aplicó polimorfismo al invocar `mostrarInformacion()` desde referencias de tipo `ServicioTuristico`.

---

# Conceptos aplicados

- Programación Orientada a Objetos (POO)
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Uso de `@Override`
- Colecciones genéricas (`List`)
- `ArrayList`
- Ciclo `for-each`

---

# Ejecución del proyecto

1. Abrir el proyecto en el IDE de preferencia.
2. Compilar el proyecto.
3. Ejecutar la clase:

```
ui.Main
```

---

# Salida esperada

El programa mostrará por consola la información de todos los servicios turísticos registrados.

Se visualizarán:

- Rutas Gastronómicas
- Paseos Lacustres
- Excursiones Culturales

Cada servicio ejecutará automáticamente su propia implementación del método `mostrarInformacion()`, demostrando el uso del polimorfismo.

---

# Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Git
- GitHub

---

## Autor

Desarrollado por **Vicente Javier Valdés Lizama** como parte de las actividades de la asignatura **Desarrollo Orientado a Objetos I** en **Duoc UC**.