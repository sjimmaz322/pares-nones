package sjimmaz322;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {

    /*
        Método genere un número aletorio en un rango.
        Dos números dados por el usuario.
        Tendrá un número determinado de vidas dado por el usuario.        
     */
    public static void main(String[] args) {

        int num1, num2, numGenerado, numIntentos, numPosible = 0;
        boolean acertado = true, mayorQue = true;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce el número máximo para el rango");
            num1 = sc.nextInt();

            System.out.println("Introduce el número mínimo para el rango");
            num2 = sc.nextInt();

            if ((num1 <= num2)) {
                System.out.println("El número máximo debe ser mayor que el número mínimo");
            }

        } while ((num1 <= num2));

        numGenerado = numeroGenerado(num1, num2);

        System.out.println("¿Cuántos intentos (vidas) crees que necesitarás?");
        numIntentos = sc.nextInt();

        do {

            System.out.println("¿Cuál crees que es el número?");
            numPosible = sc.nextInt();

            acertado = adivinar(numGenerado, numPosible);

            if (numPosible != numGenerado) {
                System.out.println("No has acertado, una vida menos, vuelve a intentarlo");
                numIntentos--;
                
                mayorQue = mayor(numGenerado, numPosible);
                
                if (mayorQue == true){
                    System.out.println("El número que buscas es mayor que el que has elegido"); 
                } else {
                    System.out.println("El número que buscas es menor que el que has elegido");
                }
                
                acertado = false;
            }

        } while ((acertado == false) && (numIntentos != 0));

        if (numIntentos == 0) {
            System.out.println("GAME OVER");
            System.out.println("HAS PERDIDO");
        }
        if (numGenerado == numPosible) {
            System.out.println("ACERTASTE EL NÚMERO");
            System.out.println("HAS GANADO");
        }

    }

    private static int numeroGenerado(int num1, int num2) {

        Random numAleatorio = new Random();
        // int n = numAleatorio.nextInt (nMayor -nMenor +1) +nMenor;

        int numGenerado = numAleatorio.nextInt(num1 - num2 + 1) + num2;

        return (numGenerado);
    }

    private static boolean adivinar(int numGenerado, int numPosible) {

        if (numGenerado > numPosible) {
            return true;

        } else {

            return false;
        }
    }
    
    private static boolean mayor (int numGenerado, int numPosible) {
        
        if (numGenerado>numPosible){
            return true;
        } else {
            return false;
        }
    }
}
