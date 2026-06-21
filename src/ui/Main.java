package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> tours =
                gestor.cargarTours("resources/tours.txt");

        System.out.println("==================================");
        System.out.println(" LLANQUIHUE TOUR ");
        System.out.println("==================================");

        System.out.println("\n=== TODOS LOS TOURS ===");

        for (Tour tour : tours) {
            System.out.println(tour);
        }

        System.out.println("\n=== TOURS MAYORES A $25.000 ===");

        for (Tour tour : tours) {
            if (tour.getPrecio() > 25000) {
                System.out.println(tour);
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== BUSQUEDA POR TIPO ===");
        System.out.print("Ingrese tipo de tour: ");

        String tipoBuscado = scanner.nextLine();

        boolean encontrado = false;

        for (Tour tour : tours) {

            if (tour.getTipo().equalsIgnoreCase(tipoBuscado)) {

                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours.");
        }

        scanner.close();
    }
}