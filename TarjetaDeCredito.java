public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;
    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco){
        this.numero = numero; this.fechaVencimiento = fechaVencimiento; this.banco = banco;
    }
    public void setCliente(Cliente c){
        this.cliente = c;
        if(c != null) c.setTarjeta(this);
    }
    public String toString(){ return "Tarjeta["+numero+","+fechaVencimiento+", banco="+banco+"]"; }
}
