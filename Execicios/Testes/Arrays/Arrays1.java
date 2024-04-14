package Execicios.Testes.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][2];

        arrayMulti[0] = new int[4];

        for (int[] Base : arrayMulti) {

            for (int scaner : Base) {

                System.out.println(scaner);
                
            }       
        }
    }
}
