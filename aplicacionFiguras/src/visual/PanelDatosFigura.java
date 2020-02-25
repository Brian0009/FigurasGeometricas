package visual;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDatosFigura extends JPanel{
    
    private JLabel labelArea, labelPerimetro;
    private JLabel labelAreaValor, labelPerimetroValor;
    
    public PanelDatosFigura(Componentes componentes, Color colorFondo){
        setBackground(colorFondo);
        labelArea= componentes.devolverLabel("Area Fig Actual", 0, 0, 0, 0, null, Color.WHITE, null);
        labelPerimetro= componentes.devolverLabel("Perimetro Fig Actual", 0, 0, 0, 0, null, Color.WHITE, null);
        labelAreaValor= componentes.devolverLabel("000", 0, 0, 0, 0, null, Color.ORANGE, null);
        labelPerimetroValor= componentes.devolverLabel("000", 0, 0, 0, 0, null, Color.ORANGE, null);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(labelArea);
        this.add(labelAreaValor);
        this.add(labelPerimetro);
        this.add(labelPerimetroValor);
    }

    public JLabel getLabelAreaValor() {
        return labelAreaValor;
    }

    public void setLabelAreaValor(JLabel labelAreaValor) {
        this.labelAreaValor = labelAreaValor;
    }

    public JLabel getLabelPerimetroValor() {
        return labelPerimetroValor;
    }

    public void setLabelPerimetroValor(JLabel labelPerimetroValor) {
        this.labelPerimetroValor = labelPerimetroValor;
    }   
}
