package data;

import java.util.ArrayList;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.Registrable;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    private ArrayList<Registrable> entidades;

    public GestorServicios() {
        recargarServicios();
    }

    public void agregarEntidad(Registrable entidad) {

        entidades.add(entidad);

        EscrituraArchivo escritor = new EscrituraArchivo();
        escritor.guardarServicio(entidad);

    }

    public ServicioTuristico buscarServicio(String nombre) {

        for (Registrable entidad : entidades) {

            if (entidad instanceof ServicioTuristico servicio) {

                if (servicio.getNombre().equalsIgnoreCase(nombre)) {
                    return servicio;
                }

            }

        }

        return null;

    }

    public String obtenerServicios() {

        StringBuilder sb = new StringBuilder();

        for (Registrable entidad : entidades) {

            if (entidad instanceof RutaGastronomica) {
                sb.append("Tipo: Ruta Gastronómica\n");
            } else if (entidad instanceof PaseoLacustre) {
                sb.append("Tipo: Paseo Lacustre\n");
            } else if (entidad instanceof ExcursionCultural) {
                sb.append("Tipo: Excursión Cultural\n");
            }

            if (entidad instanceof ServicioTuristico servicio) {
                sb.append(servicio.toString()).append("\n\n");
            }

        }

        return sb.toString();

    }

    public void mostrarServicios() {
        System.out.println(obtenerServicios());
    }

    public void recargarServicios() {

        LectorArchivo lector = new LectorArchivo();

        entidades = lector.cargarServicios();

    }

}