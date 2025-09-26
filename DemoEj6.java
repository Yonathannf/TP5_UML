public class DemoEj6 {
    public static void main(String[] args){
        Mesa m = new Mesa(5,4);
        ClienteReserva c = new ClienteReserva("Sofía Ruiz","15555666");
        Reserva r = new Reserva("2025-10-01","20:00",c,m);
        System.out.println(r);
    }
}
