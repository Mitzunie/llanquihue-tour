// ============================================================
// MODEL - La capa que define cómo son los datos
// ============================================================
// Esta clase es como un "molde" o "plantilla" para crear tours.
// Cada vez que hacemos "new Tour(...)" estamos creando un
// objeto que tiene nombre, tipo y precio.
// ============================================================

package model;

public class Tour {

    // -------------------------------------------
    // ATRIBUTOS (características del tour)
    // -------------------------------------------
    // Son "private" para que nadie desde afuera pueda
    // cambiar los valores directamente. Solo se accede
    // a través de los métodos (getters y setters).
    // -------------------------------------------

    private String nombre;   // Ej: "RutaLagos"
    private String tipo;     // Ej: "Aventura"
    private int precio;      // Ej: 25000

    // -------------------------------------------
    // CONSTRUCTOR VACÍO
    // -------------------------------------------
    // Permite crear un Tour sin datos (tour vacío).
    // Después se pueden llenar los datos con setters.
    // -------------------------------------------

    public Tour() {
    }

    // -------------------------------------------
    // CONSTRUCTOR CON PARÁMETROS
    // -------------------------------------------
    // Sirve para crear un tour y asignarle valores
    // de una sola vez.
    //
    // Ej: new Tour("RutaLagos", "Aventura", 25000);
    //
    // "this.nombre" se refiere al atributo de arriba.
    // "nombre" (sin this) es el parámetro que recibimos.
    // -------------------------------------------

    public Tour(String nombre, String tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    // -------------------------------------------
    // GETTERS (obtener valores)
    // -------------------------------------------
    // Métodos públicos para leer los atributos privados.
    // Ej: tour.getNombre() → devuelve "RutaLagos"
    // -------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    // -------------------------------------------
    // SETTERS (modificar valores)
    // -------------------------------------------
    // Métodos públicos para cambiar los atributos.
    // Ej: tour.setPrecio(30000) → cambia el precio
    // -------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // -------------------------------------------
    // toString() - Cómo se imprime el tour
    // -------------------------------------------
    // @Override significa que estamos reemplazando
    // el método original de Java (que imprime cosas
    // feas como "Tour@123abc") con nuestro propio
    // formato más legible.
    //
    // Sin esto: System.out.println(tour) → Tour@4f3f5b
    // Con esto: System.out.println(tour) → Nombre: RutaLagos | Tipo: Aventura | Precio: $25000
    // -------------------------------------------

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Tipo: " + tipo +
                " | Precio: $" + precio;
    }
}