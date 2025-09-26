public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private TitularCuenta titular;
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String fechaMod){
        this.cbu = cbu; this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, fechaMod);
    }
    public void setTitular(TitularCuenta t){
        this.titular = t;
        if(t != null) t.setCuenta(this);
    }
    public String toString(){ return "Cuenta["+cbu+", saldo="+saldo+", clave="+clave+"]"; }
}
