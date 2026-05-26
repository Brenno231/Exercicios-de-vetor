
import java.util.Scanner;

public class Diferencavetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho dos vetores!!!!");
        int N = ler.nextInt();
        int A[] = new int[N], B[] = new int[N], C[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o %d° valor do Conjunto A: ", i + 1);
            A[i] = ler.nextInt();
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            System.out.printf("Digite o %d° valor do Conjunto B: ", i + 1);
            B[i] = ler.nextInt();
        }
        int iC, iB, iA;
        iC = iA = iB = 0;
        while (iA < A.length) {
            boolean semValorRepetido = true;
            while (iB < B.length) {
                if (A[iA] == B[iB]) {
                    semValorRepetido = false;
                    iB = 0;
                    ++iA;
                    break;
                }
                ++iB;
            }
            if (semValorRepetido) {
                boolean jaExisteNoC = false;
                for (int i = 0; i < iC; i++) {
                    if (C[i] == A[iA]) {
                        jaExisteNoC = true;
                        break;
                    }
                }
                if (!jaExisteNoC) {
                    C[iC] = A[iA];
                    ++iC;
                }
                ++iA;
                iB = 0;
            }
        }
        for (int i = 0; i < iC; i++) {
            System.out.printf("{%d} ", C[i]);
        }
    }
}
