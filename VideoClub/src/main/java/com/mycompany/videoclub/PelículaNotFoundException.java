/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author Sulfu
 */
public class PelículaNotFoundException extends Exception{

    /**
     * Creates a new instance of <code>PelículaNotFoundException</code> without
     * detail message.
     */
    public PelículaNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PelículaNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PelículaNotFoundException(String msg) {
        super(msg);
    }
}
