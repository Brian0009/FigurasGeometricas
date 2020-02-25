package logica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 *
 * @author Estudiantes
 */
public class Triangulo extends Figura {
    private int posX[]=new int[3];
    private int posY[]=new int[3];
    private Point puntoFinal;
    private boolean lleno;
    private MouseEvent evento;

    public Triangulo(Point posicion, Color c, Point p, MouseEvent e, boolean lleno) {
        super(posicion, c);
        this.puntoFinal=p;
        this.lleno=lleno;
        this.evento=e;
    }
    
    public Point getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(Point puntoFinal) {
        this.puntoFinal = puntoFinal;
    }
       

    @Override
    public void dibujar(Graphics g) {
        if(!lleno){
            posX[0] =(this.getPosicion().x+puntoFinal.x)/2;
            posX[1]=puntoFinal.x;
            posX[2]=this.getPosicion().x;
            posY[0] =this.getPosicion().y;
            posY[1]=puntoFinal.y;
            posY[2]=puntoFinal.y;
            g.setColor(this.getC());
            g.drawPolygon(posX, posY,  3);
        }
        if(lleno){
            posX[0] =(this.getPosicion().x+evento.getPoint().x)/2;
            posX[1]=evento.getPoint().x;
            posX[2]=this.getPosicion().x;
            posY[0] =this.getPosicion().y;
            posY[1]=evento.getPoint().y;
            posY[2]=evento.getPoint().y;
            g.setColor(this.getC());
            g.drawPolygon(posX, posY,  3);
            g.setColor(Color.white);
            g.drawString("B= "+Math.abs((evento.getPoint().x)-this.getPosicion().x)+"",((evento.getPoint().x+this.getPosicion().x)/2)-5, (evento.getPoint().y)+15); 
            g.drawString("A= "+Math.abs((evento.getPoint().y)-this.getPosicion().y)+"",(this.getPosicion().x)-45, ((evento.getPoint().y+this.getPosicion().y)/2)-5); 
        }
    }

    @Override
    public float getArea(Point puntoInicial, Point puntoFinal) {
        float base = Math.abs(puntoFinal.x - puntoInicial.x);
        float altura = Math.abs(puntoFinal.y - puntoInicial.y);        
        return base * altura / 2;
    }

    @Override
    public float getPerimetro(Point puntoInicial, Point puntoFinal) {
        float base = Math.abs(puntoFinal.x - puntoInicial.x);
        float altura = Math.abs(puntoFinal.y - puntoInicial.y);
        float hipotenusa = (float) Math.sqrt(Math.pow((base)/2, 2) + Math.pow(altura, 2));
        return base + hipotenusa*2;
    }
}