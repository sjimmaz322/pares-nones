package daw.vehiculos;

import java.util.Random;

public class Vehiculo {
    //Atributos
    
    String matricula;
    double tarifa;
    boolean disponible;
    String marca;
    String modelo;
    String color;
    String asientos;
    
    //Añadir random para recoger un valor de i de los arrays
    private static Random rd = new Random();
    //Generar las arrays de las cuales coger los datos
    private static String[] marcas = {"VolksWagen","Dacia","Seat","Opel","Mercedez","Nisan","Renault","KIA"};
    private static String[] plazas = {"2","3","4","5","6","7"};
    private static String[] colores = {"Negro","Blanco","Gris","Azul","Verde","Rojo","Amarillo","Rosa"};
    private static String[] modelos = {"SUV","Familiar","Todoterreno","Deportivo","Berlina","Compacto"};

    // El método constructor de la clase Vehiculo 
    public Vehiculo() {
        this.marca = marcas[rd.nextInt(marcas.length)];
        this.asientos = plazas[rd.nextInt(plazas.length)];
        this.color = colores[rd.nextInt(colores.length)];
        this.modelo = modelos[rd.nextInt(modelos.length)];
        this.tarifa = 100.0;
        this.disponible = true;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }
    

    public double getTarifa() {
        return this.tarifa;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void imprimirAtributos(){
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Marca: " + this.marca);
    }

    
}
    

