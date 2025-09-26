public class GeneradorQR {
    public void generar(String valor, UsuarioQR usuario){
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("Generado: " + qr);
    }
}
