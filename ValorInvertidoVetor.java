
import java.util.Scanner;

public class ValorInvertidoVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int conjA [] = new int[5];
        int invertido = 0, inversao = 0;
        for(int i = 0; i < conjA.length; i++){
            conjA [i] = ler.nextInt();
            while(conjA[i] > 0){
                inversao = conjA[i] % 10; // pega o último dígito
                invertido = (invertido * 10) + inversao; // coloca o último dígito em 1° e aumenta uma casa
                conjA[i] /= 10; // divide por 10 para que o penúltimo número vire o último, ex: 12 -> 1 
            }
            conjA[i] = invertido;
            System.out.printf("%d ",conjA[i]);
            invertido = 0;
        }        
    }
}
