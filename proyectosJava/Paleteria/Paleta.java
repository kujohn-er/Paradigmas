package Paleteria;
//CREAMOS LA CLASE PALETA setters getters etc

interface aditivo{
    void ponerAditivo();
}
public class Paleta {
    String sabor;
    Double precio;

    public Paleta(String sabor, Double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public void mostrarInformacion() {
        System.out.println("////////////////////////////////");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Precio: " + getPrecio());
    }

}


//creamos la subclase paletaAgua con un atributo baseAgua para saber si esta hecha a base de agua
class PaletaAgua extends Paleta implements aditivo{
    boolean baseAgua;
    public PaletaAgua(String sabor, boolean baseAgua) throws PaletaInvalidaException {
        super(sabor, 2.0);
        this.baseAgua = baseAgua;
        if (precio < 0) {
            throw new PaletaInvalidaException("El precio de la paleta no puede ser negativo.");
        }
    }
    public void mostrarBaseAgua() {
        System.out.println("Base de agua: " + (baseAgua?"si es a base de agua":"no es a base de agua"));
    }
    public void ponerAditivo(){
        System.out.println("se ha agregado chilito");

    }
}

class PaletaCrema extends Paleta {
    boolean cremosa;

    public PaletaCrema(String sabor, boolean cremosa) throws PaletaInvalidaException {
        super(sabor, -1.0);
        this.cremosa = cremosa;

        if (precio < 0) {
            throw new PaletaInvalidaException("El precio de la paleta no puede ser negativo.");
        }
    }
    public void mostrarTexturaCremosa() {
        System.out.println("Textura cremosa: " + (cremosa?"si contiene textura cremosa":"no contiene textura cremosa"));
    }

}

