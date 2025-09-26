public class DemoEj12 {
    public static void main(String[] args){
        Contribuyente c = new Contribuyente("Empresa X","20-98765432-1");
        Impuesto imp = new Impuesto(10000.0, c);
        Calculadora calc = new Calculadora();
        calc.calcular(imp);
    }
}
