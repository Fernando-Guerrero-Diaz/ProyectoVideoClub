/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author Sulfu
 */
public class OutOfStockException extends Exception{

    /**
     * Creates a new instance of <code>OutOfStockException</code> without detail
     * message.
     */
    public OutOfStockException() {
    }

    /**
     * Constructs an instance of <code>OutOfStockException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OutOfStockException(String msg) {
        super(msg);
    }
}
