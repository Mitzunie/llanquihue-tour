# Llanquihue Tour — Semana 3

Proyecto de Desarrollo Orientado a Objetos I. Representa personas y empleados de la agencia Llanquihue Tour, junto con sus direcciones.

## Autor
Mitzunie (usuario de GitHub).

## Clases y paquetes
- `model.Direccion`: calle, número y ciudad.
- `model.Persona`: nombre, teléfono y dirección.
- `model.Empleado`: hereda de Persona y agrega cargo y sueldo.
- `app.Main`: crea un cliente y dos empleados, y muestra sus datos.

Persona contiene un objeto Direccion. Empleado reutiliza los datos y métodos de Persona mediante herencia. Los atributos son privados y se accede a ellos con getters y setters.

## Abrir en IntelliJ IDEA
1. Descargar o clonar este repositorio seleccionando la rama `Semana3`.
2. Abrir la carpeta del proyecto en IntelliJ IDEA.
3. Seleccionar un JDK 21 o posterior en File > Project Structure > Project.
4. Abrir `src/app/Main.java` y ejecutar el método `main` con el botón verde.

## Compilar y ejecutar
Con un JDK 21 o posterior instalado, desde la carpeta del proyecto:

```sh
javac -encoding UTF-8 -d out src/model/Direccion.java src/model/Persona.java src/model/Empleado.java src/app/Main.java
java -cp out app.Main
```

La consola muestra los datos de Ana, Diego y Camila, incluyendo sus direcciones y los cargos y sueldos de los empleados.
