package Exercicios2.Domain.Herança;

public class ContaPoupanca extends ContaBancaria {
    
    private double diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta){
        super(nomeCliente, numConta);
    }

    public void calcularNovoSaldo(double diaRendimento){
        this.diaRendimento = diaRendimento;
        super.saldo += (this.diaRendimento / 100)  * super.saldo;
        System.out.println("O atual saldo é de: R$ " + super.saldo);
     
    }

    
}
