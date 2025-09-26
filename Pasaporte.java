public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto){
        this.numero = numero; this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto);
    }
    public void setTitular(Titular t){
        this.titular = t;
        if(t != null) t.setPasaporte(this);
    }
    public String toString(){
        return "Pasaporte["+numero+", "+fechaEmision+", "+foto+", titular="+(titular!=null?titular.toString():"null")+"]";
    }
}
