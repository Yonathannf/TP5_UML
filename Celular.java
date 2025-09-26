public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    public Celular(String imei, String marca, String modelo, Bateria bateria){
        this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
    }
    public void setUsuario(Usuario u){
        this.usuario = u;
        if(u != null) u.setCelular(this);
    }
    public String toString(){
        return "Celular["+imei+","+marca+","+modelo+", bateria="+(bateria!=null?bateria.toString():"null")+
            ", usuario="+(usuario!=null?usuario.toString():"null")+"]";
    }
}
