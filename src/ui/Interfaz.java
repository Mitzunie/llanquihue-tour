package ui;

import javax.swing.JOptionPane;

import data.GestorServicios;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ExcursionCultural;

public class Interfaz {

    private GestorServicios gestor;

    public Interfaz() {
        gestor = new GestorServicios();
    }

    public void iniciar() {

        int opcion;

        do {

            String menu = """
                    LLANQUIHUE TOUR

                    1. Agregar Ruta Gastronómica
                    2. Agregar Paseo Lacustre
                    3. Agregar Excursión Cultural
                    4. Mostrar Servicios
                    5. Salir
                    """;

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(menu));

            switch (opcion) {

                case 1 -> agregarRuta();

                case 2 -> agregarPaseo();

                case 3 -> agregarExcursion();

                case 4 -> JOptionPane.showMessageDialog(
                        null,
                        gestor.obtenerServicios());

            }

        } while (opcion != 5);
    }

    private void agregarRuta() {

        String nombre = JOptionPane.showInputDialog("Nombre de la ruta:");
        int horas = Integer.parseInt(
                JOptionPane.showInputDialog("Duración (horas):"));
        int paradas = Integer.parseInt(
                JOptionPane.showInputDialog("Número de paradas:"));

        gestor.agregarEntidad(
                new RutaGastronomica(nombre, horas, paradas));
    }

    private void agregarPaseo() {

        String nombre = JOptionPane.showInputDialog("Nombre del paseo:");
        int horas = Integer.parseInt(
                JOptionPane.showInputDialog("Duración (horas):"));
        String embarcacion = JOptionPane.showInputDialog("Tipo de embarcación:");

        gestor.agregarEntidad(
                new PaseoLacustre(nombre, horas, embarcacion));
    }

    private void agregarExcursion() {

        String nombre = JOptionPane.showInputDialog("Nombre de la excursión:");
        int horas = Integer.parseInt(
                JOptionPane.showInputDialog("Duración (horas):"));
        String lugar = JOptionPane.showInputDialog("Lugar histórico:");

        gestor.agregarEntidad(
                new ExcursionCultural(nombre, horas, lugar));
    }
}