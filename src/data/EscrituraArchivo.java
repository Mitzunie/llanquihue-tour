package data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.Registrable;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class EscrituraArchivo {

    private static final String RUTA_ARCHIVO = "src/datos/servicios.txt";

    public void guardarServicio(Registrable entidad) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true))) {

            if (entidad instanceof RutaGastronomica ruta) {

                bw.write("RUTA;"
                        + ruta.getNombre() + ";"
                        + ruta.getDuracionHoras() + ";"
                        + ruta.getNumeroDeParadas());

            } else if (entidad instanceof PaseoLacustre paseo) {

                bw.write("PASEO;"
                        + paseo.getNombre() + ";"
                        + paseo.getDuracionHoras() + ";"
                        + paseo.getTipoEmbarcacion());

            } else if (entidad instanceof ExcursionCultural excursion) {

                bw.write("EXCURSION;"
                        + excursion.getNombre() + ";"
                        + excursion.getDuracionHoras() + ";"
                        + excursion.getLugarHistorico());

            }

            bw.newLine();

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo.");

            e.printStackTrace();

        }

    }

}