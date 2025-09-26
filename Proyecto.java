public class Proyecto {
    private String nombre;
    private int duracionMin;
    public Proyecto(String nombre, int duracionMin){ this.nombre = nombre; this.duracionMin = duracionMin; }
    public String toString(){ return "Proyecto["+nombre+", dur="+duracionMin+"min]"; }
}
