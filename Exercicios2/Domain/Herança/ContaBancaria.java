package Exercicios2.Domain.Herança;

public class ContaBancaria {
    protected String nomeCliente;
    protected int numConta;
    protected double saldo;

    public ContaBancaria(String nomeCliente, int numConta){
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
    }

    public double Saque(double valor){
        if (saldo >= valor) {
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= valor;
            return valor;
        }else{
        System.out.println("Saque não realizado!\nSaldo insuficiente!");
        return 0;
        }
    }

    public void imprimirDados(){
        System.out.println("|Nome do cliente: " + this.nomeCliente + "\n|Número da conta: " + this.numConta + "\n|O saldo da conta é de: R$ " + this.saldo);
    }

    public void Deposito(double valor){
        this.saldo += valor; 
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void imprimirSaldo(){
        System.out.println("O saldo atual é de: R$ " + this.saldo);
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
}
