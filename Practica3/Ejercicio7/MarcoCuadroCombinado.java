package Ejercicio7;
// Fig. 12.21: MarcoCuadroCombinado.java
// Objet JComboBox shows a names list of the images
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MarcoCuadroCombinado extends JFrame {
    private final JComboBox<String> imagenesJComboBox; 
    private final JLabel etiqueta; 
    private static final String nombres[] = { "insecto11.gif", "insecto12.gif", "insecto13.gif", "insecto14.gif" };
    private final Icon[] iconos = {
        new ImageIcon(getClass().getResource("insecto11.gif")),
        new ImageIcon(getClass().getResource("insecto12.gif")),
        new ImageIcon(getClass().getResource("insecto13.gif")),
        new ImageIcon(getClass().getResource("insecto14.gif"))};



    public MarcoCuadroCombinado() {
        super("Prueba de JComboBox");
        setLayout(new FlowLayout()); 
        imagenesJComboBox = new JComboBox<String>(nombres); 
        imagenesJComboBox.setMaximumRowCount(3); 
        imagenesJComboBox.addItemListener(
                new ItemListener() // anonimous intern class
                {
                    @Override
                    public void itemStateChanged(ItemEvent evento) {
                        
                        if (evento.getStateChange() == ItemEvent.SELECTED)
                            etiqueta.setIcon(iconos[imagenesJComboBox.getSelectedIndex()]);
                    }
                } 
        ); 

        add(imagenesJComboBox); 
        etiqueta = new JLabel(iconos[0]); 
        add(etiqueta);
    }
} 