
import java.util.Scanner;

public class AmplitudeVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int conjInt[] = new int[5];
        double media = 0;
        for (int i = 0; i < conjInt.length; i++) {
            conjInt[i] = ler.nextInt();
            media += conjInt[i];
        }
        int maior, menor;
        media /= conjInt.length;
        maior = menor = conjInt[0];
        for (int i = 1; i < conjInt.length; i++) {
            if (conjInt[i] > maior) {
                maior = conjInt[i];
            } else if (conjInt[i] < menor) {
                menor = conjInt[i];
            }
        }
        System.out.printf("A amplitude do conjunto é %d - %d = %d\n", maior, menor, maior - menor);
        System.out.printf("A média aritmetica do conjunto é %.2f\n", media);
        System.out.println("Este é o conjunto em ordem inversa");
        for(int i = 4; i >= 0; i--){
            System.out.printf("%d ",conjInt[i]);
        }
    }
}
