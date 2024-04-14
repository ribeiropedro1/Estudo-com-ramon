package Lista;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private int CPF;

    public Pessoa(String nome, int idade, double altura, double peso, int cpf){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.CPF = cpf;
    }

    public void calculoIMC(){
        double imc = this.peso / Math.pow(altura, 2);
        if (imc < 18.5) {
            System.out.println("Esta pessoa apresenta um caso de magreza!");
        } else if(imc >= 18.5 && imc < 25){
            System.out.println("Você apresenta um caso normal!");
        } else if(imc >= 25 && imc < 30){
            System.out.println("Você apresenta um caso de sobrepeso!");
        } else if(imc >= 30 && imc < 35){
            System.out.println("Você apresenda o primeiro grau de obesidade!");
        } else if(imc >= 35 && imc < 40){
            System.out.println("Você apresenda o segundo grau de obesidade!");
        } else{
            System.out.println("Você apresenda o terceiro grau de obesidade!");
        }
    }
    
    public String getNome(){
        return this.nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }
    
    public double getAltura(){
        return this.altura;
    }

    public void setAltura(int novaAltura){
        this.altura = novaAltura;
    }
    
    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double novoPeso){
        this.peso = novoPeso;
    }

    public int getCPF(){
        return this.CPF;
    }

    @Override
    public String toString(){
        return this.nome + ", " + this.idade + ", " + this.CPF;
    }

}
