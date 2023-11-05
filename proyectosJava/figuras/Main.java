package figuras;

public class Main {
    public static void main(String[] args) {
        // Creamos el arreglo donde se guardan todas las figuras
        FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[5];
        
        try {

            figurasGeometricas[0] = new Circulo(3);
            figurasGeometricas[1] = new Circulo(5);
            figurasGeometricas[2] = new Rectangulo(3, 5);
            figurasGeometricas[3] = new Rectangulo(1, 4);
            figurasGeometricas[4] = new Triangulo(-1, 4, 6);

        } catch (FiguraInvalidaException e) {
            System.out.println("Error al crear una figura: " + e.getMessage());

        }

        // Usamos el for mejorado para mostrar las figuras y sus áreas
        for (FiguraGeometrica figuraGeometrica : figurasGeometricas) {
            if (figuraGeometrica != null) {
                System.out.println(figuraGeometrica.getNombre() + " Area: " + figuraGeometrica.calcularArea()+" Perimetro: "+ figuraGeometrica.calcularPerimetro());
            }
        }
    }
}