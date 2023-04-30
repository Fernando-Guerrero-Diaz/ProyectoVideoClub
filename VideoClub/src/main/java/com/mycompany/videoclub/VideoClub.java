package com.mycompany.videoclub;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

public class VideoClub {
    
    public static void main(String[] args) throws IOException {
        CollectionManager collectionManager = new CollectionManager();

        //inicializador(map,listaPelícula);
        //VideoClubFrame menuPrincipal = new VideoClubFrame(collectionManager);
        //menuPrincipal.setVisible(true);
        //Menu.Menu2(map,listaPelícula);
    }
   /* 
    public static void inicializador(HashMap<Integer,Cliente> map, LinkedList<Película> listaPelícula){
                
        //Creación de clientes por Main
        Cliente c1 = new Cliente("Fernando Guerrero", 19540726, "fdoguerrerodiaz96@gmail.com");
        Cliente c2 = new Cliente("John Smith", 12345678, "JSmith@yahoo.es");
        Cliente c3 = new Cliente("XXDemon69SlayerXX", 25999999, "xxDSlaya@roblox.com");
                //Creación por main de un historial de arriendos
        //Arriendos de Fernando Guerrero
        String nomPeli= new String();
        nomPeli = "Shrek 2";
        Película Peli = new Película(nomPeli," ",0,0,0,nomPeli.split(","),nomPeli.split(","));
        Arriendo arr0 = new Arriendo(Peli, 15, 2000);
        
        nomPeli = "Joker";
        Peli = new Película(nomPeli," ",0,0,0,nomPeli.split(","),nomPeli.split(","));
        Arriendo arr1 = new Arriendo(Peli, "2023-03-20", 6, 2000);
        arr1.devolver();
        arr1.devolver(1);
        
        nomPeli = "Enter the Spiderverse";
        Peli = new Película(nomPeli," ",0,0,0,nomPeli.split(","),nomPeli.split(","));
        Arriendo arr2 = new Arriendo(Peli, "2023-02-06", 10, 2000);
        arr2.devolver();
        arr2.devolver(0);
        // Arriendos de John Smith
        nomPeli = "2012";
        Peli = new Película(nomPeli," ",0,0,0,nomPeli.split(","),nomPeli.split(","));
        Arriendo arr3 = new Arriendo(Peli, "2012-12-21", 2, 1500);
        
        //Arriendos de XXDemon69SlayerXX
        nomPeli = "Minions";
        Peli = new Película(nomPeli," ",0,0,0,nomPeli.split(","),nomPeli.split(","));
        Arriendo arr4 = new Arriendo(Peli, 5, 2000);
        
        nomPeli = "The Lego Movie";
        Peli = new Película(nomPeli," ",0,0,0,nomPeli.split(","),nomPeli.split(","));
        Arriendo arr5 = new Arriendo(Peli, "2023-01-11", 4, 2000);
        arr5.devolver();
        arr5.devolver(7);
        
        c1.AddLastArriendo(arr0);
        c1.AddLastArriendo(arr1);
        c1.AddLastArriendo(arr2);
        c2.AddLastArriendo(arr3);
        c3.AddLastArriendo(arr4);
        c3.AddLastArriendo(arr5);
        
        map.put(c1.getRut(), c1);
        map.put(c2.getRut(),c2);
        map.put(c3.getRut(), c3);
    }
*/
}
