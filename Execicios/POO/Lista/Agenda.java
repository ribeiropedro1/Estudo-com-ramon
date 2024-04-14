package Lista;

import java.util.ArrayList;


public class Agenda {

    public ArrayList<Pessoa> agenda = new ArrayList<Pessoa>();
    
    //FULL
    public void adicionarPessoas(String nome, int idade, double altura, double peso, int cpf){
        agenda.add(new Pessoa(nome, idade, altura, peso, cpf));
    }

    //FULL
    public void removerPessoa(int i){
        agenda.remove(i);
    }

    //FULL
    public Pessoa buscarPessoa(int cpf){
        for (Pessoa pessoa : agenda) {
            if (pessoa.getCPF() == cpf) {
                System.out.println(pessoa.getNome() +" econtrado!");
                return pessoa;
            }
        }
        System.out.println("Não encontrado!");
        return null;
    }

    //FULL  
    public void printarAgenda(){
        for (Pessoa pessoa : agenda) {
            System.out.println(pessoa.toString());
        }
    }
}
