package model;

public class Direccion {

    private String calle;
    private String ciudad;

    public Direccion() {
        this("Sin registrar", "Sin registrar");
    }

    public Direccion(String calle, String ciudad) {
        setCalle(calle);
        setCiudad(ciudad);
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        if (calle == null || calle.trim().isEmpty()) {
            throw new IllegalArgumentException("La calle no puede estar vacia.");
        }
        this.calle = calle.trim();
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if (ciudad == null || ciudad.trim().isEmpty()) {
            throw new IllegalArgumentException("La ciudad no puede estar vacia.");
        }
        this.ciudad = ciudad.trim();
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad;
    }
}
