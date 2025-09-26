public class DemoEj2 {
    public static void main(String[] args){
        Bateria bat = new Bateria("BT-100",4000);
        Celular c = new Celular("359123456789012","Samsung","A54",bat);
        Usuario u = new Usuario("Diego Lopez","87654321");
        c.setUsuario(u);
        System.out.println(c);
    }
}
