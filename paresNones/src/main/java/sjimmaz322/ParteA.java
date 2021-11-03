package sjimmaz322;

import javax.swing.JOptionPane;

public class ParteA {

    public static void main(String[] args) {
        //Declaramos las variables que usaremos
        int numDedosA;
        int numDedosB;
        int selection;
        int suma;
        //Creamos el bucle que nos permitirá repetir el programa hasta que queramos
        do {
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
                        String dedosAText = JOptionPane.showInputDialog("Jugador A" + "\n" + "¿Cuántos dedos quieres usar?");
                        numDedosA = Integer.parseInt(dedosAText);
                        if (numDedosA < 0 || numDedosA > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 0 y 10 dedos");
                        }
                    } while ((numDedosA < 0 || numDedosA > 10));
                    //Mismo bucle empleado para el jugador A
                    do {
                        String dedosBText = JOptionPane.showInputDialog("Jugador B" + "\n" + "¿Cuántos dedos quieres usar?");
                        numDedosB = Integer.parseInt(dedosBText);
                        if (numDedosB < 0 || numDedosB > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 0 y 10 dedos");
                        }
                    } while ((numDedosB < 0 || numDedosB > 10));
                    //Suma para si el numero resultante es par o impar
                    suma = numDedosA + numDedosB;
                    //Condición para saber que mensaje mostrar dependiento del resto de la división de la suma por 2
                    //En caso de que sea par
                    if (suma % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido pares, gana el jugador B"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es par");
                    //En caso de que sea impar
                    } else if (!(suma % 2 == 0)) {
                        JOptionPane.showMessageDialog(null, "Apostaste por nones, ha salido nones, gana el jugador A"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es impar o sea nones");
                    }

                    break;
                    
                //Caso de apostar por pares
                case 2:
                    do {
                        String dedosAText = JOptionPane.showInputDialog("Jugador A" + "\n" + "¿Cuántos dedos quieres usar?");
                        numDedosA = Integer.parseInt(dedosAText);
                        if (numDedosA < 0 || numDedosA > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 0 y 10 dedos");
                        }
                    } while ((numDedosA < 0 || numDedosA > 10));
                    
                    //Mismo bucle empleado para el jugador A
                    do {
                        String dedosBText = JOptionPane.showInputDialog("Jugador B" + "\n" + "¿Cuántos dedos quieres usar?");
                        numDedosB = Integer.parseInt(dedosBText);
                        if (numDedosB < 0 || numDedosB > 10) {
                            JOptionPane.showMessageDialog(null, "Solo tienes dos manos, puedes sacar entre 0 y 10 dedos");
                        }
                    } while ((numDedosB < 0 || numDedosB > 10));
                    
                    //Suma para si el numero resultante es par o impar
                    suma = numDedosA + numDedosB;
                    
                    //Condición para saber que mensaje mostrar dependiento del resto de la división de la suma por 2
                    //En caso de que sea par
                    if (suma % 2 == 0) {
                        JOptionPane.showMessageDialog(null, "Apostaste por pares, ha salido pares, gana el jugador A"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
                                + "La suma da " + suma + " que es par");
                        
                    //En caso de que sea impar
                    } else if (!(suma % 2 == 0)) {
                        JOptionPane.showMessageDialog(null,"Apostaste por nones, ha salido nones, gana el jugador B"
                                + "\n" + "El jugador A sacó " + numDedosA + " dedos, y el jugador B sacó " + numDedosB + " dedos" + "\n"
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
