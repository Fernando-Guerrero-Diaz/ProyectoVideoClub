/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author Sulfu
 */
public class PelículaExistenteException extends Exception{

    /**
     * Creates a new instance of <code>PelículaExistenteException</code> without
     * detail message.
     */
    public PelículaExistenteException() {
    }

    /**
     * Constructs an instance of <code>PelículaExistenteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public PelículaExistenteException(String msg) {
        super(msg);
    }
}
