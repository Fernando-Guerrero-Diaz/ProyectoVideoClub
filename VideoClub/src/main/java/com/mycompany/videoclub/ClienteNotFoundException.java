/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author Sulfu
 */
public class ClienteNotFoundException extends Exception{

    /**
     * Creates a new instance of <code>ClienteNotFoundException</code> without
     * detail message.
     */
    public ClienteNotFoundException() {
    }

    /**
     * Constructs an instance of <code>ClienteNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ClienteNotFoundException(String msg) {
        super(msg);
    }
}
