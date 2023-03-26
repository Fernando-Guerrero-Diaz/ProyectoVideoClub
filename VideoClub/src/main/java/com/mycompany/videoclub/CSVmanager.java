/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Sulfu
 */
public class CSVmanager {
    
    public LinkedList lecturaPelículas(String direcciónArchivo) throws FileNotFoundException {
        LinkedList listaPelículas = new LinkedList();
        File archivoPelículas = new File(direcciónArchivo);
        Scanner lector = new Scanner(archivoPelículas);
        lector.nextLine();
        while (lector.hasNextLine()){
            String dataLine = lector.nextLine();
            String[] dataArray = dataLine.split(",");
            Película peli = new Película(dataArray[0],dataArray[1],Float.parseFloat(dataArray[4]), Integer.parseInt(dataArray[5]), Integer.parseInt(dataArray[6]),Integer.parseInt(dataArray[7]));
            peli.setActoresPrincipales(dataArray[2].split(";"));
            peli.setGéneros(dataArray[3].split(";"));
            listaPelículas.add(peli);
        }
        return listaPelículas;
    }
}
