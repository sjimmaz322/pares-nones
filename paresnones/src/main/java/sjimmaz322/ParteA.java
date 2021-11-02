
package sjimmaz322;

import java.util.Random;
import javax.swing.JOptionPane;


public class ParteA {

    
    public static void main(String[] args) {
        
        Random numAleatorio = new Random();
        int numDedosMaquina = numAleatorio.nextInt(11);
        
        String numDedosText = JOptionPane.showInputDialog(null, "¿Cuántos dedos quieres sacar?");
        int numDedos = Integer.parseInt(numDedosText);
        
        int suma = numDedosMaquina + numDedos;
        
        if (suma%2 == 0){
            JOptionPane.showMessageDialog(null, "Ha salido pares");
            
        } else {
            JOptionPane.showMessageDialog(null, "Ha salido nones");
        }
    }
    
}
