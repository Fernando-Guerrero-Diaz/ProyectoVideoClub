package com.mycompany.videoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class Menu{

public static void Menu2(HashMap<Integer,Cliente> map,LinkedList<Película> listaPelícula) throws IOException {
    System.out.println("¡Bienvenido a la tienda de Películas!");
    BufferedReader MM=new BufferedReader (new InputStreamReader(System.in));
    boolean running = true;
    while(running){
        System.out.println("Escoge una opción: \n 1-Agregar una película en el catalogo. \n 2-Agregar nuevo cliente en el sistema. \n 3-Agregar nuevo arriendo \n 4-Mostrar todos los arriendos \n 5-Mostrar los arriendos de un usuario\n 6-Terminar Programa.");
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
                System.out.println("Ingrese generos de la pélicula separados con comas: ");
                String generos=MM.readLine();
                System.out.println("Ingrese Actores Principales de la pélicula separados con comas: ");
                String actores=MM.readLine();
                Película nuevaPeli = new Película(Pel,Dir,Pun,Sto,Arr,generos.split(","),actores.split(","));
                nuevaPeli.print();
                listaPelícula.add(nuevaPeli);
                break;
            case 2:
                System.out.println("Ingrese nombre del nuevo usuario: ");
                //Pelicula2.setNombre(MM.readLine());
                String Cli=MM.readLine();
                System.out.println("Ingrese Rut del nuevo usuario sin puntos ni número verificador: ");
                int Rut= Integer.parseInt(MM.readLine());
                if(map.containsKey(Rut)){
                    System.out.println("No se puede crear un usuario ya existente");
                    break;
                }
                System.out.println("Ingrese correo electronico del nuevo usuario: ");
                String Cor=MM.readLine();
                Cliente nuevoCli= new Cliente(Cli,Rut,Cor);
                nuevoCli.print();
                //HashMap<Integer,Cliente> map = new HashMap();
                map.put(nuevoCli.getRut(),nuevoCli);
                //if(map.containsKey(nuevoCli.getRut())){
                //map.get(nuevoCli.getRut()).print();
            //}
            break;
            case 3:
                System.out.println("Ingrese Rut del Cliente para comenzar el arriendo: ");
                int Ru=Integer.parseInt(MM.readLine());
                if(map.containsKey(Ru)){
                    System.out.println("Ingrese Nombre de la película para arrendar: ");
                    String Peli=MM.readLine();
                    System.out.println("Ingrese cuantos días van a arrendar la película: ");
                    int Dia=Integer.parseInt(MM.readLine());
                    System.out.println("Ingrese el precio del arriendo: ");
                    int Pre=Integer.parseInt(MM.readLine());
                    Arriendo nuevoArr= new Arriendo(Peli,Dia,Pre);
                    nuevoArr.print();
                    Cliente cc =map.get(Ru);
                    cc.AddFirstArriendo(nuevoArr);
                }
                
                else{
                  System.out.println("El usuario no existe.");
                }
                //Generos[0]="Rock";
                //Pelicula2.setGéneros(Generos);
                //System.out.println(Pelicula2.getNombre()+ Pelicula2.getStock());
                break;
            case 4:
                System.out.println("Mostrar Los arriendos pendientes: \n 1-Si \n 2-No \n");
                int opcion=Integer.parseInt(MM.readLine());
                for(Integer key: map.keySet()){
                        System.out.println("Arriendos de: "+map.get(key).getNombre());
                        map.get(key).showArriendos(opcion==1);                                                     
                    }
                break;
            case 5:
                System.out.println("Ingrese Rut del Cliente a revisar: ");
                int rut=Integer.parseInt(MM.readLine());
                if(map.containsKey(rut)){
                    System.out.println("Mostrar Los arriendos pendientes: \n 1-Si \n 2-No \n");
                    int opcion2=Integer.parseInt(MM.readLine());
                    System.out.println("Arriendos de: "+map.get(rut).getNombre());
                    map.get(rut).showArriendos(opcion2==1);
                }
                else {
                    System.out.println("El usuario no existe");
                }
                break;
            case 6:
                running=false;
                break;
            default:
                System.out.println("Opción invalida.");
                break;
            }
        }
    }
    
}

