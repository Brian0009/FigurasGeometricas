package controlador;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import logica.Circulo;
import logica.Cuadrado;
import logica.Triangulo;

public class ControladorEventos implements ActionListener,MouseListener,MouseMotionListener {
    
    Point guardarDatoInicial;
    int tipoFigura = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Driver.miventana.getPanelFiguras().getCuadrado())){
            tipoFigura = 1;
        }
        if(e.getSource().equals(Driver.miventana.getPanelFiguras().getCirculo())){
            tipoFigura = 2;
        }
        if(e.getSource().equals(Driver.miventana.getPanelFiguras().getTriangulo())){
            tipoFigura = 3;
        }  
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(tipoFigura!=0){
            guardarDatoInicial = e.getPoint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {  
        if(tipoFigura==1){
            Driver.listaFiguras.add(new Cuadrado(guardarDatoInicial, Driver.colorSeleccionado, e.getPoint(), null, false)); 
            Driver.listaFigurasAuxiliar.clear();
            Driver.miventana.getLienzo().repaint();
        }
        if(tipoFigura==2){
            Driver.listaFiguras.add(new Circulo(guardarDatoInicial, Driver.colorSeleccionado, (int)e.getPoint().distance(guardarDatoInicial), null, false));            
            Driver.listaFigurasAuxiliar.clear();
            Driver.miventana.getLienzo().repaint();
        }
        if(tipoFigura==3){
            Driver.listaFiguras.add(new Triangulo(guardarDatoInicial, Driver.colorSeleccionado,e.getPoint(),null,false));  
            Driver.listaFigurasAuxiliar.clear();
            Driver.miventana.getLienzo().repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(tipoFigura==1){       
            Cuadrado cuadrado= new Cuadrado(guardarDatoInicial, Driver.colorSeleccionado, e.getPoint(), e, true);
            Driver.listaFigurasAuxiliar.clear();
            Driver.listaFigurasAuxiliar.add(cuadrado);
            Driver.miventana.getPanelDatosFigura().getLabelAreaValor().setText(cuadrado.getArea(guardarDatoInicial,e.getPoint())+"");
            Driver.miventana.getPanelDatosFigura().getLabelPerimetroValor().setText(cuadrado.getPerimetro(guardarDatoInicial,e.getPoint())+"");
            Driver.miventana.getLienzo().repaint(); 
        }
        if(tipoFigura==2){
            Circulo circulo = new Circulo(guardarDatoInicial, Driver.colorSeleccionado, (int)e.getPoint().distance(guardarDatoInicial), e, true);
            Driver.listaFigurasAuxiliar.clear();
            Driver.listaFigurasAuxiliar.add(circulo);  
            Driver.miventana.getPanelDatosFigura().getLabelAreaValor().setText(circulo.getArea(guardarDatoInicial,e.getPoint())+"");
            Driver.miventana.getPanelDatosFigura().getLabelPerimetroValor().setText(circulo.getPerimetro(guardarDatoInicial,e.getPoint())+"");
            Driver.miventana.getLienzo().repaint();
        }
        if(tipoFigura==3){
            Triangulo triangulo= new Triangulo(guardarDatoInicial, Driver.colorSeleccionado,e.getPoint(),e,true);
            Driver.listaFigurasAuxiliar.clear();
            Driver.listaFigurasAuxiliar.add(triangulo);  
            Driver.miventana.getPanelDatosFigura().getLabelAreaValor().setText(triangulo.getArea(guardarDatoInicial,e.getPoint())+"");
            Driver.miventana.getPanelDatosFigura().getLabelPerimetroValor().setText(triangulo.getPerimetro(guardarDatoInicial,e.getPoint())+"");
            Driver.miventana.getLienzo().repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
