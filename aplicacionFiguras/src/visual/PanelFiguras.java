package visual;

import controlador.Driver;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelFiguras extends JPanel{
    
    private JButton cuadrado;
    private JButton circulo;
    private JButton triangulo;
    
    public PanelFiguras(Componentes componentes, Color colorFondo) {
        setBackground(colorFondo);
        cuadrado = new JButton("Cuadrado");
        cuadrado= componentes.devolverBoton("Cuadrado", 0, 0, 0, 0, null, null, null, colorFondo,Color.white, 0,2); 
        cuadrado.addActionListener(Driver.controlador);
        circulo =componentes.devolverBoton("Circulo", 0, 0, 0, 0, null, null, null, colorFondo,Color.white, 0,2); 
        circulo.addActionListener(Driver.controlador);
        triangulo = componentes.devolverBoton("Triangulo", 0, 0, 0, 0, null, null, null, colorFondo,Color.white, 0,2); 
        triangulo.addActionListener(Driver.controlador);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(cuadrado);
        this.add(circulo);
        this.add(triangulo);
    }

    public JButton getCuadrado() {
        return cuadrado;
    }

    public JButton getCirculo() {
        return circulo;
    }

    public JButton getTriangulo() {
        return triangulo;
    }  
}
