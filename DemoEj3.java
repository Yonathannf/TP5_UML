public class DemoEj3 {
    public static void main(String[] args){
        Autor a = new Autor("J. R. R. Tolkien","Inglesa");
        Editorial e = new Editorial("Minotauro","Calle Falsa 123");
        Libro l = new Libro("El Señor de los Anillos","978-0261102385", a, e);
        System.out.println(l);
    }
}
