package sjimmaz322;

import javax.swing.JOptionPane;

public class Ej1 {

    public static void main(String[] args) {
        //Declaramos las variables
        double a, b, c;
        double x1, x2;
        //Pedimos los valores por JOption y convertimos de String a Double
        String aLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de a");
        a = Double.parseDouble(aLetra);

        String bLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de b");
        b = Double.parseDouble(bLetra);

        String cLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de c");
        c = Double.parseDouble(cLetra);

        //Condiciones dadas en el enunciado
        if ((a == 0) && (b == 0)) {
            System.out.println("La ecuación no tiene solución posible");
        } else if ((a == 0) && (b != 0)) {
            x1 = (-1 * c) / b;
            System.out.println("La única solución posible es que x valga: " + x1);
        } else {
            //Calculamos los valores de x1 y x2
            x1 = ((-1) * b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);
            x2 = ((-1) * b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);

            if ((Math.pow(b, 2)) - (4 * a * c) < 0) {
                System.out.println("Los valores suministrados no permiten calcular las soluciones");
            } else {
                System.out.println("Las posibles soluciones para la ecuación son: " + x1 + " y " + x2);
            }

        }

    }

}
