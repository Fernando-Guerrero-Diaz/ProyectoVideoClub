package com.mycompany.videoclub;
import java.io.*;

public class VideoClub {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        BufferedReader MM=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Ingrese nombre de la película: ");
        //Pelicula2.setNombre(MM.readLine());
        String Pel=MM.readLine();
        System.out.println("Ingrese nombre del director de la película: ");
        String Dir=MM.readLine();
        System.out.println("Ingrese puntuación de la pelicula(entre 0 a 5): ");
        float Pun= Float.parseFloat(MM.readLine());
        System.out.println("Ingrese Cantidad de Peliculas en la tienda: ");
        int Sto= Integer.parseInt(MM.readLine());
        System.out.println("Ingrese Fecha de inicio de Arriendo de la película: ");
        int Arr= Integer.parseInt(MM.readLine());
        System.out.println("Ingrese precio del arriendo de la pélicula: ");
        int Pre= Integer.parseInt(MM.readLine());
        String[] generos= new String[3];
        String[] actores= new String[3];
        for (int i=0;i<3;i++){
            System.out.println("Ingrese generos de la pélicula(" + (i+1) + "/3)");
            generos[i]=MM.readLine();
        }
        for (int i=0;i<3;i++){
            System.out.println("Ingrese Actores Principales de la pélicula(" + (i+1) + "/3)");
            actores[i]=MM.readLine();
        }
        Película nuevaPeli = new Película(Pel,Dir,Pun,Sto,Arr,Pre);
        nuevaPeli.setGéneros(generos);
        nuevaPeli.setActoresPrincipales(actores);
        System.out.println(nuevaPeli.getNombre() + " " + nuevaPeli.getDirector()+ " " + nuevaPeli.getPuntuación() + " " + nuevaPeli.getStock()+ " ");
        System.out.println(nuevaPeli.getArriendos()+ " " + nuevaPeli.getPrecioArriendo());
        //Generos[0]="Rock";
        //Pelicula2.setGéneros(Generos);
        //System.out.println(Pelicula2.getNombre()+ Pelicula2.getStock());
    }
}
