public class UsuarioQR {
    private String nombre;
    private String email;
    public UsuarioQR(String nombre, String email){ this.nombre = nombre; this.email = email; }
    public String toString(){ return "Usuario["+nombre+","+email+"]"; }
}
