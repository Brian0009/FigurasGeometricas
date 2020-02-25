/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Estudiantes
 */
public abstract class Figura implements Dibujable{
    
    protected Point posicion;
    protected Color c;

    public Figura(Point posicion, Color c) {
        this.posicion = posicion;
        this.c = c;
    }
    
    abstract public float getArea(Point puntoInicial, Point puntoFinal);
    abstract public float getPerimetro(Point puntoInicial, Point puntoFinal);

    /**
     * @return the posicion
     */
    public Point getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    /**
     * @return the c
     */
    public Color getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Color c) {
        this.c = c;
    }
    
    
}
