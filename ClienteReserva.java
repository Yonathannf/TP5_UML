public class ClienteReserva {
    private String nombre;
    private String telefono;
    public ClienteReserva(String nombre, String telefono){ this.nombre = nombre; this.telefono = telefono; }
    public String toString(){ return "Cliente["+nombre+","+telefono+"]"; }
}
