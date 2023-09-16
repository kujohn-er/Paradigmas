package GestionEmpleados;

public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado EA1=new EmpleadoAsalariado("enrique", 0.0, 35);
        EmpleadoPorHora EPH1= new EmpleadoPorHora("Juan",-4.0,9);
        

        System.out.println(EA1.mostrarInformacion());
        EA1.calcularBonificacion();

        System.out.println(EPH1.mostrarInformacion());
    }
}
