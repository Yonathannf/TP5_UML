public class DemoEj13 {
    public static void main(String[] args){
        UsuarioQR u = new UsuarioQR("Nico","nico@mail.com");
        GeneradorQR g = new GeneradorQR();
        g.generar("https://ejemplo.com/usuario/123", u);
    }
}
