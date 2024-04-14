package Execicios.Array;
import java.util.Scanner;
public class ArrayQ3 {
    public static void main(String[] args) {
        double[] numeros = new double[10];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite 10 valores para nosso sistema inverter e retornar o valor!");

        for (int c = 0; c < numeros.length; c++){
            System.out.print("Valor " + (c + 1) + ": " );
            numeros[c] = input.nextInt();
        }
        
        System.out.println("Sua sequência númerica é: ");

        for(int a = 0; a < numeros.length; a++){
            System.out.println(numeros[a]);
        }

        System.out.println("E sua inversão é: ");

        for (int i = numeros.length - 1; i >= 0; i--) { 
            System.out.println(numeros[i]);
        }
    }
}

