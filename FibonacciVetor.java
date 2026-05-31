import java.util.Scanner;

public class FibonacciVetor {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        long vetorFibonacci[] = new long[61];
        vetorFibonacci[0] = 0;
        vetorFibonacci[1] = 1;
        for(int i = 2; i < vetorFibonacci.length; i++){
            vetorFibonacci[i] = vetorFibonacci[i - 2] + vetorFibonacci[i - 1];
        }
        for (int N = ler.nextInt(); N > 0; --N) {
            int posiVetor = ler.nextInt();
            System.out.printf("Fib(%d) = %d\n",posiVetor,vetorFibonacci[posiVetor]);
        }
    }
}
