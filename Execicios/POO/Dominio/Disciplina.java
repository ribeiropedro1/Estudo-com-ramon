package Dominio;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private double nota;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public void addAluno(String nome){
        alunos.add(new Aluno(nome));
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

   
    
}
