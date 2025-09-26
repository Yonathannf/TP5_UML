public class TitularCuenta {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    public TitularCuenta(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setCuenta(CuentaBancaria c){ this.cuenta = c; }
    public String toString(){ return "Titular["+nombre+","+dni+"]"; }
}
