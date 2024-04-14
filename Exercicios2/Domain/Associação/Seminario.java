package Exercicios2.Domain.Associação;

import java.util.ArrayList;

public class Seminario {
    private String titulo;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Local local;
    
    public Seminario(String titulo){
        this.titulo = titulo;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void setLocal(Local local){
        this.local = local;
    }

    public void imprimirAlunos(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
    
    public void imprimirLocal(){
        System.out.println("O local é: " + this.local.getEndereco());
    }

    public String getTitulo() {
        return titulo;
    }

}
