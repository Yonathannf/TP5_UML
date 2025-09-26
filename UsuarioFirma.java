public class UsuarioFirma {
    private String nombre;
    private String email;
    public UsuarioFirma(String nombre, String email){ this.nombre = nombre; this.email = email; }
    public String toString(){ return "Usuario["+nombre+","+email+"]"; }
}
