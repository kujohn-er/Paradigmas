package Ejercicio1;
import javax.swing.JOptionPane;

public class Suma {
    public static void main(String[] args) {
        // get users entry 
        String primerNumero = JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero = JOptionPane.showInputDialog("Introduzca el segundo entero");

        // converts String to int 
        int numero1 = Integer.parseInt(primerNumero);
        int numero2 = Integer.parseInt(segundoNumero);

        int suma = numero1 + numero2;

        // show results in JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es " + suma,
                "Suma de dos enteros", JOptionPane.PLAIN_MESSAGE);
    }
}