package Ejercicio11;

// Fig. 12.31: MarcoDetallesRaton.java

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MarcoDetallesRaton extends JFrame {
    private String detalles; 
    private final JLabel barraEstado; 

    
    public MarcoDetallesRaton() {
        super("Clics y botones del raton");
        barraEstado = new JLabel("Haga clic en el raton");
        add(barraEstado, BorderLayout.SOUTH);
        addMouseListener(new ManejadorClicRaton()); // agrega el manejador
    }

    // clase interna para manejar los eventos del ratón
    private class ManejadorClicRaton extends MouseAdapter {
        // maneja evento de clic del ratón y determina cuál botón se oprimió
        @Override
        public void mouseClicked(MouseEvent evento) {
            detalles = String.format("Se hizo clic %d vez(veces)", evento.getClickCount());
            
            if (evento.isMetaDown()) // botón derecho del ratón 
            detalles += " con el boton derecho del raton";
            else if (evento.isAltDown()) // botón central del ratón
            detalles += " con el boton central del raton";
            else // botón izquierdo del ratón 
            detalles += " con el boton izquierdo del raton";
            barraEstado.setText(detalles); // muestra mensaje en barraEstado
        }
    }
} // fin de la clase MarcoDetallesRaton