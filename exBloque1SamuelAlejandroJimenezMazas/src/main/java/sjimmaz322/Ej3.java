package sjimmaz322;

import javax.swing.JOptionPane;

public class Ej3 {

    public static void main(String[] args) {
        //Declaramos las variables
        double a = 0, b = 0, c = 0;
        double x1, x2;
        //Declaramos e inicializamos la variable booleana para controlar que los datos sean correctos
        boolean error = false;
        do {//Bucle para repetir en caso de que b²-4ac resulte en un número negativo
            //Pedimos los valores por JOption y convertimos de String a Double
            do { //Si el valor es inválido, lo pedimos de nuevo
                error = false;
                String aLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de a");
                try {

                    a = Double.parseDouble(aLetra);

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un carácter inválido\n"
                            + " Por favor introduzca un número");
                    error = true;
                }
            } while (error == true);

            do { //Si el valor es inválido, lo pedimos de nuevo
                error = false;
                String bLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de b");
                try {
                    b = Double.parseDouble(bLetra);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un carácter inválido\n"
                            + " Por favor introduzca un número");
                    error = true;
                }
            } while (error == true);

            do { //Si el valor es inválido, lo pedimos de nuevo
                error = false;
                String cLetra = JOptionPane.showInputDialog(null, "Introduzca el valor de c");
                try {
                    c = Double.parseDouble(cLetra);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Ha introducido un carácter inválido\n"
                            + " Por favor introduzca un número");
                    error = true;
                }
            } while (error == true);
            if (((Math.pow(b, 2)) - (4 * a * c)) < 0) {
                JOptionPane.showMessageDialog(null, "b²-4ac no puede tener como resultado un número negativo\n"
                        + "Pista: Pruebe aumentando el valor de b");
            }
        } while (((Math.pow(b, 2)) - (4 * a * c)) < 0);

        //Condiciones dadas en el enunciado
        if ((a == 0) && (b == 0)) {
            System.out.println("La ecuación no tiene solución posible");
        } else if ((a == 0) && (b != 0)) {
            x1 = (-1 * (double) c) / (double) b;
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
