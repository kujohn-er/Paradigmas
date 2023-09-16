package encapsulamiento;

public class Main {
    public static void main(String[] args) {
        //creamos cuatro Carros con su respectiva info
        Carro carro1=new Carro("toyota", 1978);
        Carro carro2=new Carro("ferrari", 1999);
        Carro carro3=new Carro("wolksvagen", 1995);
        Carro carro4=new Carro("mercedes", 2003);
        
        //mostramos la informacion de los 4 carros
        System.out.println(carro1.mostrarCarro());
        System.out.println(carro2.mostrarCarro());
        System.out.println(carro3.mostrarCarro());
        System.out.println(carro4.mostrarCarro());

    }
}
