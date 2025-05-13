//Este programa le solicitara al usuario que indique cuantos numeros quiere que tenga su array, luego de esto los generara de forma inversa.
import java.util.Scanner;

public class NumInversos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("¿Que longitud deseas que tenga?");
            int longitud = scanner.nextInt();

            int a[]=new int[longitud];
            
            for(int i=0;i<a.length;i++) {
                System.out.println("Introduzca un numero: ");
                a[i]=scanner.nextInt();
            }
            System.out.println("Los numeros en orden inverso son: ");
            int reversa = a.length - 1;
            while (reversa>=0) {
                System.out.println(a[reversa]);
                reversa--;
            }
        }
    }
}
