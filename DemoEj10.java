public class DemoEj10 {
    public static void main(String[] args){
        TitularCuenta t = new TitularCuenta("Facundo Alvarez","45678901");
        CuentaBancaria cb = new CuentaBancaria("0170001234567890123456", 15000.0, "0000", "2025-09-01");
        cb.setTitular(t);
        System.out.println(cb);
        System.out.println(t);
    }
}
