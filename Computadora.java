public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;
    private Propietario propietario;
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset){
        this.marca = marca; this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modeloPlaca, chipset);
    }
    public void setPropietario(Propietario p){
        this.propietario = p;
        if(p != null) p.setComputadora(this);
    }
    public String toString(){ return "Computadora["+marca+","+numeroSerie+","+placa+"]"; }
}
