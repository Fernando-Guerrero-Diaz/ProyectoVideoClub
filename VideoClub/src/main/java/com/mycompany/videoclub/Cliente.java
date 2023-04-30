
package com.mycompany.videoclub;
import java.time.LocalDate;
import java.util.LinkedList;

public class Cliente {
    private String nombre;
    private int rut;
    private String email;
    private LinkedList<Arriendo> registroArriendos;
    
    public Cliente(String nombre, int rut, String email){
        this.nombre = nombre;
        this.rut = rut;
        this.email = email;
        registroArriendos = new LinkedList();
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

    
    public void addFirstArriendo(Arriendo nuevoArriendo){
        registroArriendos.addFirst(nuevoArriendo);
    }
    
    public void addLastArriendo(Arriendo nuevoArriendo){
        registroArriendos.addLast(nuevoArriendo);
    }
    
    public void print(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Rut: " + Integer.toString(rut));
        System.out.println("Email:" + email);
    }
    public Arriendo[] ArriendosPendientes(boolean pendientes){
        Arriendo array[] = new Arriendo[registroArriendos.size()];
        int cont = 0;
        for (int i = 0; i < registroArriendos.size();i++){
            Arriendo arr = registroArriendos.get(i);
            if (pendientes){
                if (arr.getDevuelto() == false) array[cont] = arr; cont++;
            }
        }
        return array;
    }
    public void showArriendos(boolean pendientes){
        for (int i = 0; i < registroArriendos.size();i++){
            Arriendo arr = registroArriendos.get(i);
            if (pendientes){
                if (arr.getDevuelto() == false) arr.print();
            }
            else arr.print();
        }
    }
    
    public void showArriendos(String fecha){
        LocalDate fechaArriendo = LocalDate.parse(fecha);
        for (int i = 0; i < registroArriendos.size();i++){
            Arriendo arr = registroArriendos.get(i);
            if (arr.getFechaArriendo().compareTo(fechaArriendo)>0)
            arr.print();
        }
    }
}
