public class DemoEj8 {
    public static void main(String[] args){
        UsuarioFirma u = new UsuarioFirma("Laura Ruiz","laura@mail.com");
        Documento doc = new Documento("Contrato","Contenido del contrato","HASH123","2025-09-01",u);
        System.out.println(doc);
    }
}
