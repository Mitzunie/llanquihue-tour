# Llanquihue Tour App

## Objetivo de la semana
Implementar una jerarquía de clases utilizando herencia simple en Java.

## Clases creadas

```
src/
├── model/
│   ├── ServicioTuristico.java      (superclase)
│   ├── RutaGastronomica.java       (subclase)
│   ├── PaseoLacustre.java          (subclase)
│   ├── ExcursionCultural.java      (subclase)
│   └── Guia.java
├── data/
│   └── GestorServicios.java
└── ui/
    └── Main.java
```

### model
- **ServicioTuristico**: superclase con atributos `nombre` y `duracionHoras`
- **RutaGastronomica**: subclase que agrega `numeroDeParadas`
- **PaseoLacustre**: subclase que agrega `tipoEmbarcacion`
- **ExcursionCultural**: subclase que agrega `lugarHistorico`

### data
- **GestorServicios**: crea 2 objetos de cada subclase y los muestra

### ui
- **Main**: punto de entrada que crea un GestorServicios y llama a mostrarServicios()

## Conceptos utilizados

- **Herencia**: las tres subclases extienden ServicioTuristico usando `extends`
- **super()**: cada subclase llama al constructor de la superclase con `super(nombre, duracionHoras)`
- **Sobrescritura de toString()**: cada subclase sobrescribe `toString()` llamando a `super.toString()` y agregando su atributo específico

## Como ejecutar Main

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main.java` ubicada en `src/ui/Main.java`.
3. El programa mostrara los 6 servicios turisticos creados (2 de cada tipo).
