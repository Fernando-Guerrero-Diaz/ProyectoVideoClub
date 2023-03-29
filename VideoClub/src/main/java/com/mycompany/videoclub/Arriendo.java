package com.mycompany.videoclub;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Arriendo {
    private String películaArrendada;
    private LocalDate fechaArriendo;
    private long díasArriendo;
    private int precioArriendo;
    private boolean devuelto;
    private long díasAtraso;
    
    public Arriendo(String película, long días, int precio){
        películaArrendada = película;
        fechaArriendo = LocalDate.now();
        díasArriendo = días;
        precioArriendo = precio;
        devuelto = false;
    }
    public Arriendo(String película, String fecha, long días, int precio){
        películaArrendada = película;
        fechaArriendo = LocalDate.parse(fecha); // fecha debe ser 'YYYY-MM-DD'
        díasArriendo = días;
        precioArriendo = precio;
        devuelto = false;
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
    
    public void setFechaArriendo(String fecha){
        fechaArriendo = LocalDate.parse(fecha);
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
    
    public boolean atrasado(){
        if (devuelto) return false;
        LocalDate díaHoy = LocalDate.now();
        int diferenciaDías = díaHoy.compareTo(fechaArriendo.plusDays(díasArriendo));
        return diferenciaDías > 0;
    }
    
    public long díasDeAtraso(){
        if (devuelto) return díasAtraso;
        LocalDate díaHoy = LocalDate.now();
        long diferenciaDías = fechaArriendo.plusDays(díasArriendo).until(díaHoy, ChronoUnit.valueOf("DAYS"));
        if (diferenciaDías < 0) return 0;
        return diferenciaDías;
    }
    public void devolver(){
        díasAtraso = díasDeAtraso();
        devuelto = true;
        
    }
    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }
    public long getDeuda(){
        double porcentaje = 0.05;
        long deuda = (long) (díasDeAtraso() * precioArriendo * porcentaje);
        return deuda;
    }
    public void print(){
        System.out.println("Pelicula arrendada: " + películaArrendada);
        System.out.println("Fecha de arriendo: " + fechaArriendo.toString());
        System.out.println("Duración de arriendo: " + Long.toString(díasArriendo) + " días");
        System.out.println("Precio de arriendo: " + Integer.toString(precioArriendo));
        System.out.print("Estado: ");
        if (devuelto) System.out.println("Devuelto");
        else System.out.println("Sin Devolver");
        System.out.println("Días de atraso: " + Long.toString(díasDeAtraso()) + " días");
        System.out.println("Deuda: " + Long.toString(getDeuda()));
    }
}
