package readwrite;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTexto {
    public static void main(String[] args) {
        String nombreArchivo = "archivoSalida";
        
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            BufferedWriter escritor = new BufferedWriter(archivo);

            escritor.write("this is a wrote line from escritor");
            escritor.close();

        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}