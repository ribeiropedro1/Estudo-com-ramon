package Lista;

public class MainAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        agenda.adicionarPessoas("Pedro", 16, 1.75, 79, 86653599);
        agenda.adicionarPessoas("joão", 20, 1.72, 75, 96675748);
        agenda.adicionarPessoas("Maiara", 25, 1.71, 68, 232284546);
        agenda.printarAgenda();
        System.out.println("--------------------------");
        agenda.removerPessoa(2);
        agenda.printarAgenda();
    }
    
}


