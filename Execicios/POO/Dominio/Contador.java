package Dominio;

public class Contador {

    private static int valor = 0;
    {
        Contador.valor++;
    }
    
    public static void imprimirValor(){
        System.out.println(Contador.valor);
    }

    public static void incrementarValor(){
        Contador.valor++;
    }

    public static void zerarValor(){
        Contador.valor = 0;
    }
    
    public static int getValor(){
        return Contador.valor;
    }
    
}
