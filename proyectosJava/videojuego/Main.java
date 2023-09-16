package videojuego;

public class Main {
    public static void main(String[] args) {
        Jugador heroe=new Jugador("sonic", "arquero", 5);
        Enemigo orco=new Enemigo("aorco", "orco", 0);
        try{
            heroe.ValidarNivel();

        }catch(IllegalArgumentException e){
            System.out.println("error. no hay nivel menor a 1. actualizando nivel a 1");
            heroe.setNivel(1);
        }
        try{
            heroe.atacar();
            orco.gritar();
        }catch(RuntimeException e){
            System.out.println("error. no puedes atacar si tienes un nivel menor a 5");
           
        }



    }
    
}
