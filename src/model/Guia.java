package model;

public class Guia {

    private String nombre;
    private String telefono;
    private Direccion direccion;

    public Guia() {
        this("Sin registrar", "Sin registrar", new Direccion());
    }

    public Guia(String nombre, String telefono) {
        this(nombre, telefono, new Direccion());
    }

    public Guia(String nombre, String telefono, Direccion direccion) {
        setNombre(nombre);
        setTelefono(telefono);
        setDireccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo nombre no puede estar vacio.");
        }
        this.nombre = nombre.trim();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo telefono no puede estar vacio.");
        }
        this.telefono = telefono.trim();
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("El guia debe tener una direccion.");
        }
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " - Tel: " + telefono + " - Direccion: " + direccion;
    }
}