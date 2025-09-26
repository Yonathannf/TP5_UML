public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte;
    public Titular(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setPasaporte(Pasaporte p){ this.pasaporte = p; }
    public String toString(){ return "Titular["+nombre+", "+dni+"]"; }
}
