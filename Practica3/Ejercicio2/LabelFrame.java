package Ejercicio2;

// Componentes Jlabel con texto e iconos.
import java.awt.FlowLayout; // orders the items
import javax.swing.JFrame; // provides basic characteristics of window
import javax.swing.JLabel; // show text and images
import javax.swing.SwingConstants; // common constant used with swing
import javax.swing.Icon; // interface to manipulate imagens
import javax.swing.ImageIcon; // charge the images

public class LabelFrame extends JFrame {
    private JLabel etiqueta1; // JLabel just text
    private JLabel etiqueta2; // JLabel made with text and an icon
    private JLabel etiqueta3; // JLabel with adicional text and an icon
    // the LabelFrame constructors add objets JLabel to JFrame
    public LabelFrame() {
        super("Prueba de JLabel");    
        setLayout(new FlowLayout()); // set the framework scheme
        // Constructor J Label with String argument
        etiqueta1 = new JLabel("Etiqueta con texto");
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1); // add etiqueta1 to JFrame
        // Constructor J Label with String argument, Icon and alignment
        Icon insecto = new ImageIcon(getClass().getResource( "insecto1.png"));
        etiqueta2 = new JLabel("Etiqueta con texto e icono", insecto, SwingConstants.LEFT);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add(etiqueta2); // add etiqueta2 to JFrame
        etiqueta3 = new JLabel(); // JLabel constructor without arguments
        etiqueta3.setText("Etiqueta con icono y texto en la parte inferior");
        etiqueta3.setIcon(insecto); // add icon to JLabel
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3); // add etiqueta3 to JFrame
    }
} // ends LabelFrame class