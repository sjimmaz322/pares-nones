package sjimmaz322;

import javax.swing.JOptionPane;



public class ParteA {

    public static void main(String[] args) {
        
        int numDedosJugadorA;
        int numDedosJugadorB;
        int apuesta;
        do{
        String apuestaText = JOptionPane.showInputDialog(null, "¿Apuestas por Pares o por Nones?"+
                "\n"+"1 para nones"+"\n"+"2 para pares");
        apuesta = Integer.parseInt(apuestaText);
        
        switch (apuesta){
            case 1:
                //JOption
            break;
            
            case 2:
                //JOption
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Los valores aceptables son 1 o 2");
            break;
                            
                
        }
        }while(!(apuesta==1 || apuesta==2));
        
    }

}
