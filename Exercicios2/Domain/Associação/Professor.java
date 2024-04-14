package Exercicios2.Domain.Associação;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private String especialidade;
    private ArrayList<Seminario> seminarios = new ArrayList<Seminario>();
    
    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void addSeminario(Seminario seminario){
        seminarios.add(seminario);
    }

    public void imprimirSeminarios(){
        System.out.println("O professor " + this.nome + " ministra os seminários:");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
        }
    }
    
    public String getNome() {
        return nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
}
