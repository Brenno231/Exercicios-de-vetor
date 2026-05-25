import java.util.Scanner;

public class InterseccaoVetores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Me diga o tamanho dos vetores!!!");
        int N = ler.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];
        int C[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o %d° valor do vetor A\n", i + 1);
            A[i] = ler.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o %d° valor do vetor B\n", i + 1);
            B[i] = ler.nextInt();
        }
        int contadorC;
        int contadorB;
        int contadorA = contadorB = contadorC = 0;
        while (contadorA < A.length && contadorB < B.length) {
            if (A[contadorA] == B[contadorB]) {
                boolean repetido = false;
                for (int i = 0; i < contadorC; i++) {
                    if (C[i] == A[contadorA]) {
                        repetido = true;
                        break;
                    }
                }
                if (!repetido) {
                    C[contadorC] = A[contadorA];
                    contadorC++;
                }
                ++contadorA;
                contadorB = 0;
                continue;
            }
            ++contadorB;
            if (contadorB >= B.length) {
                contadorB = 0;
                ++contadorA;
            }
        }
        for (int i = 0; i < contadorC; i++) {
            System.out.printf("{%d} ", C[i]);
        }
    }
}