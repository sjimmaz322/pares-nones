package p27Mayo.ejercicio3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import p27Mayo.ejercicio2.Datos;

public class Matriz {

    public static void main(String[] args) {

        String[][] matriz = lectura("matriz.txt");

        imprimirMatrizStr(matriz);

        buscarIslas(matriz);

    }

    public static String[][] lectura(String ruta) {
        List<Datos> lista = new ArrayList<>();

        // Variables para guardar los datos que se van leyendo
        String linea;
        String[] tokens;
        String[][] matriz = new String[5][5];
        int i = 0;

        try ( Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                //Lee linea sustituyendo las comas por puntos para los double
                linea = datosFichero.nextLine();

                tokens = linea.split(" "); //Crea el tokens

                matriz[i] = tokens; //Añade la linea a la matriz

                i++;
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return matriz;

    }

    public static void imprimirMatrizStr(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static void buscarIslas(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) { //Recorre la matriz
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j].equalsIgnoreCase("x")) { //Si es tierra, comprueba

                    if (esIsla(i, j, matriz)) { //Si es isla

                        System.out.println(i + ", " + j);

                    }

                }
            }
        }
    }

    public static boolean esIsla(int i, int j, String[][] matriz) {
        //Va de una posición antes a una después en la fila y en la columna
        for (int k = (i - 1); k <= (i + 1); k++) {
            for (int l = (j - 1); l <= (j + 1); l++) {

                if (!(k == i && l == j)) { //Descarta el valor de la posición en sí

                    //Sólo cuenta los valores que están dentro de la matriz
                    if (0 <= k && k < matriz.length && 0 <= l && l < matriz[0].length) {

                        if (matriz[k][l].equals("x")) {//Si alguna es tierra

                            return false;
                        }
                    }
                }
            }
        }

        return true; //Si no encuentra tierra, es isla
    }

}
