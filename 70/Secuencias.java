//Pide un numero N y luego crea una secuencia del mismo tamaño en que los numeros sean la suma de los 2 anteriores.
import java.util.Scanner;

public class secuencias {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Captura el valor de N: ");
            int n=sc.nextInt();

            if(n<=0) {
                System.out.println("Error. El numero debe de ser mayor que cero");
                return;
            }
            int[]secuencia=new int[n];
            if(n>0)secuencia[0]=1;
            if(n>1)secuencia[1]=1;

            for(int i=2;i<n;i++) {
                secuencia[i]=secuencia[i-1]+secuencia[i-2];
            }
            System.out.println("Secuecia numerica: ");
            for(int num:secuencia) {
                System.out.println(num + " ");
            }
        }
    }    
}
