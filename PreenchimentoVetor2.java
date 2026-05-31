
import java.util.Scanner;

public class PreenchimentoVetor2{
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int T = ler.nextInt(), T1 = 0;
        int N[] = new int[1000];
        for(int i = 0; i < N.length; ++i){
            N[i] = T1;
            ++T1;
            if(T1 == T){
                T1 = 0;
            }
            System.out.printf("N[%d] = %d\n",i,N[i]);
        }
    }
}