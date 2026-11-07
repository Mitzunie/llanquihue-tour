package model;

/** Guarda la dirección de una persona. */
public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;

    /** Crea el objeto con valores iniciales. */
    public Direccion() {
        this("Sin registrar", "S/N", "Llanquihue");
    }

    /** Recibe los datos de este objeto. */
    public Direccion(String calle, String numero, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    /** Devuelve calle. */
    public String getCalle() {
        return calle;
    }

    /** Cambia calle. */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /** Devuelve numero. */
    public String getNumero() {
        return numero;
    }

    /** Cambia numero. */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /** Devuelve ciudad. */
    public String getCiudad() {
        return ciudad;
    }

    /** Cambia ciudad. */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /** Devuelve los datos como texto. */
    @Override
    public String toString() {
        return calle + " " + numero + ", " + ciudad;
    }
}
