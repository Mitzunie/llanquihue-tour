package ui;

// Importamos las clases de los otros paquetes para poder usarlas
import data.GestorDatos;     // El lector de archivos
import model.Tour;           // El molde de los tours

import java.util.ArrayList;  // La lista dinámica

public class Main {


    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours =
                gestor.cargarTours("resources/tours.txt");


        System.out.println("=== LISTA COMPLETA DE TOURS ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\n=== TOURS CON PRECIO MAYOR A $25.000 ===");

        for (Tour tour : tours) {
            if (tour.getPrecio() > 25000) {
                System.out.println(tour);
            }
        }
    }
}
