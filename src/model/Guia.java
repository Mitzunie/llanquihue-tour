package model;

/*
*         Se deja para mantener continuidad con semanas anteriores
*             Esto para evitar confusiones, actualmente no se
*                           Encuentra en uso.
*/


public class Guia {

    private String nombre;
    private String telefono;

    public Guia() {
    }

    public Guia(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " - Tel: " + telefono;
    }
}