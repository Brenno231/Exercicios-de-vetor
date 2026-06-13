
import java.util.Scanner;

public class areaEsquerda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String operacao = ler.nextLine().trim().toLowerCase();
        double soma = 0, div = 0;
        double matrizx12[][] = new double[12][12];
        for (int linhas = 0; linhas < matrizx12.length; linhas++) {
            for (int colunas = 0; colunas < matrizx12[0].length; colunas++) {
                matrizx12[linhas][colunas] = ler.nextDouble();
            }
        }
        int linhas, colunas;
        for (linhas = 1; linhas < 11; linhas++) {
            for (colunas = 0; colunas < linhas && linhas + colunas < 11; colunas++) {
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