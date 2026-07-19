package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "Paseo Lacustre -> " +
                        toString());
    }

    @Override
    public void mostrarResumen() {
        System.out.println("=== Paseo Lacustre ===");
        mostrarInformacion();
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Embarcación: " +
                tipoEmbarcacion;
    }
}