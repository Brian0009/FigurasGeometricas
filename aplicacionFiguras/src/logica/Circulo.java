package logica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 *
 * @author Estudiantes
 */
public class Circulo extends Figura{
    
    private int radio;
    private boolean lleno;
    private MouseEvent evento;
    
    public Circulo(Point posicion, Color c, int radio, MouseEvent e, boolean lleno) {
        super(posicion, c);
        this.radio = radio;
        this.lleno=lleno;
        this.evento=e;
    }

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar(Graphics g) {
        if(!lleno){
            g.setColor(this.getC());
            g.drawOval(this.getPosicion().x-radio, this.getPosicion().y-radio, 2*radio, 2*radio);
        }
        if(lleno){
            float base = Math.abs(evento.getPoint().x - getPosicion().x);
            float altura = Math.abs(evento.getPoint().y - getPosicion().y);        
            float radio = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
            g.setColor(this.getC());
            g.drawOval(this.getPosicion().x-(int)evento.getPoint().distance(this.getPosicion()), this.getPosicion().y-(int)evento.getPoint().distance(this.getPosicion()), 2*(int)evento.getPoint().distance(this.getPosicion()), 2*(int)evento.getPoint().distance(this.getPosicion()));
            g.setColor(Color.white);
            g.drawString("R= "+radio,this.getPosicion().x, this.getPosicion().y); 
        }
    }    

    @Override
    public float getArea(Point puntoInicial, Point puntoFinal) {
        float base = Math.abs(puntoFinal.x - puntoInicial.x);
        float altura = Math.abs(puntoFinal.y - puntoInicial.y);        
        float radioCuadrado = (float) (Math.pow(base, 2) + Math.pow(altura, 2));        
        return (float) (radioCuadrado * Math.PI);
    }

    @Override
    public float getPerimetro(Point puntoInicial, Point puntoFinal) {
        float base = Math.abs(puntoFinal.x - puntoInicial.x);
        float altura = Math.abs(puntoFinal.y - puntoInicial.y);        
        float radio = (float) Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return (float) (2 * Math.PI * radio);
    }
}
