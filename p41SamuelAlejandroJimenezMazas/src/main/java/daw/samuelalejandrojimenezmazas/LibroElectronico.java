package daw.samuelalejandrojimenezmazas;

import org.apache.commons.lang3.RandomStringUtils;

public class LibroElectronico {

    /*
    La visibilidad private hace que los atributos solo puedan ser utilizados dentro de la misma clase,
    mientras que si son public podrán ser utilizados en cualquier lugar al ser la opción de privacidad
    menos restrictiva
     */
    
    //Estos son los atributos de la clase.
    private String identificador, nomLibro;
    private int numPag, tamArchivo, pagActual;

    public LibroElectronico() {//Método constructor por defecto sin parámetros
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.nomLibro = "Don Quijote de la Mancha";
        this.numPag = 1435;
        this.pagActual = 1;
    }

    public LibroElectronico(String identificador, String nomLibro, int numPag, int tamArchivo, int pagActual) {
        //Método constructor parametrizado
        this.identificador = RandomStringUtils.randomNumeric(3).toUpperCase();
        this.nomLibro = nomLibro;
        this.numPag = numPag;
        if (numPag > 9999 || numPag < 0) {
            this.numPag = 0;
        }
        this.tamArchivo = tamArchivo;
        if (tamArchivo > 10 || tamArchivo < 0) {
            this.tamArchivo = 0;
        }
        this.pagActual = pagActual;
    }

    //Métodos con getAtributo son los getters, como getIdentificador, getNomLibro...
    
    public String getIdentificador() {
        return identificador;
    }

    public String getNomLibro() {
        return nomLibro;
    }
    
    //Métodos con setAtributo son los setters, como en setNomLibro, setNumPag...
    public void setNomLibro(String nomLibro) {
        this.nomLibro = nomLibro;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        if (numPag > 9999) {
            numPag = 0;
        }
        this.numPag = numPag;
    }

    public int getTamArchivo() {
        return tamArchivo;
    }

    public void setTamArchivo(int tamArchivo) {
        if (tamArchivo > 10) {
            tamArchivo = 0;
        }
        this.tamArchivo = tamArchivo;
    }

    public int getPagActual() {
        return pagActual;
    }

    
    //Método toString() para facilitar la muestra de datos por consola o ventana.
    @Override
    public String toString() {
        return "LibroElectronico{" + " identificador = " + identificador + ", nomLibro = " + nomLibro + ", numPag = " + numPag + ", tamArchivo = " + tamArchivo + ", pagActual = " + pagActual + '}';
    }

    public void pasarPagina(){
        ++this.pagActual;
        if (this.pagActual>numPag){
            --pagActual;
        }
    }
    
    public void retrocederPagina(){
        --this.pagActual;
        if (this.pagActual<=0){
            ++pagActual;
        }
    }
    
    public void saltar (int numero){
        this.pagActual = (pagActual+numero);
        if (this.pagActual < 1 || this.pagActual<this.numPag){
            this.pagActual -= numero;
        }       
    }
}
