package Execicios.Testes.Classes;

import java.util.Scanner;

import Dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual nome do aluno?");
        String nome = input.nextLine();
        Aluno aluno = new Aluno(nome);
        System.out.println("Qual curso o aluno está fazendo?");
        String curso = input.nextLine();
        System.out.println("E qual matrícula do(a) aluno(a)?");
        long matricula = input.nextLong();
        aluno.setCurso(curso);
        aluno.setMatricula(matricula);
        aluno.addDisciplina("Geografia", 8);
        aluno.addDisciplina("Matemática", 5);
        aluno.imprimirInformações();
        
    }
    
}
