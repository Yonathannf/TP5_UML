public class DemoEj14 {
    public static void main(String[] args){
        Proyecto p = new Proyecto("Video TP", 5);
        EditorVideo editor = new EditorVideo();
        editor.exportar("mp4", p);
    }
}
