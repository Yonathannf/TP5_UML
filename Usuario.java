public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;
    public Usuario(String nombre, String dni){ this.nombre = nombre; this.dni = dni; }
    public void setCelular(Celular c){ this.celular = c; }
    public String toString(){ return "Usuario["+nombre+", "+dni+"]"; }
}
