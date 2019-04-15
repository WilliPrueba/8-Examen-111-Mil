package com.company;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String titulo;
    private String periodista;
    private List<String> temas;
    private int palabras;
    private String texto;
    private long idArticulo;

    public Articulo(String titulo, String periodista, int palabras, String texto, long idArticulo) {
        this.temas = new ArrayList <String >();
        this.titulo = titulo;
        this.periodista = periodista;
        this.palabras = palabras;
        this.texto = texto;
        this.idArticulo = idArticulo;
    }


}
