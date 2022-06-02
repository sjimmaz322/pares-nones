package sjimmaz322;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        int option = 0;
        boolean seguir, salir = true;
        String salirONo;
        Scanner sc = new Scanner(System.in);
        Scanner siSalir = new Scanner(System.in);
        do {
            salir = true;
            do {
                do {
                    seguir = true;
                    System.out.println("Bienvenido al menú");
                    System.out.println("Introduza la opción que desee");
                    System.out.println("1 - Cuenta atrás");
                    System.out.println("2 - Juego de dados");
                    System.out.println("3 - Salir");
                    try {
                        option = sc.nextInt();
                    } catch (InputMismatchException ime) {
                        System.out.println("Ha introducido un carácter inválido");
                        sc.nextLine();
                        seguir = false;
                    }
                    if (option != 1 && option != 2 && option != 3) {
                        System.out.println("Las opciones válidas son 1,2 o 3");
                    }
                } while (option != 1 && option != 2 && option != 3);
            } while (seguir == false);
            switch (option) {

                case 1:
                    System.out.println("Bienvenido a la cuenta atrás");
//                    int i;
//                    int aux;
                    for (int i = 1000; i >= 100; i = i - 5) {

//                        aux = i;
//                        aux -= 5;
                        System.out.print(i);
                        System.out.print(" - ");
                    }
                    break;
                case 2:
                    System.out.println("Opción aún no implementada");
                    break;
                case 3:
                    System.out.println("¿Desea salir? Para salir escriba 'SI' (Sin las comillas)");

                    salirONo = siSalir.nextLine();

                    switch (salirONo) {
                        case "SI":
//                            System.out.println("Gracias por participar");
//
//                            break;
                        case "Si":
//                            System.out.println("Gracias por haber participado");
//
//                            break;
                        case "sI":
//                            System.out.println("Gracias, hasta la próxima");
//
//                            break;
                        case "si":
                            System.out.println("Adios, gracias por participar");

                            break;
                        default:
                            System.out.println("No desea salir, comenzando de nuevo");
                            System.out.println(" ");
                            salir = false;
                            break;
                    }
                    break;
            }

        } while (salir == false);
    }

}
