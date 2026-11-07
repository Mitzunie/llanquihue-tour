package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

/** Prueba las clases de Llanquihue Tour. */
public class Main {
    /** Crea tres personas y muestra sus datos. */
    public static void main(String[] args) {
        Persona cliente = new Persona("Ana Pérez", "+56 9 1234 5678",
                new Direccion("Los Alerces", "120", "Llanquihue"));
        Empleado guia = new Empleado("Diego Soto", "+56 9 2345 6789",
                new Direccion("Los Lagos", "250", "Puerto Varas"),
                "Guía turístico", 750000);
        Empleado recepcionista = new Empleado("Camila Rojas", "+56 9 3456 7890",
                new Direccion("Las Rosas", "85", "Llanquihue"),
                "Recepcionista", 650000);

        System.out.println("LLANQUIHUE TOUR");
        System.out.println("\nCLIENTE");
        System.out.println(cliente.toString());
        System.out.println("\nGUÍA");
        System.out.println(guia.toString());
        System.out.println("\nRECEPCIONISTA");
        System.out.println(recepcionista.toString());
    }
}
