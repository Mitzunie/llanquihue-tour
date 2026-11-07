package model;

/** Guarda los datos de una persona de la agencia. */
public class Persona {
    private String nombre;
    private String telefono;
    private Direccion direccion;

    /** Crea el objeto con valores iniciales. */
    public Persona() {
        this("Sin registrar", "Sin registrar", new Direccion());
    }

    /** Recibe los datos de este objeto. */
    public Persona(String nombre, String telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /** Devuelve nombre. */
    public String getNombre() {
        return nombre;
    }

    /** Cambia nombre. */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Devuelve telefono. */
    public String getTelefono() {
        return telefono;
    }

    /** Cambia telefono. */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /** Devuelve direccion. */
    public Direccion getDireccion() {
        return direccion;
    }

    /** Cambia direccion. */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /** Devuelve los datos como texto. */
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nDirección: " + direccion;
    }
}
