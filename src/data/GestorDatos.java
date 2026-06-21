package data;

import model.Tour;

import java.io.BufferedReader;    // Lee texto de forma eficiente (línea por línea)
import java.io.FileReader;        // Abre un archivo para leerlo
import java.io.IOException;       // Para capturar errores de archivo
import java.util.ArrayList;       // Lista que puede crecer sola (no tiene tamaño fijo)

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // Creamos una lista vacía donde guardaremos los tours
        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                // Extraemos cada parte en una variable
                String nombre = datos[0];          // Ya es String, se asigna directo
                String tipo = datos[1];            // Igual
                int precio = Integer.parseInt(datos[2]);  // "25000" → 25000 (convertir texto a número)

                Tour tour = new Tour(nombre, tipo, precio);

                tours.add(tour);
            }

        } catch (IOException e) {

            System.out.println("Error al leer archivo: " + e.getMessage());
        }


        return tours;
    }
}
