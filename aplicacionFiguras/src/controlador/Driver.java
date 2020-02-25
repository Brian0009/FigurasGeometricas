package controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import logica.Figura;
import visual.Ventana;

public class Driver  {
    public static ControladorEventos controlador = new ControladorEventos();
    public static Color colorSeleccionado = new Color(255,102,0);
    
    public static Ventana miventana;
    
    public static ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
    public static ArrayList<Figura> listaFigurasAuxiliar = new ArrayList<Figura>();

    public static void dibujarFiguras(Graphics g) {
        for (Figura listaFigura : listaFiguras) {
            listaFigura.dibujar(g);
        }
        for (Figura listaFigura : listaFigurasAuxiliar) {
            listaFigura.dibujar(g);
        }
    }
}