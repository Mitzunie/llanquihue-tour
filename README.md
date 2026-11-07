# Llanquihue Tour

## Descripción
Aplicación Java que representa personas y empleados de la
agencia de turismo, incluyendo sus direcciones. Utiliza
encapsulamiento, composición y herencia.

## Paquetes utilizados y clases implementadas

```
src/
├── model/
│   ├── Persona.java
│   ├── Direccion.java
│   └── Empleado.java
└── app/
    └── Main.java
```

- **model** — Contiene las clases Persona, Direccion y Empleado
- **app** — Contiene la clase Main

Persona tiene una Direccion como atributo. Empleado hereda
de Persona y agrega cargo y sueldo.

## Instrucciones para ejecutar la clase Main

1. Abrir el proyecto de la rama Semana3 en IntelliJ IDEA.
2. Seleccionar un JDK 21 o posterior.
3. Compilar el proyecto desde Build > Build Project.
4. Ejecutar la clase Main.java ubicada en src/app/Main.java.
5. Mostrará un cliente y dos empleados con sus direcciones.

## Autor

Vicente Javier Valdés Lizama
