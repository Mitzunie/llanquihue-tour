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

        entidades = new ArrayList<>();

        entidades.add(new RutaGastronomica(
                "Sabores de Puerto Varas",
                3,
                5));

        entidades.add(new RutaGastronomica(
                "Ruta de la Cerveza Artesanal",
                4,
                4));

        entidades.add(new PaseoLacustre(
                "Navegación Lago Llanquihue",
                2,
                "Catamarán"));

        entidades.add(new PaseoLacustre(
                "Travesía Isla de los Alerces",
                5,
                "Lancha"));

        entidades.add(new ExcursionCultural(
                "Iglesia de Achao",
                2,
                "Achao"));

        entidades.add(new ExcursionCultural(
                "Museo Colonial Alemán",
                3,
                "Frutillar"));
    }

    // Permite agregar nuevas entidades desde la GUI
    public void agregarEntidad(Registrable entidad) {
        entidades.add(entidad);
    }

    // Devuelve toda la información para mostrarla en JOptionPane
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

    // Se mantiene por compatibilidad con la Semana 7
    public void mostrarServicios() {
        System.out.println(obtenerServicios());
    }

}