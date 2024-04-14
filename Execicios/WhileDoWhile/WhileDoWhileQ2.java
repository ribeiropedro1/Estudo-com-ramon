package Execicios.WhileDoWhile;
import java.util.Scanner;
import java.util.Random;

public class WhileDoWhileQ2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int Nivel;
        int Alvo1 = rd.nextInt(10);
        int Alvo2 = rd.nextInt(100);
        int Alvo3 = rd.nextInt(1000);
        int Tentativas = 1;
        int chute;
        boolean Errou = true;

        System.out.println("|Bem vindo ao tente acertar o alvo!");
        System.out.println("|Escolha um nível ed dificuldade:\n|Nível 1 (0 à 10)\n|Nível 2 (0 à 100)\n|Nível 3 (0 à 1000)");
        Nivel = input.nextInt();
        switch (Nivel) {
            case 1:
                System.out.println("|Você terá 10 tentativas para acertar o alvo!");
                while (Tentativas <= 10) {
                    System.out.println("|Digite sua tentativa:");
                    chute = input.nextInt();
                    if (chute < Alvo1) {
                        System.out.println("|O número ainda está pequeno");
                    }
                    else if (chute > Alvo1) {
                        System.out.println("|Seu número está maior que o alvo");
                    } 
                    else if (chute == Alvo1){
                        System.out.println("|Parabéns você acertou!");
                        Errou = false;
                        break;
                    }

                    Tentativas++;
                }
                    if (Errou) {
                        System.out.println("|Você errou!");
                    }
                
                break;
            case 2:
                while (Tentativas <= 10) {
                    System.out.println("|Digite sua tentativa:");
                    chute = input.nextInt();
                    if (chute < Alvo2) {
                        System.out.println("|O número ainda está pequeno");
                    }
                    else if (chute > Alvo2) {
                        System.out.println("|Seu número está maior que o alvo"); 
                    } 
                    else if (chute == Alvo2){
                        System.out.println("|Parabéns você acertou!");
                        Errou = false;
                        break;
                    }

                    Tentativas++;
                }
                    if (Errou) {
                        System.out.println("|Você errou!");
                    }
                
                break;
        
            case 3:
            
                while (Tentativas <= 10) {
                    System.out.println("|Digite sua tentativa:");
                    chute = input.nextInt();
                    if (chute < Alvo3) {
                        System.out.println("|O número ainda está pequeno");
                    }
                    else if (chute > Alvo3) {
                        System.out.println("|Seu número está maior que o alvo");
                    } 
                    else if (chute == Alvo3){
                        System.out.println("|Parabéns você acertou!");
                        Errou = false;
                        break;
                    }

                    Tentativas++;
                }
                    if (Errou) {
                        System.out.println("|Você errou!");
                    }
                
                break;
        
            default:
                    System.out.println("Nível não reconhecido!");
                break;
        }   
    }
}
