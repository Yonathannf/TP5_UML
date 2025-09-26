public class Calculadora {
    public void calcular(Impuesto impuesto){
        System.out.println("Calculando impuesto para: " + impuesto);
        double resultado = impuesto.getMonto() * 1.10;
        System.out.println("Resultado (con recargo 10%): " + resultado);
    }
}
