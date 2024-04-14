package Exercicios2.Testes;

import Exercicios2.Domain.Associação.Aluno;
import Exercicios2.Domain.Associação.Local;
import Exercicios2.Domain.Associação.Professor;
import Exercicios2.Domain.Associação.Seminario;

public class TesteSeminarios {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 19);
        Seminario seminario = new Seminario("Como abrir uma porta?");
        Professor professor = new Professor("Alberto", "Forense");
        Local local = new Local("Salvador");
        seminario.setLocal(local);
        seminario.imprimirLocal();
        professor.addSeminario(seminario);
        aluno.setSeminario(seminario);
        seminario.addAluno(aluno);
        
    }
    
}
