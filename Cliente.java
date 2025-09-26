public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;
    public Cliente(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setTarjeta(TarjetaDeCredito t){ this.tarjeta = t; }
    public String toString(){ return "Cliente["+nombre+","+dni+"]"; }
}
