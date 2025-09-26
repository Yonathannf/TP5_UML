public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    public Propietario(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setComputadora(Computadora pc){ this.computadora = pc; }
    public String toString(){ return "Propietario["+nombre+","+dni+"]"; }
}
