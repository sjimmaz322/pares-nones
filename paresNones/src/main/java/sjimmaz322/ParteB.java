package sjimmaz322;

import java.util.Random;
import javax.swing.JOptionPane;

public class ParteB {

    public static void main(String[] args) {
        //Declaradas las variables que vamos a usar
        int numDedos;
        int selection;
        int suma;

        do {
            //Declarada la variable para generar números aleatorio
            Random numAleatorio = new Random();
            //Declarada e inicializada la variable que generará un número aleatorio entre 0 y 10
            int numDedosMaquina = numAleatorio.nextInt(11);
            //Preguntamos por qué se quiere apostar o si se quiere abandonar el programa
            String apuestaText = JOptionPane.showInputDialog(null, "¿Apuestas por Pares o por Nones?"
                    + "\n" + "1 para nones" + "\n" + "2 para pares" + "\n" + "0 para salir");
            selection = Integer.parseInt(apuestaText);

            //Switch para seleccionar cada caso
            switch (selection) {

                //Caso de apostar por nones
                case 1:

                    //Bucle para solo permitir valores entre 0 y 10, o sea, los dedos que se pueden usar
                    do {
                        String dedosAText = JOptionPane.showInputDialog("Jugador" + "\n" + "¿Cuántos dedos quieres usar?");
                        numDedos = Integer.parseInt(dedosAText);
                        if (numDedos < 0 || numDedos > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 0 y 10 dedos");
                        }
                    } while ((numDedos < 0 || numDedos > 10));

                    //Suma para si el numero resultante es par o impar
                    suma = numDedos + numDedosMaquina;
                    //Condición para saber que mensaje mostrar dependiento del resto de la división de la suma por 2

                    //En caso de que sea par
                    if (suma % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido pares, gana la máquina"
                                + "\n" + "Sacaste " + numDedos + " dedos, y la máquina sacó " + numDedosMaquina + " dedos" + "\n"
                                + "La suma da " + suma + " que es par");
                        //En caso de que sea impar
                    } else if (!(suma % 2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido nones, ganaste"
                                + "\n" + "Sacaste " + numDedos + " dedos, y la máquina sacó " + numDedosMaquina + " dedos" + "\n"
                                + "La suma da " + suma + " que es impar o sea nones");
                    }

                    break;

                case 2:

                    //Caso de apostar por pares
                    do {
                        String dedosAText = JOptionPane.showInputDialog("Jugador" + "\n" + "¿Cuántos dedos quieres usar?");
                        numDedos = Integer.parseInt(dedosAText);
                        if (numDedos < 0 || numDedos > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 0 y 10 dedos");
                        }
                    } while ((numDedos < 0 || numDedos > 10));

                    //Suma para si el numero resultante es par o impar
                    suma = numDedos + numDedosMaquina;

                    //Condición para saber que mensaje mostrar dependiento del resto de la división de la suma por 2
                    //En caso de que sea par
                    if (suma % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Apostaste por pares, ha salido pares, ganaste"
                                + "\n" + "Tú sacaste " + numDedos + " dedos, y la máquina sacó " + numDedosMaquina + " dedos" + "\n"
                                + "La suma da " + suma + " que es par");

                        //En caso de que sea impar
                    } else if (!(suma % 2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido nones, gana la máquina"
                                + "\n" + "Tú sacaste " + numDedos + " dedos, y la máquina sacó " + numDedosMaquina + " dedos" + "\n"
                                + "La suma da " + suma + " que es impar o sea nones");
                    }
                    break;

                //Caso para la decisión de abandonar el programa
                case 0:
                    JOptionPane.showMessageDialog(null, "Entonces no jugamos" + "\n" + "Adios");
                    break;

                //Caso para cualquier valor no permitido
                default:
                    JOptionPane.showMessageDialog(null, "Los valores aceptables son 1, 2 o 0");
                    break;

            }

            //Condición de repetición
        } while (!(selection == 0));
    }
}
