/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Set;
import java.io.IOException;

/**
 *
 * @author Sulfu
 */
public class CollectionManager {
    private HashMap<Integer,Cliente> mapaCliente;
    private HashMap<String,Película> mapaPelículas;
    private CSVmanager csv_manager;
    public CollectionManager(){
        csv_manager = new CSVmanager(this);
        
        try{
            mapaPelículas = csv_manager.lecturaPelículas("Files/Peliculas.csv");
        }catch( FileNotFoundException e){
                mapaPelículas = new HashMap<String,Película>();
                }
        try{
            mapaCliente = csv_manager.lecturaClientes("Files/Clientes.csv");
        }catch(FileNotFoundException f){
            mapaCliente= new HashMap<Integer,Cliente>();
        }
        try {
            csv_manager.lecturaArriendos("Files/Arriendos.csv");
        }catch(FileNotFoundException g){

        }
        
    }
    public Cliente buscarCliente(int rut) throws ClienteNotFoundException{
        for ( Integer key: mapaCliente.keySet()){
            if (mapaCliente.get(key).getRut() == rut){
                return mapaCliente.get(key);
            }
        }
        throw new ClienteNotFoundException();
    }
    public Película buscarPelicula(String id) throws PelículaNotFoundException{
        for ( String key: mapaPelículas.keySet()){
            if (mapaPelículas.get(key).getId().equals(id)){
                return mapaPelículas.get(key);
            }
        }
        throw new PelículaNotFoundException();
    }
    public void agregarPelícula(Película peli){
        mapaPelículas.put(peli.getId(),peli);
    }
    public void agregarCliente(Cliente cc){
        mapaCliente.put(cc.getRut(), cc);
    }
    public void eliminarCliente(int key){
        mapaCliente.remove(key);
    }
    
    public Set<String> getSetIDPelículas(){
        return mapaPelículas.keySet();
    }
    public Set<Integer> getSetRutClientes(){
        return mapaCliente.keySet();
    }
    public void escrituraEnCSV(){
        try{
        csv_manager.escribirPelículas("Files/Peliculas.csv");
        csv_manager.escribirClientes("Files/Clientes.csv");
        csv_manager.escribirArriendos("Files/Arriendos.csv");
        }catch(IOException e){
            System.out.println("Error en escritura");
        }
    }
    public void reporteStock(String nombre) throws IOException{
        String direccion = "Reportes/" + nombre + ".txt";
        csv_manager.reportePeliculas(direccion);
}
    public void reporteArriendo(String nombre, boolean pendientes) throws IOException{
        String direccion = "Reportes/" + nombre + ".txt";
        csv_manager.reporteArriendos(direccion,pendientes);
}
}
