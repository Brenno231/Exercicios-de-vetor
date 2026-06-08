
import java.util.Scanner;

public class matrizIdentidade {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        boolean diagonalIdentidade = true;
        boolean matrizIdentidade = true;
        int[][] matrizOrdem3 = new int[3][3];
        for (int linhas = 0; linhas < matrizOrdem3.length; linhas++) {
            for (int colunas = 0; colunas < matrizOrdem3[0].length; colunas++) {
                System.out.printf("Digite o valor da %d linha e da %d° coluna\n",linhas + 1, colunas + 1);
                matrizOrdem3[linhas][colunas] = ler.nextInt();
                if(linhas != colunas && matrizOrdem3[linhas][colunas] != 0){
                    matrizIdentidade = false;
                }
            }
            if(matrizOrdem3[linhas][linhas] != 1){
                diagonalIdentidade = false;
            }
        }
        if(matrizIdentidade && diagonalIdentidade){
            System.out.println("A matriz descrita é uma matriz identidade");
        }else{
             System.out.println("A matriz descrita não é uma matriz identidade");
        }
        for(int linhas = 0; linhas < matrizOrdem3.length; linhas++){
            for(int colunas = 0; colunas < matrizOrdem3[0].length; colunas++){
                System.out.printf("[%d]",matrizOrdem3[linhas][colunas]);
            }
            System.out.println();
        }
    }
}
