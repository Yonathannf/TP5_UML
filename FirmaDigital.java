public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private UsuarioFirma usuario;
    public FirmaDigital(String codigoHash, String fecha, UsuarioFirma usuario){
        this.codigoHash = codigoHash; this.fecha = fecha; this.usuario = usuario;
    }
    public String toString(){ return "FirmaDigital["+codigoHash+","+fecha+", usuario="+usuario+"]"; }
}
