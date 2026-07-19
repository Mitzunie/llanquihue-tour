package ui;

import javax.swing.JOptionPane;

import data.GestorServicios;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class Interfaz {

    private GestorServicios gestor;

    public Interfaz() {
        gestor = new GestorServicios();
    }

    public void iniciar() {

        int opcion = 0;

        do {

            try {

                String menu = """
                        LLANQUIHUE TOUR

                        1. Agregar Ruta Gastronómica
                        2. Agregar Paseo Lacustre
                        3. Agregar Excursión Cultural
                        4. Buscar Servicio
                        5. Mostrar Servicios
                        6. Recargar Archivo
                        7. Salir
                        """;

                String entrada = JOptionPane.showInputDialog(menu);

                if (entrada == null) {
                    break;
                }

                opcion = Integer.parseInt(entrada);

                switch (opcion) {

                    case 1 -> agregarRuta();

                    case 2 -> agregarPaseo();

                    case 3 -> agregarExcursion();

                    case 4 -> buscarServicio();

                    case 5 -> JOptionPane.showMessageDialog(
                            null,
                            gestor.obtenerServicios());

                    case 6 -> {
                        gestor.recargarServicios();
                        JOptionPane.showMessageDialog(
                                null,
                                "Servicios recargados correctamente.");
                    }

                    case 7 -> JOptionPane.showMessageDialog(
                            null,
                            "Gracias por utilizar Llanquihue Tour.");

                    default -> JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida.");

                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Debe ingresar un número válido.");

            }

        } while (opcion != 7);

    }

    private void agregarRuta() {

        try {

            String nombre = JOptionPane.showInputDialog("Nombre de la ruta:");
            int horas = Integer.parseInt(
                    JOptionPane.showInputDialog("Duración (horas):"));
            int paradas = Integer.parseInt(
                    JOptionPane.showInputDialog("Número de paradas:"));

            gestor.agregarEntidad(
                    new RutaGastronomica(nombre, horas, paradas));

            JOptionPane.showMessageDialog(
                    null,
                    "Ruta agregada correctamente.");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar valores numéricos válidos.");

        }

    }

    private void agregarPaseo() {

        try {

            String nombre = JOptionPane.showInputDialog("Nombre del paseo:");
            int horas = Integer.parseInt(
                    JOptionPane.showInputDialog("Duración (horas):"));
            String embarcacion = JOptionPane.showInputDialog("Tipo de embarcación:");

            gestor.agregarEntidad(
                    new PaseoLacustre(nombre, horas, embarcacion));

            JOptionPane.showMessageDialog(
                    null,
                    "Paseo agregado correctamente.");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar valores numéricos válidos.");

        }

    }

    private void agregarExcursion() {

        try {

            String nombre = JOptionPane.showInputDialog("Nombre de la excursión:");
            int horas = Integer.parseInt(
                    JOptionPane.showInputDialog("Duración (horas):"));
            String lugar = JOptionPane.showInputDialog("Lugar histórico:");

            gestor.agregarEntidad(
                    new ExcursionCultural(nombre, horas, lugar));

            JOptionPane.showMessageDialog(
                    null,
                    "Excursión agregada correctamente.");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar valores numéricos válidos.");

        }

    }

    private void buscarServicio() {

        String nombre = JOptionPane.showInputDialog(
                "Ingrese el nombre del servicio:");

        if (nombre == null || nombre.isBlank()) {
            return;
        }

        ServicioTuristico servicio = gestor.buscarServicio(nombre);

        if (servicio != null) {

            JOptionPane.showMessageDialog(
                    null,
                    servicio.toString());

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Servicio no encontrado.");

        }

    }

}