package com.mycompany.videoclub;
import java.io.*;

import java.util.LinkedList;

public class VideoClub {

    public static void main(String[] args) throws IOException {
        LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();
        Cliente c1 = new Cliente("Fernando Guerrero", 19540726, "fdoguerrerodiaz96@gmail.com");
        Cliente c2 = new Cliente("John Smith", 12345678, "JSmith@yahoo.es");
        Cliente c3 = new Cliente("XXDemon69SlayerXX", 25999999, "xxDSlaya@roblox.com");
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);
        Cliente x;
        for(int i = 0; i < listaClientes.size();i++){
            x = listaClientes.get(i);
            x.print();
            System.out.println("");
        }
        //Menu.Menu2();
    }
}
