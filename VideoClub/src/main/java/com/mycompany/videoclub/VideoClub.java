package com.mycompany.videoclub;
import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

public class VideoClub {

    public static void main(String[] args) throws IOException {
        LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();
        Cliente c1 = new Cliente("Fernando Guerrero", 19540726, "fdoguerrerodiaz96@gmail.com");
        Cliente c2 = new Cliente("John Smith", 12345678, "JSmith@yahoo.es");
        Cliente c3 = new Cliente("XXDemon69SlayerXX", 25999999, "xxDSlaya@roblox.com");
        HashMap<Integer,Cliente> map = new HashMap();
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        //Creación por main de un historial de arriendos
        //Arriendos de Fernando Guerrero
        Arriendo arr0 = new Arriendo("Shrek 2", 15, 2000);
        
        Arriendo arr1 = new Arriendo("Joker", "2023-03-20", 6, 2000);
        arr1.devolver();
        arr1.setAtraso(1);
        
        Arriendo arr2 = new Arriendo("Enter the Spiderverse", "2023-02-06", 10, 2000);
        arr2.devolver();
        arr2.setAtraso(0);
        // Arriendos de John Smith
        Arriendo arr3 = new Arriendo("2012", "2012-12-21", 2, 1500);
        
        //Arriendos de XXDemon69SlayerXX
        Arriendo arr4 = new Arriendo("Minions", 5, 2000);
        
        Arriendo arr5 = new Arriendo("The Lego Movie", "2023-01-11", 4, 2000);
        arr5.devolver();
        arr5.setAtraso(7);
        
        map.put(c2.getRut(),c2);
        Cliente x;
        for(int i = 0; i < listaClientes.size();i++){
            x = listaClientes.get(i);
            x.print();
            System.out.println("");
        }
        if(map.containsKey(c2.getRut())){
            map.get(c2.getRut()).print();
        }
        Menu.Menu2(map);
    }
}
