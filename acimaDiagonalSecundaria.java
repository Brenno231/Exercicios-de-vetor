
import java.util.Scanner;

public class acimaDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String operacao = ler.nextLine().trim().toLowerCase();
        double [][]matrizx12 = new double[12][12];
        for (int linhas = 0; linhas < matrizx12.length; linhas++) {
            for (int colunas = 0; colunas < matrizx12[0].length; colunas++) {
                matrizx12[linhas][colunas] = ler.nextDouble();
            }
        }
        int i = 0, div = 0;
        double soma = 0;
        for (int linhas = 0; linhas < matrizx12.length - 1; linhas++) {
            ++i;
            for (int colunas = 0; colunas < matrizx12[0].length - i; colunas++) {
                soma += matrizx12[linhas][colunas];
                ++div;
             }
        }
         if (operacao.equals("s")) {
            System.out.printf("%.1f\n", soma);
        } else {
            System.out.printf("%.1f\n", soma / div);
        }
    }
}
