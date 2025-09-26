public class DemoEj5 {
    public static void main(String[] args){
        Computadora pc = new Computadora("Lenovo","SN12345","Z590","Intel Z590");
        Propietario pr = new Propietario("Lucas Diaz","34567890");
        pc.setPropietario(pr);
        System.out.println(pc);
        System.out.println(pr);
    }
}
