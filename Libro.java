public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial){
        this.titulo = titulo; this.isbn = isbn; this.autor = autor; this.editorial = editorial;
    }
    public String toString(){ return "Libro["+titulo+","+isbn+", autor="+autor+", editorial="+editorial+"]"; }
}
