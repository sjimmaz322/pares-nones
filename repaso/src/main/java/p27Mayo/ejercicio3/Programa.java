package p27Mayo.ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        String linea;
        String[] tokens;
        String idFichero = "matriz.txt";
        String[][] matriz = new String[5][5];

        try ( Scanner datosFichero = new Scanner(new File(idFichero), "UTF-8")) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                
                tokens = linea.split(" ");
                
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        
                    }
                }
                
                

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}
