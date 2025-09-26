public class DemoEj1 {
    public static void main(String[] args){
        Titular t = new Titular("Ana Perez","12345678");
        Pasaporte p = new Pasaporte("A12345","2025-08-01","ana.jpg","jpg");
        p.setTitular(t);
        System.out.println(p);
        System.out.println(t);
    }
}
