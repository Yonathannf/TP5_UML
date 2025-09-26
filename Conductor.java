public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    public Conductor(String nombre, String licencia){ this.nombre = nombre; this.licencia = licencia; }
    public void setVehiculo(Vehiculo v){ this.vehiculo = v; }
    public String toString(){ return "Conductor["+nombre+","+licencia+"]"; }
}
