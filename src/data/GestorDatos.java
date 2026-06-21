// ============================================================
// DATA - La capa que se encarga de leer y procesar datos
// ============================================================
// Esta clase sabe cómo agarrar un archivo de texto y
// convertirlo en objetos Tour que el programa pueda usar.
// ============================================================

package data;

import model.Tour;

import java.io.BufferedReader;    // Lee texto de forma eficiente (línea por línea)
import java.io.FileReader;        // Abre un archivo para leerlo
import java.io.IOException;       // Para capturar errores de archivo
import java.util.ArrayList;       // Lista que puede crecer sola (no tiene tamaño fijo)

public class GestorDatos {

    // -------------------------------------------
    // MÉTODO: cargarTours
    // -------------------------------------------
    // Recibe: la ruta del archivo (String)
    // Devuelve: un ArrayList lleno de objetos Tour
    //
    // "public"  → cualquiera puede llamarlo
    // "ArrayList<Tour>" → devuelve una lista de tours
    // -------------------------------------------

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // Creamos una lista vacía donde guardaremos los tours
        ArrayList<Tour> tours = new ArrayList<>();

        // -------------------------------------------
        // TRY-WITH-RESOURCES
        // -------------------------------------------
        // Abre el archivo y lo cierra automáticamente
        // cuando termina (aunque haya error).
        //
        // BufferedReader envuelve a FileReader para
        // leer más rápido, línea por línea.
        // -------------------------------------------

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // -------------------------------------------
            // BUCLE: leer línea por línea
            // -------------------------------------------
            // readLine() devuelve null cuando se acaba
            // el archivo. Así que el while se repite
            // mientras haya líneas.
            //
            // Ejemplo de lo que lee:
            // Línea 1 → "RutaLagos;Aventura;25000"
            // Línea 2 → "VolcanOsorno;Aventura;35000"
            // ... hasta que readLine() devuelva null
            // -------------------------------------------

            while ((linea = br.readLine()) != null) {

                // -------------------------------------------
                // SPLIT: partir la línea en pedazos
                // -------------------------------------------
                // split(";") corta el String donde encuentre ";"
                // "RutaLagos;Aventura;25000" → ["RutaLagos", "Aventura", "25000"]
                //
                // datos[0] → "RutaLagos"
                // datos[1] → "Aventura"
                // datos[2] → "25000" (String, todavía no es número)
                // -------------------------------------------

                String[] datos = linea.split(";");

                // Extraemos cada parte en una variable
                String nombre = datos[0];          // Ya es String, se asigna directo
                String tipo = datos[1];            // Igual
                int precio = Integer.parseInt(datos[2]);  // "25000" → 25000 (convertir texto a número)

                // -------------------------------------------
                // CREAR OBJETO TOUR
                // -------------------------------------------
                // Con los datos extraídos, creamos un nuevo
                // objeto Tour usando el constructor con parámetros.
                // -------------------------------------------

                Tour tour = new Tour(nombre, tipo, precio);

                // -------------------------------------------
                // AGREGAR A LA LISTA
                // -------------------------------------------
                // Guardamos el tour creado en el ArrayList.
                // La lista va creciendo sola con cada tour.
                // -------------------------------------------

                tours.add(tour);
            }

        } catch (IOException e) {
            // -------------------------------------------
            // Si el archivo no existe o no se puede leer...
            // -------------------------------------------
            // En vez de que el programa se caiga (crash),
            // mostramos un mensaje amigable.
            // -------------------------------------------

            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        // -------------------------------------------
        // Devolvemos la lista llena de tours
        // -------------------------------------------

        return tours;
    }
}