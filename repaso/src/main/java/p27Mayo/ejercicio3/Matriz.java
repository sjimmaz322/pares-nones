package p27Mayo.ejercicio3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        String[][] matriz = lectura("matriz.txt");

        ArrayList<String> listaIslas = new ArrayList<>();

        imprimirMatriz(matriz);

        listaIslas = buscarIslas(matriz, listaIslas);

        for (String listaIsla : listaIslas) {
            System.out.println(listaIsla);
        }

    }

    public static String[][] lectura(String ruta) {

        List<String> lista = new ArrayList<>();

        String linea;
        String[] tokens;
        String[][] matriz = new String[5][5];
        int i = 0;

        try ( Scanner datosFichero = new Scanner(new FileReader(ruta))) {

            // Mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();

                tokens = linea.split(" ");

                matriz[i] = tokens;

                i++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        return matriz;

    }

    public static void imprimirMatriz(String[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }

            System.out.println("");
        }
        System.out.println("");
    }

    public static ArrayList<String> buscarIslas(String[][] matriz, ArrayList<String> lista) {
        ArrayList<String> listado = lista;
        for (int i = 0; i < matriz.length; i++) { //Recorre la matriz
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j].equalsIgnoreCase("x")) { //Si es tierra, comprueba

                    if (esIsla(i, j, matriz)) { //Si es isla
                        lista.add(i + "," + j);
                    }

                }
            }
        }
        return listado;
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
