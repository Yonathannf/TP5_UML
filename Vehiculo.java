public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    public Vehiculo(String patente, String modelo, Motor motor){
        this.patente = patente; this.modelo = modelo; this.motor = motor;
    }
    public void setConductor(Conductor c){
        this.conductor = c;
        if(c != null) c.setVehiculo(this);
    }
    public String toString(){ return "Vehiculo["+patente+","+modelo+", motor="+motor+"]"; }
}
