/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Sulfu
 */
public class CSVmanager {
    
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
}
