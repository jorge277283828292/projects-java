//Solicita al usuario que ingrese 10 numeros enteros, y devuelve sin son positivos, negativos o sin son ceros.
import java.util.Scanner;

public class positivos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[]a=new int[10];
        int contPositivos=0;
        int contNegativos=0;
        int contCeros=0;

        System.out.println("Introduce 10 números enteros: ");

        for (int i=0;i<a.length;i++) {
            a[i] = s.nextInt();
            if(a[i] > 0) {
                contPositivos++;
            }else if(a[i] < 0) {
                contNegativos++;
            }else{
                contCeros++;
            }
        }

        System.out.println("Cantidad de números positivos: " + contPositivos);
        System.out.println("Cantidad de números negativos: " + contNegativos);
        System.out.println("Cantidad de ceros: " + contCeros);

        s.close();
    }
}