public class DemoEj11 {
    public static void main(String[] args){
        Artista a = new Artista("Soda Stereo","Rock");
        Cancion c = new Cancion("De Música Ligera", a);
        Reproductor r = new Reproductor();
        r.reproducir(c);
    }
}
