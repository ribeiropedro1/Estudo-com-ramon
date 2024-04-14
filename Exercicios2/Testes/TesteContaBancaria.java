package Exercicios2.Testes;

import Exercicios2.Domain.Herança.ContaEspecial;
import Exercicios2.Domain.Herança.ContaPoupanca;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca("Alberto", 4847);
        ContaEspecial conta2 = new ContaEspecial("Joao", 5555, 500);

        System.out.println("-------------------------");
        conta2.Saque(500);
        System.out.println("-------------------------");
        conta.Deposito(800);
        conta.calcularNovoSaldo(0.8);
        System.out.println("-------------------------");
        conta.Saque(1000);
        System.out.println("-------------------------");

        
        conta.imprimirDados();
        System.out.println("-------------------------");
        conta2.imprimirDados();
        

    }
    
}
