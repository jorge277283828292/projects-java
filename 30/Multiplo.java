//Solicita al usuario 10 numeros y dependiendo del orden en que los ingrese el programa dice si fue de forma: Creciente, Decreciente, Desordenada
//o ya si es el caso si todos los numeros son iguales.
import java.util.Scanner;

public class multiplo {
    public static void main(String[] args) {
        int[] a; 
        Scanner s = new Scanner(System.in);
        int i;
        boolean creciente = false;
        boolean decreciente = false;
        a = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.println("Introduce el numero: " + (i + 1) + " : ");
            a[i] = s.nextInt();
        }
        for (i = 0; i < 9; i++) {
            if (a[i] > a[i + 1]) {
                decreciente = true;
            }
            if (a[i] < a[i + 1]) {
                creciente = true;
            }
        }
        if (creciente && !decreciente) {
            System.out.println("Serie creciente.");
        }
        if (!creciente && decreciente) {
            System.out.println("Serie decreciente.");
        }
        if (creciente && decreciente) {
            System.out.println("Serie desordenada.");
        }
        if (!creciente && !decreciente) {
            System.out.println("Todos los números iguales.");
        }
        s.close();
    }
}