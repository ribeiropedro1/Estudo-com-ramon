package Dominio;

public class Calculadora {
    private static double resultado;
    
    public static void soma(double n1, double n2){
        Calculadora.resultado = n1 + n2;
        System.out.println(Calculadora.resultado);
    }

    public static void subtracao(double n1, double n2){
        Calculadora.resultado = n1 - n2;
        System.out.println(Calculadora.resultado);
    }

    public static void divisao(double n1, double n2){
        Calculadora.resultado = n1 / n2;
        System.out.println(Calculadora.resultado);
    }
    
    public static void multiplicacao(double n1, double n2){
        Calculadora.resultado = n1 * n2;
        System.out.println(Calculadora.resultado);
    }

    public static void potenciacao(double n1, double n2){
        Calculadora.resultado = Math.pow(n1, n2);
        System.out.println(Calculadora.resultado);
    }
}
