package Execicios.Array;
import java.util.Scanner;
public class ArrayQ1 {
    public static void main(String[] args) {
        int Qnumeros = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Insirta a quantidade de números que deseja inserir:");
        Qnumeros = input.nextInt();
        int numeros[] = new int[Qnumeros];
        int maior = 0;
        int menor = 0;

        System.out.println("Quais valores você deseja?\n");
        
        for (int c = 0; c < numeros.length; c++){
            System.out.print("Valor " + (c + 1) + ": " );
            numeros[c] = input.nextInt();
        }
        
        for (int a = 0; a < numeros.length; a++){
            if (maior < numeros[a]) {
                maior = numeros[a];
            }
        }
        
        menor = maior;
        
        for (int b = 0; b < numeros.length; b++){
            if (menor > numeros[b]) {
                menor = numeros[b];
            }    
        }
        
        System.out.println("O maior número dessa sequência é: " + maior);
        System.out.println("O menor número dessa sequência é: " + menor);
    }    
}
