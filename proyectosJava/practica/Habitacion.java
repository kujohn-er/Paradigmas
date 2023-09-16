package practica;

public class Habitacion {
    private int numero;
    private double precioNoche;
    private double nochesOcupadas;


    public Habitacion(int numero, double precioNoche, double nochesOcupadas) {
        this.numero = numero;
        this.precioNoche = precioNoche;
        this.nochesOcupadas=nochesOcupadas;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }
    
    
    public void mostrarInformacion(){
        System.out.println("Numero de habitacion: " + numero);
        System.out.println("Precio por noche: $" + precioNoche);
        System.out.println("Precio total:" + nochesOcupadas*precioNoche);
    }
}

class habitacionIndividual extends Habitacion {
    private boolean tieneVistaAlMar;

    public habitacionIndividual(int numero, double precioNoche, double nochesOcupadas, boolean tieneVistaAlMar) {
        super(numero, precioNoche, nochesOcupadas);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean siTieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
        System.out.println();
    }
}
class habitacionDoble extends Habitacion {
    private int numDeCamas;

    public habitacionDoble(int numero, double precioNoche, double nochesOcupadas, int numDeCamas) {
        super(numero, precioNoche, nochesOcupadas);
        this.numDeCamas = numDeCamas;
    }
    
    public int getNumeroDeCamas(){
        return numDeCamas;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numDeCamas);
        System.out.println();
    }
}
class habitacionFamiliar extends Habitacion {
    private boolean tieneVistaAlMar;

    public habitacionFamiliar(int numero, double precioNoche, double nochesOcupadas, boolean tieneVistaAlMar) {
        super(numero, precioNoche, nochesOcupadas);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean siTieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
        System.out.println();
    }
}
class habitacionSuit extends Habitacion {
    private boolean tieneVistaAlMar;
    private boolean tieneMucama;

    public habitacionSuit(int numero, double precioNoche, double nochesOcupadas, boolean tieneVistaAlMar, boolean tieneMucama) {
        super(numero, precioNoche, nochesOcupadas);
        this.tieneVistaAlMar = tieneVistaAlMar;
        this.tieneMucama=tieneMucama;
    }
    public boolean siTieneVistaAlMar() {
        return tieneVistaAlMar;
    }
    public boolean siTieneMucama(){
        return tieneMucama;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
        System.out.println("Tiene mucama?: " + (tieneMucama ? "Si" : "No"));
        System.out.println();
    }
}