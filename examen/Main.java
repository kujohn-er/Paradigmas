package examen;

public class Main {
    public static void main(String[] args) {
        try {
            EmpleadoVendedor empleado1 = new EmpleadoVendedor("789012", "Pérez", "María", 3000, 0.08);
            EmpleadoPermanente empleado3 = new EmpleadoPermanente("345678", "López", "Carlos", 2000, "12345");

            System.out.println("\nInformación del empleado 2:");
            empleado1.mostrarInfo();
            System.out.println("Ingresos: " + empleado1.ingresos());
            System.out.println("Bonificación: " + empleado1.calcularBonificacion());
            System.out.println("Descuento: " + empleado1.calcularDescuento());
            System.out.println("Sueldo Neto: " + empleado1.calcularSueldoNeto());

            System.out.println("\nInformación del empleado 3:");
            empleado3.mostrarInfo();
            System.out.println("Sueldo Base: " + empleado3.getSueldoBase());
            System.out.println("Descuento: " + empleado3.calcularDescuento());
            System.out.println("Sueldo Neto: " + empleado3.calcularSueldoNeto());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
