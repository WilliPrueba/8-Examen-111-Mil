package com.company;

import java.util.ArrayList;
import java.util.List;

public class Revista {
    private List <Articulo> elementos;
    private String titulo;
    private int ejemplar;

    public Revista(String titulo, int ejemplar) {
        this.elementos = new ArrayList <Articulo>();
        this.titulo = titulo;
        this.ejemplar = ejemplar;
    }

    public boolean addElemento(Articulo articulo) {
        return elementos.add( articulo );
    }

    public Articulo getArticuloPosicion(int posicion) {
        if (posicion >= elementos.size() || posicion < 0) {
            return null;
        }
        return elementos.get( posicion );
    }
}
