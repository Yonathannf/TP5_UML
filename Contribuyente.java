public class Contribuyente {
    private String nombre;
    private String cuil;
    public Contribuyente(String nombre, String cuil){ this.nombre = nombre; this.cuil = cuil; }
    public String toString(){ return "Contribuyente["+nombre+","+cuil+"]"; }
}
