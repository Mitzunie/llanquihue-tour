package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.Registrable;
import model.RutaGastronomica;

public class LectorArchivo {

    private static final String RUTA_ARCHIVO = "src/datos/servicios.txt";

    public ArrayList<Registrable> cargarServicios() {

        ArrayList<Registrable> entidades = new ArrayList<>();

        File archivo = new File(RUTA_ARCHIVO);

        if (!archivo.exists()) {
            System.out.println("El archivo '" + RUTA_ARCHIVO + "' no existe.");
            return entidades;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.isBlank()) {
                    continue;
                }

                String[] datos = linea.split(";");

                if (datos.length < 4) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                String tipo = datos[0].trim().toUpperCase();

                try {

                    switch (tipo) {

                        case "RUTA":
                            entidades.add(new RutaGastronomica(
                                    datos[1].trim(),
                                    Integer.parseInt(datos[2].trim()),
                                    Integer.parseInt(datos[3].trim())));
                            break;

                        case "PASEO":
                            entidades.add(new PaseoLacustre(
                                    datos[1].trim(),
                                    Integer.parseInt(datos[2].trim()),
                                    datos[3].trim()));
                            break;

                        case "EXCURSION":
                            entidades.add(new ExcursionCultural(
                                    datos[1].trim(),
                                    Integer.parseInt(datos[2].trim()),
                                    datos[3].trim()));
                            break;

                        default:
                            System.out.println("Tipo de servicio desconocido: " + tipo);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Error en los datos numéricos: " + linea);
                }

            }

        } catch (IOException e) {

            System.out.println("No fue posible leer el archivo de servicios.");

        }

        return entidades;

    }

}