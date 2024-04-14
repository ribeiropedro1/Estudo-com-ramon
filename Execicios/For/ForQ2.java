package Execicios.For;
import java.util.Scanner;
public class ForQ2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número e lhe mostrarei a tabuada dele.");
        System.out.print("Qual número deseja? ");
        numero = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println("|" + (numero * i));
        }   
    }
}
