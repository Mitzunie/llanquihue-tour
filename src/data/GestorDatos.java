package data;

import model.Direccion;
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

                    String[] datos = linea.split(";", -1);

                    if (datos.length != 5 && datos.length != 7) {
                        System.out.println("Linea invalida: " + linea);
                        continue;
                    }

                    String nombreTour = datos[0];
                    String tipo = datos[1];
                    int precio = Integer.parseInt(datos[2].trim());

                    String nombreGuia = datos[3];
                    String telefonoGuia = datos[4];

                    // Los archivos anteriores tienen 5 campos, sin direccion.
                    Direccion direccion = new Direccion();
                    if (datos.length == 7) {
                        direccion = new Direccion(datos[5], datos[6]);
                    }

                    Guia guia = new Guia(nombreGuia, telefonoGuia, direccion);

                    Tour tour = new Tour(
                            nombreTour,
                            tipo,
                            precio,
                            guia
                    );

                    tours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Error en precio: " + linea);
                } catch (IllegalArgumentException e) {
                    System.out.println("Registro invalido: " + e.getMessage());
                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return tours;
    }
}