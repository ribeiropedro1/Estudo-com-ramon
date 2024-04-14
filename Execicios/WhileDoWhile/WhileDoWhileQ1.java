package Execicios.WhileDoWhile;
import java.util.Scanner;
public class WhileDoWhileQ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int NumeroUser;
        long ResultadoAtual = 1;
        
        System.out.print("Digite o número que deseja fazer a conta do seu fatorial: ");
        NumeroUser = input.nextInt();

        while (NumeroUser > 1) {
            ResultadoAtual *= NumeroUser;
            NumeroUser--;
        }
        System.out.println(ResultadoAtual);
        
    }    
}
// Com números altos não está funcionando, não sei o porquê, busquei ajuda no paizão google
