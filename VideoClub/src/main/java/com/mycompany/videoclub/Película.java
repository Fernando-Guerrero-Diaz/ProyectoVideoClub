
package com.mycompany.videoclub;


public class Película {
    private String nombre;
    private String director;
    private String[] actoresPrincipales;
    private String[] géneros;
    private float puntuación;
    private int stock;
    private int arriendos;
    private int precioArriendo;

    public Película(String nombre, String director, float puntuación, int stock, int arriendos, int precioArriendo) {
        this.nombre = nombre;
        this.director = director;
        actoresPrincipales = new String[3];
        géneros = new String[3];
        this.puntuación = puntuación;
        this.stock = stock;
        this.arriendos = arriendos;
        this.precioArriendo = precioArriendo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String[] getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(String[] actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public String[] getGéneros() {
        return géneros;
    }

    public void setGéneros(String[] géneros) {
        this.géneros = géneros;
    }

    public float getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(float puntuación) {
        this.puntuación = puntuación;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getArriendos() {
        return arriendos;
    }

    public void setArriendos(int arriendos) {
        this.arriendos = arriendos;
    }

    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }
    
    public void Print(){
        System.out.println("Nombre de Película: " + nombre);
        System.out.println("Director: " + director);
        System.out.print("Actores principales: " + actoresPrincipales[0]);
        if (actoresPrincipales[1] != null) System.out.print(", " + actoresPrincipales[1]);
        if (actoresPrincipales[2] != null) System.out.print(", " + actoresPrincipales[2]);
        System.out.println("");
        System.out.print("Género: " + géneros[0]);
        if (géneros[1] != null) System.out.print(", " + géneros[1]);
        if (géneros[2] != null) System.out.print(", " + géneros[2]);
        System.out.println("");
        System.out.println("Puntuación: " + Float.toString(puntuación));
        System.out.println("Stock: " + Integer.toString(stock));
        System.out.println("Arriendos: " + Integer.toString(arriendos));
        System.out.println("Precio de Arriendo: " + Integer.toString(precioArriendo));
    }
}
