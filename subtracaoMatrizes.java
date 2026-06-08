
import java.util.Scanner;

public class subtracaoMatrizes {
    public static void main(String[] args) {
        
        double A[][] = new double[3][3], B[][] = new double[3][3], C[][] = new double[3][3];
        Scanner ler = new Scanner(System.in);
        for (int linhas = 0; linhas < A.length; linhas++) {
            for (int colunas = 0; colunas < A[0].length; colunas++) {
                System.out.printf("Digite a posicao %d,%d da matriz A\n", linhas+1, colunas+1);
                A[linhas][colunas] = ler.nextDouble();
            }
        }
            for (int linhas = 0; linhas < A.length; linhas++) {
            for (int colunas = 0; colunas < A[0].length; colunas++) {
                System.out.printf("Digite a posicao %d,%d da matriz B\n", linhas+1, colunas+1);
                B[linhas][colunas] = ler.nextDouble();
                C[linhas][colunas] = A[linhas][colunas] - B[linhas][colunas];
            }
        }
        
        for (int linhas = 0; linhas < C.length; linhas++) {
            for (int colunas = 0; colunas < C[0].length; colunas++) {
                System.out.printf("[%.1f]",C[linhas][colunas]);
            }
            System.out.println();
        }
    }
}
