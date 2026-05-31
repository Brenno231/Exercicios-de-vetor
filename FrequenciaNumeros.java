import java.util.Scanner;

public class FrequenciaNumeros {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();

        int conjuntoOrigial[] = new int[N];
        int conjuntoSemRepeticao[] = new int[N];

        int iSemRepeticao = 0;

        for (int i = 0; i < conjuntoOrigial.length; i++) {
            conjuntoOrigial[i] = ler.nextInt();
            boolean repetido = false;
            for (int j = 0; j < iSemRepeticao; j++) {
                if (conjuntoOrigial[i] == conjuntoSemRepeticao[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                conjuntoSemRepeticao[iSemRepeticao] = conjuntoOrigial[i];
                iSemRepeticao++;
            }
        }

        int qntValoresRepetidos[] = new int[N];
        int iValoresRepetidos = 0;
        for (int percorrer : conjuntoSemRepeticao) {
            int repetido = 0;
            int iOriginal = 0;
            while (iOriginal < conjuntoOrigial.length) {
                if (percorrer == conjuntoOrigial[iOriginal]) {
                    ++repetido;
                }
                ++iOriginal;
            }
            qntValoresRepetidos[iValoresRepetidos] = repetido;
            ++iValoresRepetidos;
        }

        for (int i = 0; i < iSemRepeticao - 1; i++) {
            for (int j = i + 1; j < iSemRepeticao; j++) {
                if (conjuntoSemRepeticao[i] > conjuntoSemRepeticao[j]) {
                    int menor = conjuntoSemRepeticao[i];
                    conjuntoSemRepeticao[i] = conjuntoSemRepeticao[j];
                    conjuntoSemRepeticao[j] = menor;

                    int menorQnt = qntValoresRepetidos[i];
                    qntValoresRepetidos[i] = qntValoresRepetidos[j];
                    qntValoresRepetidos[j] = menorQnt;
                }
            }
        }

        for (int k = 0; k < iSemRepeticao; k++) {
            System.out.printf("%d aparece %d vez(es)\n", conjuntoSemRepeticao[k], qntValoresRepetidos[k]);
        }
    }
}