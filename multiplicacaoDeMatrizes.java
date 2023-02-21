package Matrizes;
public class multiplicacaoDeMatrizes {

    public static void main(String[] args) {


        
        int[][] matrizA = new int[2][3];
        int[][] matrizB = new int[3][2];

        matrizA[0][0] = 3;
        matrizA[0][1] = 1;
        matrizA[0][2] = 3;
        matrizA[1][0] = 6;
        matrizA[1][1] = 5;
        matrizA[1][2] = 5;

        matrizB[0][0] = 100;
        matrizB[0][1] = 50;
        matrizB[1][0] = 50;
        matrizB[1][1] = 100;
        matrizB[2][0] = 50;
        matrizB[2][1] = 50;

        System.out.println("Matriz A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        int[][] matrizR = new int[2][2];

        
        
        // Resulta a Linha 0
        int x = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizR[0][x] = matrizR[0][x] + (matrizA[0][j] * matrizB[j][i]);
            }
            x = 1;
        }

        // Resulta a Linha 1
        x = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrizR[1][x] = matrizR[1][x] + (matrizA[1][j] * matrizB[j][i]);
            }
            x = 1;
        }

        System.out.println(" ");
        
        System.out.println("Matriz R");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizR[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}