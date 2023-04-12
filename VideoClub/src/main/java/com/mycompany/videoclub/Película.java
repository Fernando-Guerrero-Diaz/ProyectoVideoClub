
package com.mycompany.videoclub;


public class Película {

    private String id;
    private String codigo;
    private String nombre;
    private String[] directores;
    //private String[] actoresPrincipales;
    private String[] géneros;
    private int puntuación;
    private int votos;
    private int stock;
    private int arriendos;
    private int cantVotos;
    


    public Película(String id, String nombre, String[] directores, int puntuación, int stock, int arriendos, String[] géneros, int votos) {
        this.id = id;
        this.nombre = nombre;
        this.directores = directores;
        this.géneros = géneros;
        this.puntuación = puntuación;
        this.stock = stock;
        this.arriendos = arriendos;
        this.votos = votos;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(int cantVotos) {
        this.cantVotos = cantVotos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getDirectores() {
        return directores;
    }

    public void setDirectores(String[] directores) {
        this.directores = directores;
    }
    /*
    public String[] getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(String[] actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }
*/
    public String[] getGéneros() {
        return géneros;
    }

    public void setGéneros(String[] géneros) {
        this.géneros = géneros;
    }

    public float getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public boolean addVoto(int votacion){
        if(votacion<0 || votacion >100) return false;
        puntuación = (puntuación*votos + votacion)/(votos +1);
        votos++;
        return true;
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

    public void print(){
        System.out.println("Nombre de Película: " + nombre);
        System.out.print("Directores: " + directores[0]);
        for (int i = 1; i<directores.length;i++ ){
            System.out.print(", " + directores[i]);
        }
        System.out.println("");
        System.out.print("Géneros: " + géneros[0]);
        for (int i = 1; i<géneros.length;i++ ){
            System.out.print(", " + géneros[i]);
        }
        System.out.println("");
        System.out.println("Puntuación: " + Float.toString(puntuación));
        System.out.println("Stock: " + Integer.toString(stock));
        System.out.println("Arriendos: " + Integer.toString(arriendos));

    }
}
