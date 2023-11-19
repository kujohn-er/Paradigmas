package figuras;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGenerica<FiguraGeometrica>> listaFiguras = new ArrayList<>();

        try {
            
            listaFiguras.add(new FiguraGenerica<>(new Circulo(5.0)));
            listaFiguras.add(new FiguraGenerica<>(new Triangulo(5, 5, 5)));
            listaFiguras.add(new FiguraGenerica<>(new Rectangulo(5, 7)));

            // Ordenar la lista de figuras por área
            Collections.sort(listaFiguras, (figura1, figura2) -> {
                double area1 = figura1.figura.calcularArea();
                double area2 = figura2.figura.calcularArea();
                return Double.compare(area1, area2);
            });

            System.out.println("figures ordered by a for");
            System.out.println("");

            // Mostrar características de las figuras ordenadas
            for (FiguraGenerica<FiguraGeometrica> figura : listaFiguras) {
                figura.mostrarCaracteristicas();
            }

        } catch (FiguraInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Iterator<FiguraGenerica<FiguraGeometrica>> iterator = listaFiguras.iterator();
        System.out.println("");
        System.out.println("show the figures ordered from smallest area to largest area");
        while (iterator.hasNext()) {
            FiguraGenerica<FiguraGeometrica>figura=iterator.next();
            figura.mostrarCaracteristicas();
            System.out.println();
        }
    }
}