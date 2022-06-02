package daw.samuelalejandrojimenezmazas;

import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {
        LibroElectronico libro1 = new LibroElectronico();
        LibroElectronico libro2 = new LibroElectronico();
        
        System.out.println(libro1.toString());//También valdría poner en el sout sólamente (libro1)
        System.out.println(" ");
        System.out.println(libro2.toString());
        System.out.println(" ");
        
        LibroElectronico libro3 = new LibroElectronico("","Virtual Inteligence Calculator & Operator (V.I.C.O.)", 3241, 9, 1);
        
        LibroElectronico libro4 = new LibroElectronico("","Estudiar Java y como sobrevivir", 5555, 6, 1);
        
        JOptionPane.showMessageDialog(null, libro3.toString());
        
        JOptionPane.showMessageDialog(null, libro4.toString());
        
        LibroElectronico libro5 = new LibroElectronico("","Programar, amor y odio mezclados", 12000, 12, 1);
        
        System.out.println(libro5.toString());
        System.out.println(" ");
        
        libro1.setNumPag(13000);
        
        System.out.println(libro1.toString());
        System.out.println(" ");
        
        libro2.setTamArchivo(15);
        
        System.out.println(libro2.toString());
        System.out.println(" ");
        
        libro3.pasarPagina();
        
        System.out.println(libro3.getPagActual());
        System.out.println(" ");
        
        libro3.retrocederPagina();
        
        System.out.println(libro3.getPagActual());
        System.out.println(" ");
        
        libro3.retrocederPagina();
        
        System.out.println(libro3.getPagActual());
        System.out.println(" ");
        
        libro3.saltar(15);
        System.out.println(libro3.getPagActual());
        System.out.println(" ");
        
        libro3.saltar(12000);
        System.out.println(libro3.getPagActual());
        System.out.println(" ");
        
        libro3.saltar(-12000);
        System.out.println(libro3.getPagActual());
        
        
    }

}
