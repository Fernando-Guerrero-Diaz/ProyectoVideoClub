/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintStream;
import java.time.LocalDate;
import java.io.PrintWriter;
/**
 *
 * @author Sulfu
 */
public class CSVmanager {
    private CollectionManager collectionManager;
    public CSVmanager(CollectionManager cm){
        collectionManager = cm;
    }
    public HashMap lecturaPelículas(String direcciónArchivo) throws FileNotFoundException {
        HashMap<String,Película> mapaPelículas = new HashMap();
        File archivoPelículas = new File(direcciónArchivo);
        Scanner lector = new Scanner(archivoPelículas);
        lector.nextLine();
        while (lector.hasNextLine()){
            String dataLine = lector.nextLine();
            String[] dataArray = dataLine.split(";");
            String id = dataArray[0];
            String nombre=dataArray[1];
            int puntuación = Integer.parseInt(dataArray[2]);
            String[] géneros = dataArray[3].split(",");
            int votos = Integer.parseInt(dataArray[4]);
            String[] directores = dataArray[5].split(",");
            int stock = Integer.parseInt(dataArray[6]);
            int arriendos = Integer.parseInt(dataArray[7]);
            Película peli = new Película(id, nombre,directores,puntuación,stock,arriendos,géneros, votos);

            mapaPelículas.put(id,peli);
        }
        return mapaPelículas;
    }
    
    public HashMap lecturaClientes(String direcciónArchivo) throws FileNotFoundException {
        HashMap<Integer,Cliente> mapaClientes = new HashMap();
        File archivoClientes = new File(direcciónArchivo);
        Scanner lector = new Scanner(archivoClientes);
        lector.nextLine();
        while (lector.hasNextLine()){
            String dataLine = lector.nextLine();
            String[] dataArray = dataLine.split(";");
            int rut = Integer.parseInt(dataArray[0]);
            String nombre=dataArray[1];
            String email = dataArray[2];
            Cliente cliente = new Cliente(nombre,rut,email);

            mapaClientes.put(rut,cliente);
        }
        return mapaClientes;
    }
    public void lecturaArriendos(String direcciónArchivo) throws FileNotFoundException{
        File archivoArriendos = new File(direcciónArchivo);
        Scanner lector = new Scanner(archivoArriendos);
        lector.nextLine();
        while (lector.hasNextLine()){
            String dataLine = lector.nextLine();
            String[] dataArray = dataLine.split(";");
            int rut = Integer.parseInt(dataArray[0]);
            String id=dataArray[1];
            String fecha = dataArray[2];
            long díasArriendo = Long.parseLong(dataArray[3]);
            int precio = Integer.parseInt(dataArray[4]);
            boolean estado = (dataArray[5].equals("devuelto"));
            long díasAtraso = Long.parseLong(dataArray[6]);
            Cliente cliente = collectionManager.buscarCliente(rut);
            Película peli = collectionManager.buscarPelicula(id);
            if (cliente == null || peli == null) continue;
            Arriendo nuevo = new Arriendo(peli,fecha,díasArriendo,precio,estado,díasAtraso);
            cliente.addLastArriendo(nuevo);
        }
    }
    
    public String getDatalineCliente(Cliente cliente){
        String dataline = Integer.toString(cliente.getRut()) + ";" + cliente.getNombre() + ";" + cliente.getEmail();
        return dataline;
    }
    public String getDatalinePelicula(Película peli){
        String generos = stringArrayConcatenation(peli.getGéneros());
        String directores = stringArrayConcatenation(peli.getDirectores());
        String dataline = peli.getId() + ";" + peli.getNombre() + ";" + Integer.toString(peli.getPuntuación()) + ";" + generos + ";" + Integer.toString(peli.getCantVotos()) + ";" + directores + ";" + Integer.toString(peli.getStock()) + ";" + Integer.toString(peli.getArriendos()); 
        return dataline;
    }
    public String getDatalineArriendo(Arriendo arriendo, int rut){
        String estado;
        if (arriendo.getDevuelto()) estado = "devuelto";
        else estado = "no devuelto";
        String dataline = Integer.toString(rut) + ";" + arriendo.getPelículaArrendada().getId() + ";" + arriendo.getFechaArriendo().toString() + ";" + Long.toString(arriendo.getDíasArriendo()) + ";" + Integer.toString(arriendo.getPrecioArriendo())+ ";" + estado + ";" + Long.toString(arriendo.díasDeAtraso());
        return dataline;
    }
    public String stringArrayConcatenation(String[] stringArray){
        
        int arraySize = stringArray.length;
        if (arraySize < 1) return "";
        String result = stringArray[0];
        for (int i = 1; i < arraySize; i++){
            result = result + ", "+stringArray[i];
        }
        
        return result;
    }
    
    public void escribirPelículas(String direcciónArchivo) throws IOException {
        
        BufferedWriter escritor = new BufferedWriter(new FileWriter(direcciónArchivo));
        escritor.write("Const;Title;IMDb Rating;Genres;Num Votes;Directors;Stock;Arriendos");
        escritor.newLine();
        for (String id: collectionManager.getSetIDPelículas()){
            Película peli = collectionManager.buscarPelicula(id);
            String dataline = getDatalinePelicula(peli);
            escritor.write(dataline);
            escritor.newLine();   
            }
        escritor.close();
    }
    public void escribirClientes(String direcciónArchivo) throws IOException {
        
        BufferedWriter escritor = new BufferedWriter(new FileWriter(direcciónArchivo));
        escritor.write("Rut;Nombre;email");
        escritor.newLine();
        for (int rut: collectionManager.getSetRutClientes()){
            Cliente cliente = collectionManager.buscarCliente(rut);
            String dataline = getDatalineCliente(cliente);
            escritor.write(dataline);
            escritor.newLine();   
            }
        escritor.close();
    }
    public void escribirArriendos(String direcciónArchivo) throws IOException {
        
        PrintWriter escritor = new PrintWriter(new FileWriter(direcciónArchivo));
        escritor.print("Rut Cliente;ID Pelicula;Fecha Arriendo(YYYY-MM-DD);Dias Arriendo;PrecioArriendo;Estado;DiasAtraso");
        escritor.println();
        for (int rut: collectionManager.getSetRutClientes()){
            Cliente cliente = collectionManager.buscarCliente(rut);
            Arriendo[] arriendos = cliente.ArriendosPendientes(false);
            for(Arriendo arr:arriendos){
                String dataline = getDatalineArriendo(arr,rut);
                escritor.print(dataline);
                escritor.println();   
                }
            }
        escritor.close();
    }
    
    public void reportePeliculas(String direcciónArchivo) throws IOException{
        PrintStream ps = new PrintStream(new File(direcciónArchivo));
        PrintStream console = System.out;
        System.setOut(ps);
        System.out.println("Películas registradas en el sistema");
        for (String id: collectionManager.getSetIDPelículas()){
            Película peli = collectionManager.buscarPelicula(id);
            peli.print();
            }
        System.setOut(console);
        
    }
}
