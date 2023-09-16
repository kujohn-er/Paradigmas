package TRABAJADOR;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<trabajador> listaTrabajadores = new ArrayList<>();

        // Agregar 5 trabajadores a la lista
        listaTrabajadores.add(new obrero("juan", 32));
        listaTrabajadores.add(new obrero("julio", 28));
        listaTrabajadores.add(new obrero("jonas", 26));
        listaTrabajadores.add(new obrero("jaime", 39));
        listaTrabajadores.add(new obrero("jorge", 45));
        listaTrabajadores.add(new supervisor("jojo", 23));
        listaTrabajadores.add(new supervisor("jazz", 31));
        listaTrabajadores.add(new gerente("geras", 36));

        //informacion de los trabajadores del ArrayList
        System.out.println("      nombre   puesto     sueldo");
        System.out.println("//////////////////////////////////////////");
        for (trabajador t : listaTrabajadores) {
            System.out.println("//   "+t.getNombre()+"\t "+t.getPuesto()+"\t    "+t.getSueldo()+"\t"+"//");
        }
    }
}
