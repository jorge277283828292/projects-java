//Este programa solicita 5 numeros al usuario y luego pide uno mas y luego coloca el numero en la posicion correcta,
//como si se estuviera ordenando de forma creciente.
import java.util.Scanner;

public class arreglo_ordenado {
    public static void main(String[] args) {
        int a[] = new int[6]; 
        int num, posicionNum;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Introduce los 5 números (ordenados de forma creciente): ");
            for (int i = 0; i < 5; i++) {
                a[i] = s.nextInt();
            }

            System.out.println("Introduce un número entero: ");
            num = s.nextInt();
        }

        posicionNum = 0;
        while (posicionNum < 5 && a[posicionNum] < num) {
            posicionNum++;
        }

        for (int i = 4; i >= posicionNum; i--) {
            a[i + 1] = a[i];
        }

        a[posicionNum] = num;

        System.out.println("Nuevo arreglo ordenado: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
}
