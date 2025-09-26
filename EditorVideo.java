public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render r = new Render(formato, proyecto);
        System.out.println("Exportado: " + r);
    }
}
