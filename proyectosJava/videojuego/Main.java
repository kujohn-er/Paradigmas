package videojuego;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();

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
        Collections.sort(personajes, (Jugador,Enemigo)-> Jugador.nombre.compareTo(Enemigo.nombre));
        for (Personaje personaje : personajes) {
            personaje.atacar();
            System.out.println();
        }
        Iterator<Personaje> it = personajes.iterator();
        while (it.hasNext()) {
            Personaje personaje = it.next();
            System.out.println(personaje.getNombre());
        }



    }
    
}
