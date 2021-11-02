package sjimmaz322;

import java.util.Random;
import javax.swing.JOptionPane;

public class ParteA {

    public static void main(String[] args) {

        Random numAleatorio = new Random();
        int numDedosMaquina = numAleatorio.nextInt(11);
        int numDedos;
        String numDedosText;
        String selection;
        int suma;

        selection = JOptionPane.showInputDialog(null, "¿Jugamos a Pares y Nones?" + "\n"
                + "Introduzca 1 para si" + "\n"
                + "Introduzca 0 para no");
        int option = Integer.parseInt(selection);
        switch (option){
            case 1:
        numDedosText = JOptionPane.showInputDialog(null, "¿Cuántos dedos quieres sacar?");
        numDedos = Integer.parseInt(numDedosText);
        suma =numDedosMaquina + numDedos;
        
        if (suma % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ha salido pares" + "\n" + "Tú sacaste: " + numDedos + "\n"
                    + "La máquina sacó: " + numDedosMaquina);

        } else {
            JOptionPane.showMessageDialog(null, "Ha salido nones" + "\n" + "Tú sacaste: " + numDedos + "\n"
                    + "La máquina sacó: " + numDedosMaquina);
        }
            break;
        
            case 0:
            JOptionPane.showMessageDialog(null, "Otra vez será");
            break;
            
            default:
            JOptionPane.showMessageDialog(null, "Las opciones válidas son 0 o 1");
            break;
        }

    }

}
