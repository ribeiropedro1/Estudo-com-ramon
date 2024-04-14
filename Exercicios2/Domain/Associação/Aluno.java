package Exercicios2.Domain.Associação;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = (idade);
    }

    public void imprimirSeminario(){
        System.out.println(this.seminario.getTitulo());
    }
    
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    
}
