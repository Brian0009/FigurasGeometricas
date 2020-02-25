package visual;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 * @author Cristian
 */
public class Componentes {
    private JButton boton;
    private JPanel panel;
    private JLabel label;
    private JTextField text;
        
    public JButton devolverBoton(String cadena, int x, int y, int ancho, int largo, Cursor mano, ImageIcon imagen, Font fuente, Color colorFondo, Color colorFuente, int direccion, int tipo){
        boton= new JButton(cadena);
        boton.setBounds(x, y, ancho, largo);
        if(tipo==1){
            boton.setBorder(null);
            boton.setContentAreaFilled(false);
        }
        boton.setFocusable(false);
        if(mano!=null)
        boton.setCursor(mano);
        if(imagen!=null)
        boton.setIcon(imagen);
        if(fuente!=null)
        boton.setFont(fuente);
        if(colorFondo!=null)
            boton.setBackground(colorFondo);
        if(colorFuente!=null)
        boton.setForeground(colorFuente);
        switch(direccion){
            case 1:
                boton.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case 2:
                boton.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            default:
                break;
        }
        return boton;
    }
    
    public JPanel devolverPanel(int x, int y, int ancho, int alto, Color color, Border borde){
        panel = new JPanel(); 
        panel.setBounds(x, y, ancho, alto); 
        if(color!=null)
            panel.setBackground(color);
        if(borde!=null)
            panel.setBorder(borde);
        panel.setLayout(null);
        return panel;
    }
    
    public JLabel devolverLabel(String cadena, int x, int y, int ancho, int alto, ImageIcon imagen, Color color, Font fuente){        
        label= new JLabel(cadena);
        label.setBounds(x, y, ancho, alto);
        if(imagen!=null)
            label.setIcon(imagen);
        if(color!=null)
            label.setForeground(color);
        if(fuente!=null)
            label.setFont(fuente);
        return label;
    }
    
    public JTextField devolverTextField(String cadena, int x, int y, int ancho, int alto,Color colorFondo, Color colorFuente, Font fuente, Border borde){        
        text = new JTextField();
        text.setBounds(x,y, ancho, alto);
        text.setText(cadena);
        text.setForeground(colorFondo);
        text.setCaretColor(colorFuente);
        text.setBorder(borde);
        return text;
    }
}