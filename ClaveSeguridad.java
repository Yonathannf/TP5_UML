public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;
    public ClaveSeguridad(String codigo, String ultimaModificacion){ this.codigo = codigo; this.ultimaModificacion = ultimaModificacion; }
    public String toString(){ return "Clave["+codigo+", mod="+ultimaModificacion+"]"; }
}
