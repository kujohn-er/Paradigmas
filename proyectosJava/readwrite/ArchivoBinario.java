package readwrite;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class ArchivoBinario {

    private void escritorBinario(){
        try {
            FileOutputStream archivo=new FileOutputStream ("archivoPersonas.bin");
            ObjectOutputStream escritura=new ObjectOutputStream(archivo);
            escritura.writeObject(new Persona(15,"JONATHAN"));
            System.out.println("datos guardados con exito");
            escritura.close();
        } catch (Exception e) {
            System.out.println("XD");
        }
    }
    private void lectorBinario(){
        try {
            FileInputStream archivo = new FileInputStream("archivoPersonas.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);
    
            while (true) {
                Persona persona = (Persona) lectura.readObject();
                if (persona != null) {
                    System.out.println(persona.toString());
                } else {
                    break; // Salir del bucle cuando no haya más datos que leer
                }
            }
            lectura.close();
        } catch (EOFException e) {
            System.out.println("Fin del archivo.");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        ArchivoBinario prueba= new ArchivoBinario();
        prueba.escritorBinario();
        prueba.lectorBinario();
    }
}
