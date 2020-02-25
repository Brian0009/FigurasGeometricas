package visual;

import controlador.Driver;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Lienzo extends JPanel {

    public Lienzo() {
        this.setBackground(new Color(31, 43, 52));  
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Driver.dibujarFiguras(g);
    }
}
