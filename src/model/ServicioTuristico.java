package model;

public class ServicioTuristico implements Registrable {

    private String nombre;
    private int duracionHoras;

    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public void mostrarResumen() {
        mostrarInformacion();
    }

    @Override
    public String toString() {
        return "Servicio: " + nombre +
                " | Duración: " + duracionHoras + " horas";
    }
}