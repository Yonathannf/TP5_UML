public class DemoEj4 {
    public static void main(String[] args){
        Banco b = new Banco("Banco Central", "30-12345678-9");
        TarjetaDeCredito t = new TarjetaDeCredito("4111222233334444","2027-12",b);
        Cliente c = new Cliente("María Gomez","23456789");
        t.setCliente(c);
        System.out.println(t);
        System.out.println(c);
    }
}
