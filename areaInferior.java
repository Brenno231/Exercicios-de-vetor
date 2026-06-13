
import java.util.Scanner;

public class areaInferior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double matrizx12[][] = new double[12][12];
        int i = 0, div = 0;
        double soma = 0;
        String operacao = ler.nextLine().trim().toLowerCase();
        for (int linhas = 0; linhas < matrizx12.length; linhas++) {
            for (int colunas = 0; colunas < matrizx12[0].length; colunas++) {
                matrizx12[linhas][colunas] = ler.nextDouble();                
            }
        }
        for (int linhas = matrizx12.length - 1; linhas >= 7; linhas--) {
            i++;
            for (int colunas = i; colunas < matrizx12[0].length - i; colunas++) {
                soma += matrizx12[linhas][colunas];
                ++div;
            }
        }
        if(operacao.equals("s")){
            System.out.printf("%.1f\n",soma);
        }else{
            System.out.printf("%.1f\n",soma/div);
        }
    }
}
