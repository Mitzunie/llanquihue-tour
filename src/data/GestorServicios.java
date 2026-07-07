package data;

import java.util.ArrayList;
import java.util.List;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                "Sabores de Puerto Varas",
                3,
                5));

        servicios.add(new RutaGastronomica(
                "Ruta de la Cerveza Artesanal",
                4,
                4));

        servicios.add(new PaseoLacustre(
                "Navegación Lago Llanquihue",
                2,
                "Catamarán"));

        servicios.add(new PaseoLacustre(
                "Travesía Isla de los Alerces",
                5,
                "Lancha"));

        servicios.add(new ExcursionCultural(
                "Iglesia de Achao",
                2,
                "Achao"));

        servicios.add(new ExcursionCultural(
                "Museo Colonial Alemán",
                3,
                "Frutillar"));
    }

    public void mostrarServicios() {

        System.out.println("========================================");
        System.out.println("     SERVICIOS TURÍSTICOS");
        System.out.println("========================================");

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

            System.out.println();

        }

    }

}