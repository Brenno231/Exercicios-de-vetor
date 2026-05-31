
import java.util.Scanner;

public class TrocaVetor {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int N[] = new int[20];
        int nModificado[] = new int[20];
        int j = 1;
        for(int i = 0; i < N.length; i++){
            N[i] = ler.nextInt();
            nModificado[N.length - j] = N[i];
            ++j;
        }
        for(int i = 0; i < nModificado.length; i++){
            System.out.printf("N[%d] = %d\n",i,nModificado[i]);
        }
    }
}
