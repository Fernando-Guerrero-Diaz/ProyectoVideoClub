package com.mycompany.videoclub;
import java.time.LocalDate;

public class Arriendo {
    private String películaArrendada;
    private LocalDate fechaArriendo;
    private long díasArriendo;
    private int precioArriendo;
    
    public Arriendo(String película, long días, int precio){
        películaArrendada = película;
        fechaArriendo = LocalDate.now();
        díasArriendo = días;
        precioArriendo = precio;
    }
    
    public String getPelícula(){
        return películaArrendada;
    }
    
    public void setPelícula(String película){
        películaArrendada = película;
    }
    
    public LocalDate getFechaArriendo(){
        return fechaArriendo;
    }
    
    public void setFechaArriendo(LocalDate fecha){
        fechaArriendo = fecha;
    }
    
    public LocalDate getFechaDevolución(){
        return fechaArriendo.plusDays(díasArriendo);
    }
    
    public long getDíasArriendo(){
        return díasArriendo;
    }
    
    public void setDíasArriendo(long días){
        díasArriendo = días;
    }
    
    public boolean Atrasado(){
        LocalDate díaHoy = LocalDate.now();
        int diferenciaDías = díaHoy.compareTo(fechaArriendo.plusDays(díasArriendo));
        return diferenciaDías > 0;
    }
    
    public int DíasDeAtraso(){
        LocalDate díaHoy = LocalDate.now();
        int diferenciaDías = díaHoy.compareTo(fechaArriendo.plusDays(díasArriendo));
        if (diferenciaDías < 0) return 0;
        return diferenciaDías;
    }
    
    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }
    
}
