package figuras;

interface calculos2d{
    double calcularArea();
    double calcularPerimetro();

}

class FiguraGenerica<T extends calculos2d> {
    private T figura;

    public FiguraGenerica(T figura) {
        this.figura = figura;
    }

    public String obtenerTipoFigura() {
        if (figura instanceof FiguraGeometrica) {
            return ((FiguraGeometrica) figura).getNombre();
        } else {
            return "sin datos sobre el tipo de figura";
        }
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tipo de figura: " + obtenerTipoFigura());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
    }
}

abstract class FiguraGeometrica implements calculos2d {
    String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInformacion() {
        System.out.println("////////////////////////////////");
        System.out.println("Figura: " + getNombre());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

}

class Circulo extends FiguraGeometrica  {
    private double radio;

    public Circulo(double radio) throws FiguraInvalidaException {
        super("Círculo");
        if (radio <= 0) {
            throw new FiguraInvalidaException("El radio debe ser mayor que cero.");
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

class Rectangulo extends FiguraGeometrica {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) throws FiguraInvalidaException {
        super("Rectángulo");
        if (largo <= 0 || ancho <= 0) {
            throw new FiguraInvalidaException("El largo y el ancho deben ser mayores que cero.");
        }
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }
    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}

class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) throws FiguraInvalidaException {
        super("Triángulo");
        if (!esTrianguloValido(lado1, lado2, lado3)) {
            throw new FiguraInvalidaException("No se puede crear un triángulo con los lados proporcionados.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área del triángulo aquí
        return 0;
    }
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    private boolean esTrianguloValido(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

class FiguraInvalidaException extends Exception {
    public FiguraInvalidaException(String mensaje) {
        super(mensaje);
    }
}