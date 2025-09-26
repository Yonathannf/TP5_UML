public class Reserva {
    private String fecha;
    private String hora;
    private ClienteReserva cliente;
    private Mesa mesa;
    public Reserva(String fecha, String hora, ClienteReserva cliente, Mesa mesa){
        this.fecha = fecha; this.hora = hora; this.cliente = cliente; this.mesa = mesa;
    }
    public String toString(){ return "Reserva["+fecha+" "+hora+", cliente="+cliente+", mesa="+mesa+"]"; }
}
