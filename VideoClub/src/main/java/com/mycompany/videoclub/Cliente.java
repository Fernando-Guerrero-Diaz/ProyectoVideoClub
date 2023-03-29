
package com.mycompany.videoclub;
import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private int rut;
    private String email;
    private Arriendo[] registroArriendos;
    private int tamaño;
    
    public Cliente(String nombre, int rut, String email){
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        registroArriendos = new Arriendo[20];
        tamaño = 0;
    }
        public Cliente(String nombre, int rut, String email, Arriendo[] arriendos){
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        tamaño = 0;
        registroArriendos = arriendos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Arriendo[] getRegistroArriendos() {
        return registroArriendos;
    }

    public void setRegistroArriendos(Arriendo[] registroArriendos) {
        this.registroArriendos = registroArriendos;
    }
    
    public boolean AddArriendo(Arriendo nuevoArriendo){
        if (tamaño >= registroArriendos.length) return false;
        registroArriendos[tamaño] = nuevoArriendo;
        tamaño++;
        return true;
    }
    
    public void print(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Rut: " + Integer.toString(rut));
        System.out.println("Email:" + email);
    }
    
    public void showArriendos(){
        
    }
    
    public void showArriendos(LocalDate fecha){
        
    }
}
