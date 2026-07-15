package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "Excursión Cultural -> " +
                        toString());
    }

    @Override
    public void mostrarResumen() {
        System.out.println("=== Excursión Cultural ===");
        mostrarInformacion();
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Lugar histórico: " +
                lugarHistorico;
    }
}