package logica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 * @author Estudiantes
 */
public class Cuadrado extends Figura{
    
    private Point puntoFinal;
    private MouseEvent evento;
    private boolean lleno = false;

    public Cuadrado(Point posicion, Color c, Point p, MouseEvent e, boolean lleno) {
        super(posicion, c);
        this.puntoFinal= p;
        this.evento=e;
        this.lleno=lleno;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public Point getLado() {
        return puntoFinal;
    }

    public void setLado(Point puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    @Override
    public void dibujar(Graphics g) {
        if(!lleno){
            g.setColor(this.getC());
            if(puntoFinal.x-this.getPosicion().x<0){
                g.drawRect(puntoFinal.x, this.getPosicion().y, this.getPosicion().x-puntoFinal.x, puntoFinal.y-this.getPosicion().y);
            }
            if(puntoFinal.y-this.getPosicion().y<0)
                g.drawRect(this.getPosicion().x, puntoFinal.y, puntoFinal.x-this.getPosicion().x, this.getPosicion().y-puntoFinal.y);
            if(puntoFinal.y-this.getPosicion().y<0 && puntoFinal.x-this.getPosicion().x<0)
                g.drawRect(puntoFinal.x, puntoFinal.y, this.getPosicion().x-puntoFinal.x, this.getPosicion().y-puntoFinal.y);
            g.drawRect(this.getPosicion().x, this.getPosicion().y, puntoFinal.x-this.getPosicion().x, puntoFinal.y-this.getPosicion().y);
        }
        if(lleno){
            if(puntoFinal.x-this.getPosicion().x<0 && puntoFinal.y-this.getPosicion().y>0){
                 g.setColor(this.getC());
                 g.drawRect(evento.getPoint().x, this.getPosicion().y, this.getPosicion().x-evento.getPoint().x,evento.getPoint().y-this.getPosicion().y);
                 g.setColor(Color.white);
                 g.drawString("base= "+Math.abs((evento.getPoint().x)-this.getPosicion().x)+"",((evento.getPoint().x+this.getPosicion().x)/2)-5, (this.getPosicion().y)-5); 
                 g.drawString("A= "+Math.abs((evento.getPoint().y)-this.getPosicion().y)+"",(this.getPosicion().x)+5, ((evento.getPoint().y+this.getPosicion().y)/2)-5); 
            }
            if(puntoFinal.y-this.getPosicion().y<0 && puntoFinal.x-this.getPosicion().x>0){
                g.setColor(this.getC());
                g.drawRect(this.getPosicion().x, evento.getPoint().y, evento.getPoint().x-this.getPosicion().x ,this.getPosicion().y-evento.getPoint().y);
                g.setColor(Color.white);
                g.drawString("base= "+Math.abs((evento.getPoint().x)-this.getPosicion().x)+"",((evento.getPoint().x+this.getPosicion().x)/2)-5, (this.getPosicion().y)+15); 
                g.drawString("A= "+Math.abs((evento.getPoint().y)-this.getPosicion().y)+"",(this.getPosicion().x)-45, ((evento.getPoint().y+this.getPosicion().y)/2)-5); 
            }
            if(puntoFinal.y-this.getPosicion().y<0 && puntoFinal.x-this.getPosicion().x<0){
                g.setColor(this.getC());
                g.drawRect(this.evento.getPoint().x, this.evento.getPoint().y, this.getPosicion().x-evento.getPoint().x ,this.getPosicion().y - evento.getPoint().y);
                g.setColor(Color.white);
                g.drawString("base= "+Math.abs((evento.getPoint().x)-this.getPosicion().x)+"",((evento.getPoint().x+this.getPosicion().x)/2)-5, (this.getPosicion().y)+15); 
                g.drawString("A= "+Math.abs((evento.getPoint().y)-this.getPosicion().y)+"",(this.getPosicion().x)+5, ((evento.getPoint().y+this.getPosicion().y)/2)-5); 
            }
            if(puntoFinal.x-this.getPosicion().x>0 && puntoFinal.y-this.getPosicion().y>0){
                g.setColor(this.getC());
                g.drawRect(this.getPosicion().x, this.getPosicion().y, evento.getPoint().x-this.getPosicion().x ,evento.getPoint().y-this.getPosicion().y);
                g.setColor(Color.white);
                g.drawString("B= "+Math.abs((evento.getPoint().x)-this.getPosicion().x)+"",((evento.getPoint().x+this.getPosicion().x)/2)-5, (this.getPosicion().y)-5); 
                g.drawString("A= "+Math.abs((evento.getPoint().y)-this.getPosicion().y)+"",(this.getPosicion().x)-45, ((evento.getPoint().y+this.getPosicion().y)/2)-5); 
            }
        }
    }

    @Override
    public float getArea(Point puntoInicial, Point puntoFinal) {
        float base = (float) Math.abs(puntoFinal.getX() - puntoInicial.getX());
        float altura = (float) Math.abs(puntoFinal.getY() - puntoInicial.getY());
        return base * altura;
    }

    @Override
    public float getPerimetro(Point puntoInicial, Point puntoFinal) {
        float base = (float) Math.abs(puntoFinal.getX() - puntoInicial.getX());
        float altura = (float) Math.abs(puntoFinal.getY() - puntoInicial.getY());
        return base * 2 + altura * 2;
    }
}