package sjimmaz322;

import javax.swing.JOptionPane;



public class ParteA {

    public static void main(String[] args) {
        //Declaramos las variables que usaremos
        int numDedosJugadorA;
        int numDedosJugadorB;
        int apuesta;
        //Creamos el bucle que nos permitirá repetir el programa hasta que queramos
        do{
        //Preguntamos por qué se quiere apostar o si se quiere abandonar el programa
        String apuestaText = JOptionPane.showInputDialog(null, "¿Apuestas por Pares o por Nones?"+
                "\n"+"1 para nones"+"\n"+"2 para pares"+"\n"+"0 para salir");
        apuesta = Integer.parseInt(apuestaText);
        //Switch para seleccionar cada caso
        switch (apuesta){
            case 1:
                //JOption
            break;
            
            case 2:
                //JOption
            break;
            //Caso para la decisión de abandonar el programa
            case 0:
                JOptionPane.showMessageDialog(null, "Entonces no jugamos Ò.Ó"+"\n"+"Adios");
            break;
            //Caso para cualquier valor no permitido
            default:
                JOptionPane.showMessageDialog(null, "Los valores aceptables son 1 o 2");
            break;
                            
                
        }
        //Condición de repetición
        }while(!(apuesta==1 || apuesta==2 || apuesta==0));
        
    }

}
