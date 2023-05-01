/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

/**
 *
 * @author Freksel
 */
public class ClientePremium extends Cliente{
    private int cantcupones;
    private int descuento;

public ClientePremium(int cantcupones, String nombre,int rut, String email){
    super(nombre,rut,email);
    this.cantcupones = cantcupones;
}

public int getDescuento() {
    return descuento;
}

public void setDescuento(int descuento) {
    this.descuento = descuento;
}

public int getCantcupones() {
    return cantcupones;
}

public void setCantcupones(int cantcupones) {
    this.cantcupones = cantcupones;
}

public int usarCupones(){
    if(cantcupones==0){
        return 0;
    }
    cantcupones=cantcupones-1;
    return descuento;
}
}
