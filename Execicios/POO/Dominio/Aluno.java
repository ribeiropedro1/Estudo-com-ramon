package Dominio;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String curso;
    private long matricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    
    public Aluno(String nome, String curso, long matricula){
        this(nome);
        this.curso = curso;
        this.matricula = matricula; 
    }
    public Aluno(String nome){
        this.nome = nome;
    }

    public void addDisciplina(String nome, double nota){
        this.disciplinas.add(new Disciplina(nome, nota));
    }

    public void Aprovacao(){
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNota() >= 7) {
                System.out.println("Aluno foi aprovado em " + disciplina.getNome() + " com: " + disciplina.getNota());
            }else{
                System.out.println("Aluno reprovado em " + disciplina.getNome() + " com: " + disciplina.getNota());
            }
        }
    }

    public void imprimirDisciplinas(){
        for (Disciplina disciplina : this.disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }

    public void imprimirInformações(){
        System.out.println(this.nome + ", " + this.curso + ", " + this.matricula + ".");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    
}
