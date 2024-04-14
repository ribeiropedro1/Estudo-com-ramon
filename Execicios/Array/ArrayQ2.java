package Execicios.Array;
import java.util.Scanner;
public class ArrayQ2 {
    public static void main(String[] args) {
        int Qnumeros = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insirta a quantidade de números que deseja inserir:");
        Qnumeros = input.nextInt();
        double numeros[] = new double[Qnumeros];
        
        System.out.println("Quais valores você deseja?\n");
        
        for (int c = 0; c < numeros.length; c++){
            System.out.print("Valor " + (c + 1) + ": " );
            numeros[c] = input.nextInt();
        }

        System.out.print("Agora, digite um número alvo: ");
        double Alvo = input.nextDouble();

        for (int a = 0; a < numeros.length; a++){
            if (numeros[a] == Alvo){
                System.out.println("A primeira aparição do número alvo está na posição " + a + " deste array, e na posição " + (a + 1) + " de aparição.");
                break;
            }
        }

        System.out.println("O número alvo não está presente nesse array.");

    }
}
