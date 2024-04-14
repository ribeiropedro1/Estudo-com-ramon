package Exercicios2.Domain.Herança;

public class ContaEspecial extends ContaBancaria {
    
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double limite){
        super(nomeCliente, numConta);
        this.limite = limite;
    }

    public double Saque(double valor){
        if(super.saldo >= valor){
            super.saldo -= valor;
            System.out.println("Saque concluído!");
            return valor;
        } else if (limite + super.saldo >= valor) {
            super.saldo -= valor;
            System.out.println("Saque com cheque especial realizado!");
            return valor;
        }else{
            System.out.println("Saque não efetuado!");
            return 0;
        }
        
    }

    public double getLimite() {
        return limite;
    }
}
