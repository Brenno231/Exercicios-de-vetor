
import java.util.Scanner;

public class Primos{
    public static void main(String[] args) {
        int n[] = new int[10];
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < n.length; i++){
            n [i] = ler.nextInt();
        }
        for(int i = 0; i < n.length; i++){
            double raiz = Math.sqrt(n[i]);
            int div = 2;
            boolean primo = true;
            while(div <= raiz){
                if(n [i] % div == 0){
                    primo = false;
                    break;
                }
                ++div;
            }
            if(primo && n [i] > 1){
                System.out.printf("%d ",n[i]);
            }
            
        }
        System.out.print("-> Esses números são primos\n");
    }
}