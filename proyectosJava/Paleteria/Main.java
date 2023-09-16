package Paleteria;

public class Main {
    public static void main(String[] args) {
        try {
            PaletaAgua paleta1 = new PaletaAgua("limon", true);
            paleta1.mostrarInformacion();
            paleta1.mostrarBaseAgua();
            paleta1.ponerAditivo();
        } catch (PaletaInvalidaException e) {
            System.out.println("Error al crear una paleta: " + e.getMessage());
        }

        try {
            PaletaCrema paleta2 = new PaletaCrema("queso", true);
            paleta2.mostrarInformacion();
            paleta2.mostrarTexturaCremosa();
            ((aditivo) paleta2).ponerAditivo();
        } catch (PaletaInvalidaException e) {
            System.out.println("Error al crear una paleta: " + e.getMessage());
        }
    }
    
}