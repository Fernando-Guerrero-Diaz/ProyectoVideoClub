/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 *
 * @author Sulfu
 */
public class CollectionManager {
    private HashMap<Integer,Cliente> mapaCliente;
    private HashMap<String,Película> mapaPelículas;
    private CSVmanager csv_manager;
    public CollectionManager(){
        csv_manager = new CSVmanager();
        /*
        try{
            mapaPelículas = csv_manager.lecturaPelículas("Files/Peliculas.csv");
        }catch( FileNotFoundException e){
                System.out.println("No se encuentra archivo,");
                mapaPelículas = new HashMap<String,Película>();
                }
        */
        mapaPelículas = new HashMap<String,Película>();
        /*
        try{
            mapaCliente = csv_manager.lecturaClientes("Files/Clientes.csv");
        }catch(FileNotFoundException f){
            mapaCliente= new HashMap<Integer,Cliente>();
        }
        */
        mapaCliente= new HashMap<Integer,Cliente>();
    }
    
    public void agregarPelícula(Película peli){
        mapaPelículas.put(peli.getId(),peli);
    }
}
