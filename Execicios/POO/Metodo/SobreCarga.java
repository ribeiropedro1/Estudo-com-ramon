package Metodo;

public class SobreCarga {

    private String nome;
    private int valor;
    private double valor2;
    private int valor3;
    private String nome2;

    public SobreCarga(String nome, int valor, double valor2){
        this.nome = nome;
        this.valor = valor;
        this.valor2 = valor2;
    }

    public SobreCarga(String nome, int valor, double valor2, int valor3, String nome2){
        this(nome2, valor3, valor2);
        this.valor3 = valor3;
        this.nome2 = nome2;
    }
    
}
