package practica;

public class PruebaHotel {
    public static void main(String[] args) {
        
        Habitacion habitacion1 = new habitacionIndividual(9, 90, 2, false);
        Habitacion habitacion2 = new habitacionDoble(404, 170.0, 2, 2);
        Habitacion habitacion3 = new habitacionFamiliar(54,250, 4, true);
        Habitacion habitacion4 = new habitacionSuit(32, 400, 1, true,true);

        System.out.println("Informacion de la primera habitacion: ");
        habitacion1.mostrarInformacion();
        System.out.println("Informacion de la segunda habitacion: ");
        habitacion2.mostrarInformacion();
        System.out.println("Informacion de la tercera habitacion: ");
        habitacion3.mostrarInformacion();
        System.out.println("Informacion de la cuarta habitacion: ");
        habitacion4.mostrarInformacion();


    }
}
