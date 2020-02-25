package visual;

import controlador.Driver;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ventana extends JFrame{

    private PanelFiguras panelFiguras;
    private PanelDatosFigura panelDatosFigura;
    private Lienzo lienzo;
    private Componentes componentes;
    private Border borde1;
    private Color colorFondo;
    
    public Ventana() {
        
        componentes=new Componentes();
        colorFondo=new Color(31, 43, 52);
        borde1=  BorderFactory.createLineBorder(new Color(21, 33, 42), 2, true);
        panelFiguras = new PanelFiguras(componentes, colorFondo);
        panelDatosFigura = new PanelDatosFigura(componentes, colorFondo);
        lienzo = new Lienzo();
        lienzo.addMouseListener(Driver.controlador);
        lienzo.addMouseMotionListener(Driver.controlador);
        
        this.setLayout(new BorderLayout());
        JPanel p = new JPanel(new FlowLayout());
        p.setBackground(colorFondo);
        p.setBorder(borde1);
        p.add(panelFiguras);
        p.add(panelDatosFigura);
        this.add(p, BorderLayout.NORTH);
        this.add(lienzo, BorderLayout.CENTER);
        
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public PanelFiguras getPanelFiguras() {
        return panelFiguras;
    }

    public PanelDatosFigura getPanelDatosFigura() {
        return panelDatosFigura;
    }
  
    public Lienzo getLienzo() {
        return lienzo;
    } 
}