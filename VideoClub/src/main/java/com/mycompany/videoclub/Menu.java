package com.mycompany.videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu{
    private int opción;

public Menu(int opción){
    this.opción = opción;
}
public static void Menu2() throws IOException {
    System.out.println("¡Bienvenido a la tienda de Películas!\n Escoge una opción: \n 1-Agregar una película  en el catalogo. \n 2-Mostrar Catalogo de péliculas.");
    BufferedReader MM=new BufferedReader (new InputStreamReader(System.in));
    boolean running = true;
    while(running){
        int menu= Integer.parseInt(MM.readLine());
        switch (menu){
            case 1:
                System.out.println("Ingrese nombre de la película: ");
                //Pelicula2.setNombre(MM.readLine());
                String Pel=MM.readLine();
                System.out.println("Ingrese nombre del director de la película: ");
                String Dir=MM.readLine();
                System.out.println("Ingrese puntuación de la pelicula(entre 0 a 5): ");
                float Pun= Float.parseFloat(MM.readLine());
                System.out.println("Ingrese Cantidad de Peliculas en la tienda: ");
                int Sto= Integer.parseInt(MM.readLine());
                System.out.println("Ingrese Arriendo actuales de la película: ");
                int Arr= Integer.parseInt(MM.readLine());
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
                Película nuevaPeli = new Película(Pel,Dir,Pun,Sto,Arr);
                nuevaPeli.setGéneros(generos);
                nuevaPeli.setActoresPrincipales(actores);
                nuevaPeli.Print();
                break;
                //Generos[0]="Rock";
                //Pelicula2.setGéneros(Generos);
                //System.out.println(Pelicula2.getNombre()+ Pelicula2.getStock());
            case 3:
                running=false;
                break;
            default:
                System.out.println("Solo escoger entre 1 y 2 ");
                break;
            }
        }
    }
    
}

