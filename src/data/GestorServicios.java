package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Puerto Varas", 3, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Ruta de la Cerveza Artesanal", 4, 4);

        PaseoLacustre paseo1 = new PaseoLacustre("Navegacion Lago Llanquihue", 2, "Catamaran");
        PaseoLacustre paseo2 = new PaseoLacustre("Travesia a la Isla de los Alerces", 5, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural("Iglesia de los Jesuitas", 2, "Iglesia de Achao");
        ExcursionCultural excursion2 = new ExcursionCultural("Museo Colonial Aleman", 3, "Museo Colonial Aleman de Frutillar");

        System.out.println("==================================");
        System.out.println("      SERVICIOS TURISTICOS");
        System.out.println("==================================");
        System.out.println();

        System.out.println("--- Rutas Gastronomicas ---");
        System.out.println(ruta1);
        System.out.println(ruta2);
        System.out.println();

        System.out.println("--- Paseos Lacustres ---");
        System.out.println(paseo1);
        System.out.println(paseo2);
        System.out.println();

        System.out.println("--- Excursiones Culturales ---");
        System.out.println(excursion1);
        System.out.println(excursion2);
        System.out.println();

        System.out.println("==================================");
    }
}
