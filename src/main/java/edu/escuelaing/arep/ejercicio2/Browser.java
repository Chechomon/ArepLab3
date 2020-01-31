package edu.escuelaing.arep.ejercicio2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author sergio.pena
 */
public class Browser {
    public static void main(String[] args) throws MalformedURLException {
        String url;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite una url");
        url = teclado.nextLine();
        URL uri = new URL(url);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(uri.openStream()));
            File archivo = new File("resultado.html");
            FileWriter escribir = new FileWriter(archivo, true);
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                escribir.write(inputLine);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
        teclado.close();
    }
}
