package Execicios.Testes.Classes;

import Dominio.ContaCorrente;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(45, 800, true, 2000);
        conta.consultarEspecial();
    }
    
}
