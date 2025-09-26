public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    public Documento(String titulo, String contenido, String codigoHash, String fechaFirma, UsuarioFirma usuario){
        this.titulo = titulo; this.contenido = contenido;
        this.firma = new FirmaDigital(codigoHash, fechaFirma, usuario);
    }
    public String toString(){ return "Documento["+titulo+", firma="+firma+"]"; }
}
