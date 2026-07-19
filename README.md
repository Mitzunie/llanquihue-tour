# LlanquihueTourApp

## Desarrollo Orientado a Objetos I - Semana 9

## Descripción

LlanquihueTourApp es un proyecto desarrollado para la asignatura **Desarrollo Orientado a Objetos I** de Duoc UC. El sistema representa distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour utilizando los principios de la Programación Orientada a Objetos.

En esta novena semana se incorpora **persistencia con archivos de texto**, permitiendo que los servicios turísticos se carguen desde un archivo al iniciar la aplicación y se guarden de forma permanente cuando el usuario agrega nuevos servicios. También se agrega la posibilidad de **buscar servicios por nombre** y **recargar el archivo** desde la interfaz.

---

# Objetivo de la Semana 9

- Implementar lectura y escritura de archivos de texto.
- Persistir los servicios turísticos en un archivo externo.
- Agregar búsqueda de servicios por nombre.
- Permitir recarga dinámica del archivo de datos.
- Aplicar manejo de excepciones en la interfaz gráfica.

---

# Estructura del proyecto

```
src/
├── model/
│   ├── ServicioTuristico.java    # Superclase base
│   ├── RutaGastronomica.java     # Servicio gastronómico
│   ├── PaseoLacustre.java        # Servicio lacustre
│   ├── ExcursionCultural.java    # Servicio cultural
│   ├── Registrable.java          # Interfaz común
│   └── Guia.java                 # Guía turístico (sin uso activo)
├── data/
│   ├── GestorServicios.java      # Gestión de servicios
│   ├── LectorArchivo.java        # Lectura del archivo de servicios
│   └── EscrituraArchivo.java     # Escritura del archivo de servicios
├── datos/
│   └── servicios.txt             # Archivo de persistencia
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

Clase heredada de semanas anteriores que se mantiene dentro del proyecto para conservar la continuidad del historial. Actualmente no se encuentra en uso.

---

## data

### GestorServicios

Gestiona la colección de servicios turísticos.

Implementa una colección genérica:

```java
ArrayList<Registrable>
```

Al inicio, carga los servicios desde el archivo `datos/servicios.txt` mediante `LectorArchivo`. Cuando el usuario agrega un nuevo servicio, lo guarda tanto en la colección como en el archivo mediante `EscrituraArchivo`.

Métodos principales:

- `agregarEntidad(Registrable)` — agrega un servicio y lo persiste en el archivo.
- `buscarServicio(String nombre)` — busca un servicio por nombre (ignorando mayúsculas/minúsculas).
- `obtenerServicios()` — devuelve un `String` con toda la información para mostrar en `JOptionPane`.
- `mostrarServicios()` — imprime por consola.
- `recargarServicios()` — vuelve a leer el archivo y actualiza la colección.

---

### LectorArchivo

Se encarga de leer el archivo `datos/servicios.txt` y convertir cada línea en un objeto del tipo correspondiente.

El formato del archivo es:

```
TIPO;nombre;duracion;atributo_extra
```

Donde `TIPO` puede ser `RUTA`, `PASEO` o `EXCURSION`.

Método principal:

- `cargarServicios()` — devuelve un `ArrayList<Registrable>` con los servicios leídos.

---

### EscrituraArchivo

Se encarga de agregar una nueva línea al archivo `datos/servicios.txt` cada vez que se registra un servicio.

Detecta el tipo de entidad (`RutaGastronomica`, `PaseoLacustre` o `ExcursionCultural`) y escribe los datos en el formato correspondiente.

Método principal:

- `guardarServicio(Registrable)` — escribe el servicio al final del archivo.

---

## datos

### servicios.txt

Archivo de texto que almacena los servicios turísticos de forma persistente.

Contenido inicial:

```
RUTA;Sabores de Puerto Varas;3;5
RUTA;Ruta de la Cerveza Artesanal;4;4
PASEO;Navegación Lago Llanquihue;2;Catamarán
PASEO;Travesía Isla de los Alerces;5;Lancha
EXCURSION;Iglesia de Achao;2;Achao
EXCURSION;Museo Colonial Alemán;3;Frutillar
```

---

## ui

### Main

Clase principal del proyecto. Crea una instancia de `Interfaz` y ejecuta el menú principal.

### Interfaz

Interfaz gráfica basada en `JOptionPane`. Presenta un menú con las siguientes opciones:

1. Agregar Ruta Gastronómica
2. Agregar Paseo Lacustre
3. Agregar Excursión Cultural
4. Buscar Servicio
5. Mostrar Servicios
6. Recargar Archivo
7. Salir

Maneja excepciones de tipo `NumberFormatException` cuando el usuario ingresa valores no numéricos, y valida entradas nulas o vacías en la búsqueda.

---

# Cambios realizados en la Semana 9

Respecto de la Semana 8:

- Se creó la clase `LectorArchivo` para leer servicios desde un archivo de texto.
- Se creó la clase `EscrituraArchivo` para persistir servicios en el archivo.
- Se creó el archivo `datos/servicios.txt` con 6 servicios iniciales.
- `GestorServicios` ahora carga los servicios desde el archivo al iniciar, en vez de crearlos con datos hardcodeados.
- `agregarEntidad()` ahora guarda el servicio en el archivo además de agregarlo a la colección.
- Se agregó el método `buscarServicio(String nombre)` que permite encontrar un servicio por su nombre.
- Se agregó el método `recargarServicios()` que vuelve a leer el archivo desde disco.
- Se agregaron métodos getter en las subclases (`getNumeroDeParadas()`, `getTipoEmbarcacion()`, `getLugarHistorico()`) para que `EscrituraArchivo` pueda acceder a los atributos privados.
- `Interfaz` se amplió de 5 a 7 opciones, incluyendo Buscar, Mostrar y Recargar.
- Se agregó manejo de excepciones en `Interfaz` para evitar que el programa se cierre con entradas inválidas.
- Se documentó `Guia` con un comentario que indica que no se encuentra en uso activo.

---

# Conceptos aplicados

- Programación Orientado a Objetos (POO)
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Uso de `@Override`
- Interfaces (`Registrable`)
- Colecciones genéricas (`ArrayList`)
- Interfaz gráfica (`JOptionPane`)
- Lectura y escritura de archivos (`BufferedReader`, `BufferedWriter`)
- Persistencia de datos en archivo de texto
- Manejo de excepciones (`try-catch`)
- Expresiones `instanceof` con pattern matching

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

Al ejecutar por primera vez, se cargarán los 6 servicios iniciales desde el archivo `datos/servicios.txt`.

Las opciones disponibles son:

- **Agregar**: permite registrar nuevos servicios que se guardan permanentemente en el archivo.
- **Buscar**: encuentra un servicio por nombre y muestra su información.
- **Mostrar Servicios**: despliega un cuadro de diálogo con todos los servicios registrados.
- **Recargar**: vuelve a leer el archivo desde disco, útil si se edita manualmente.

Cada servicio ejecuta automáticamente su propia implementación del método `toString()`, demostrando el uso del polimorfismo.

---

# Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Git
- GitHub

---

## Autor

Desarrollado por **Vicente Javier Valdés Lizama** como parte de las actividades de la asignatura **Desarrollo Orientado a Objetos I** en **Duoc UC**.
