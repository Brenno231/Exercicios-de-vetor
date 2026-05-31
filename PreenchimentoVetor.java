
import java.util.Scanner;

public class PreenchimentoVetor {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int n[] = new int[10];
        int valorUser = ler.nextInt();

        for (int i = 0; i < n.length; i++) {
            if (i == 0) {
                n[i] = valorUser;
            } else {
                n[i] = n[i - 1] * 2;
            }
        }
        for (int k = 0; k < n.length; k++) {
            System.out.printf("N[%d] = %d\n",k,n[k]);
        }
    }
}
