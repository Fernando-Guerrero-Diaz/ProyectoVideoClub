package com.mycompany.videoclub;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Arriendo {
    private Película películaArrendada;
    private LocalDate fechaArriendo;
    private long díasArriendo;
    private int precioArriendo;
    private boolean devuelto;
    private long díasAtraso;
    
    public Arriendo(Película película, long días, int precio){
        películaArrendada = película;
        fechaArriendo = LocalDate.now();
        díasArriendo = días;
        precioArriendo = precio;
        devuelto = false;
        películaArrendada.arrendar();
    }
    public Arriendo(Película película, String fecha, long días, int precio, boolean status, long atraso){
        películaArrendada = película;
        fechaArriendo = LocalDate.parse(fecha); // fecha debe ser 'YYYY-MM-DD'
        díasArriendo = días;
        precioArriendo = precio;
        devuelto = status;
        díasAtraso = atraso;   
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

    public int getPrecioArriendo() {
        return precioArriendo;
    }

    public void setDíasAtraso(long díasAtraso) {
        this.díasAtraso = díasAtraso;
    }

    public long getDíasAtraso() {
        return díasAtraso;
    }
    
    public boolean getDevuelto(){
        return devuelto;
    }

    public Película getPelículaArrendada() {
        return películaArrendada;
    }

    public void setPelículaArrendada(Película películaArrendada) {
        this.películaArrendada = películaArrendada;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
    
    public void setPrecioArriendo(int precioArriendo) {
        this.precioArriendo = precioArriendo;
    }
    public long getDeuda(){
        double porcentaje = 0.05;
        long deuda = (long) (díasDeAtraso() * precioArriendo * porcentaje);
        return deuda;
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
        películaArrendada.devolver();
        díasAtraso = díasDeAtraso();
        devuelto = true;
        
    }
    
    public void print(){
        System.out.println("Pelicula arrendada: " + películaArrendada.getNombre());
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
