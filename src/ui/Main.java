// ============================================================
// UI - La capa que interactúa con el usuario
// ============================================================
// Esta es la clase principal. main() es el punto de entrada:
// Java empieza a ejecutar todo desde acá.
// ============================================================

package ui;

// Importamos las clases de los otros paquetes para poder usarlas
import data.GestorDatos;     // El lector de archivos
import model.Tour;           // El molde de los tours

import java.util.ArrayList;  // La lista dinámica

public class Main {

    // -------------------------------------------
    // MÉTODO PRINCIPAL
    // -------------------------------------------
    // "public static void main(String[] args)"
    // Es el método que Java busca para arrancar.
    // Sin esto, el programa no se ejecuta.
    //
    // String[] args → parámetros que se pueden pasar
    //                  desde la terminal (opcional)
    // -------------------------------------------

    public static void main(String[] args) {

        // -------------------------------------------
        // PASO 1: CREAR EL GESTOR DE DATOS
        // -------------------------------------------
        // Instanciamos (creamos) un objeto GestorDatos
        // para poder usar su método cargarTours()
        // -------------------------------------------

        GestorDatos gestor = new GestorDatos();

        // -------------------------------------------
        // PASO 2: CARGAR LOS TOURS
        // -------------------------------------------
        // Llamamos al método que lee el archivo y nos
        // devuelve un ArrayList lleno de objetos Tour.
        //
        // La ruta "resources/tours.txt" es relativa
        // a la raíz del proyecto.
        // -------------------------------------------

        ArrayList<Tour> tours =
                gestor.cargarTours("resources/tours.txt");

        // -------------------------------------------
        // PASO 3: MOSTRAR TODOS LOS TOURS
        // -------------------------------------------
        // For-each: recorre la lista AUTOMÁTICAMENTE.
        // No necesitas un contador (i).
        //
        // "Tour tour : tours" → léase como:
        // "para cada elemento 'tour' dentro de la lista 'tours'"
        //
        // En cada vuelta del bucle, la variable 'tour'
        // contiene un objeto Tour distinto.
        //
        // System.out.println(tour) → llama a toString()
        // automáticamente, así que se imprime bonito.
        // -------------------------------------------

        System.out.println("=== LISTA COMPLETA DE TOURS ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        // -------------------------------------------
        // PASO 4: FILTRAR POR PRECIO
        // -------------------------------------------
        // Volvemos a recorrer la misma lista, pero ahora
        // con un IF en medio: solo imprimimos si el
        // precio del tour es mayor a 25.000.
        //
        // tour.getPrecio() → llama al getter del objeto
        // > 25000          → operador de comparación
        // -------------------------------------------

        System.out.println("\n=== TOURS CON PRECIO MAYOR A $25.000 ===");

        for (Tour tour : tours) {
            if (tour.getPrecio() > 25000) {
                System.out.println(tour);
            }
        }
    }
}