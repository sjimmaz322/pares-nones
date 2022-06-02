package sjimmaz322;

import javax.swing.JOptionPane;

public class Ej2 {

    public static void main(String[] args) {
        //Declaramos las variables
        double a = 0, b = 0, c = 0;
        double x1, x2;
        //Declaramos e inicializamos la variable booleana para controlar que los datos sean correctos
        boolean error = false;

        //Pedimos los valores por JOption y convertimos de String a Double
        do {
            error = false;
            String aLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de a");
            try {

                a = Double.parseDouble(aLetra);

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un carácter inválido\n"
                        + " por favor introduzca un número");
                error = true;
            }
        } while (!error);

        do {
            error = false;
            String bLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de b");
            try {
                b = Double.parseDouble(bLetra);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un carácter inválido\n"
                        + " por favor introduzca un número");
                error = true;
            }
        } while (!error);

        do {
            error = false;
            String cLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de c");
            try {
                c = Double.parseDouble(cLetra);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Ha introducido un carácter inválido\n"
                        + " por favor introduzca un número");
                error = true;
            }
        } while (!error);

        //Condiciones dadas en el enunciado
        if ((a == 0) && (b == 0)) {
            System.out.println("La ecuación no tiene solución posible");
        } else if ((a == 0) && (b != 0)) {
            x1 = (-1 * c) / b;
            System.out.println("La única solución posible es que x valga: " + x1);
        } else {
            //Calculamos los valores de x1 y x2
            x1 = ((-1) * b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / 2 * a;
            x2 = ((-1) * b - Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / 2 * a;

            if ((Math.pow(b, 2)) - (4 * a * c) < 0) {
                System.out.println("Los valores suministrados no permiten calcular las soluciones");
            } else {
                System.out.println("Las posibles soluciones para la ecuación son: " + x1 + " y " + x2);
            }
        }
    }
}
