/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videoclub;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Freksel
 */
public class ClientePremium extends Cliente{
    private int cantcupones;

public ClientePremium(int cantcupones, String nombre,int rut, String email,String fechacliente){
    super(nombre,rut,email,fechacliente);
    this.cantcupones = cantcupones;

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
    return calcularDescuento();
}
public void agregarCupones(int cantidad){
    cantcupones = cantcupones+cantidad;
}

public int calcularDescuento(){
    LocalDate díaHoy = LocalDate.now();
    long diferenciaMeses = super.getFechaCliente().until(díaHoy, ChronoUnit.valueOf("MONTH"));
    if(diferenciaMeses<6){
        return 10;
    }
    else if(diferenciaMeses <12){
            return 15;
    }
    else if(diferenciaMeses <18){
        return 20;
    }
    return 25;
}
}

