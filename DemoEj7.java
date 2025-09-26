public class DemoEj7 {
    public static void main(String[] args){
        Motor m = new Motor("V6","SN-MTR-001");
        Vehiculo v = new Vehiculo("ABC123","Toyota Corolla", m);
        Conductor c = new Conductor("Pedro Diaz","LIC-98765");
        v.setConductor(c);
        System.out.println(v);
        System.out.println(c);
    }
}
