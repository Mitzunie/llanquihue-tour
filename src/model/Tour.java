package model;

public class Tour {

    private String nombre;
    private String tipo;
    private int precio;

    // COMPOSICIÓN
    private Guia guia;

    public Tour() {
        this("Sin registrar", "Sin registrar", 0, new Guia());
    }

    public Tour(String nombre, String tipo, int precio, Guia guia) {
        setNombre(nombre);
        setTipo(tipo);
        setPrecio(precio);
        setGuia(guia);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo tipo no puede estar vacio.");
        }
        this.tipo = tipo.trim();
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        if (guia == null) {
            throw new IllegalArgumentException("El tour debe tener un guia.");
        }
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Tour: " + nombre +
                " | Tipo: " + tipo +
                " | Precio: $" + precio +
                " | Guia: " + guia;
    }
}