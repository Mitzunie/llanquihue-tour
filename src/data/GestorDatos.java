package data;

import model.Guia;
import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                try {

                    String[] datos = linea.split(";");

                    if (datos.length != 5) {
                        System.out.println("Linea invalida: " + linea);
                        continue;
                    }

                    String nombreTour = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2]);

                    String nombreGuia = datos[3];
                    String telefonoGuia = datos[4];

                    Guia guia = new Guia(nombreGuia, telefonoGuia);

                    Tour tour = new Tour(
                            nombreTour,
                            tipo,
                            precio,
                            guia
                    );

                    tours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Error en precio: " + linea);
                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return tours;
    }
}