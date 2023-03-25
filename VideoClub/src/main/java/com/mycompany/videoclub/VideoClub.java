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
        //System.out.println("Ingrese Fecha de inicio de Arriendo de la película: ");
        //int Arr= Integer.parseInt(MM.readLine());
        System.out.println("Ingrese precio del arriendo de la pélicula: ");
        int Pre= Integer.parseInt(MM.readLine());
        System.out.println(Pel + Dir + Pun + Sto + Pre);
        
        //String[] Generos= new String[3];
        //Generos[0]="Rock";
        //Pelicula2.setGéneros(Generos);
        //System.out.println(Pelicula2.getNombre()+ Pelicula2.getStock());
    }
}
