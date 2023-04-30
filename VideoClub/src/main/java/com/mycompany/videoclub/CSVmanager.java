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
            String[] dataArray = dataLine.split(",");
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
    
    public String getDatalinePelicula(Película peli){
        String generos = stringArrayConcatenation(peli.getGéneros());
        String directores = stringArrayConcatenation(peli.getDirectores());
        String dataline = peli.getId() + ";" + peli.getNombre() + ";" + Integer.toString(peli.getPuntuación()) + generos + ";" + Integer.toString(peli.getCantVotos()) + ";" + directores + ";" + Integer.toString(peli.getStock()) + ";" + Integer.toString(peli.getArriendos()); 
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
        
        BufferedWriter escritor = new BufferedWriter(new FileWriter(direcciónArchivo, false));
        escritor.write("Const;Title;IMDb Rating;Genres;Num Votes;Directors;Stock;Arriendos");
        escritor.newLine();
        for (String id: collectionManager.getSetIDPelículas()){
            Película peli = collectionManager.buscarPelicula(id);
            String dataline = getDatalinePelicula(peli);
            escritor.write(dataline);
            escritor.newLine();   
            }
    }
}
