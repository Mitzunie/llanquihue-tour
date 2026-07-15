package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "Ruta Gastronómica -> " +
                        toString());
    }

    @Override
    public void mostrarResumen() {
        System.out.println("=== Ruta Gastronómica ===");
        mostrarInformacion();
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Paradas: " +
                numeroDeParadas;
    }
}