
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
}
