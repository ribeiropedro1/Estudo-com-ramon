package Execicios.For;
import java.util.Scanner;
public class ForQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Nusuario;
        int Divisor = 0;
        
        System.out.println("Digite um número inteiro, e verificarei se ele é primo ou não.");
        System.out.println("Qual seu número?");
        Nusuario = input.nextInt();
        
        for(int i = 1; i <= Nusuario; i++){
            if (Nusuario % i == 0) {
                Divisor++;
            }
        }
        if (Divisor == 2) {
            System.out.println("Seu número é primo!");
                
        }else{
            System.out.println("Seu número não é primo!");
        }
    }
}
