public class CodigoQR {
    private String valor;
    private UsuarioQR usuario;
    public CodigoQR(String valor, UsuarioQR usuario){ this.valor = valor; this.usuario = usuario; }
    public String toString(){ return "CodigoQR["+valor+", usuario="+usuario+"]"; }
}
