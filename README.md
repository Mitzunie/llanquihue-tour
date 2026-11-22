# Llanquihue Tour

## Descripción
Aplicación Java que lee tours desde un archivo de texto con
información del guía y su dirección incluida, los almacena en un ArrayList
y permite filtrarlos por precio o buscarlos por tipo.

## Paquetes utilizados y clases implementadas

```
src/
├── model/
│   ├── Tour.java
│   ├── Guia.java
│   └── Direccion.java
├── data/
│   └── GestorDatos.java
└── ui/
    └── Main.java

resources/
└── tours.txt
```

- **model** — Contiene las clases Tour, Guia y Direccion
- **data** — Contiene la clase GestorDatos
- **ui** — Contiene la clase Main

## Instrucciones para ejecutar la clase Main

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase Main.java ubicada en src/ui/Main.java.
3. El sistema cargará los tours desde tours.txt.
4. Mostrará todos los tours y los mayores a $25.000.
5. Luego pedirá un tipo de tour para buscar
   (ej: Aventura, Cultural, Naturaleza).

## Validaciones

Se rechazan campos vacíos y precios negativos. Si una línea tiene
un precio no numérico o datos incorrectos, se muestra un mensaje
y se continúa con las demás líneas.

## Archivo de datos

Cada línea de resources/tours.txt tiene este formato:

```
nombre;tipo;precio;nombreGuia;telefono;calle;ciudad
```

También se aceptan las líneas anteriores de 5 campos. En ese caso,
la dirección aparece como Sin registrar.
