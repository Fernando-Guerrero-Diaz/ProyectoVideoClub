
package com.mycompany.videoclub;


public class Cliente {
    private String nombre;
    private int rut;
    private Arriendo[] registroArriendos;
    
    public Cliente(String nombre, int rut){
        this.nombre = nombre;
        this.rut = rut;
        registroArriendos = new Arriendo[20];
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

    public Arriendo[] getRegistroArriendos() {
        return registroArriendos;
    }

    public void setRegistroArriendos(Arriendo[] registroArriendos) {
        this.registroArriendos = registroArriendos;
    }
}
