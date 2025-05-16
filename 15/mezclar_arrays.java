//Muy parecido al otro nada mas que mezcla las dos arrays en otra.
import java.util.Scanner;

public class mezclar_arrays {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese los datos del arreglo A");
            for(int i=0; i<10; i++) {
                System.out.println("Ingrese un numero " + (i+1) + ":");
                A[i] = scanner.nextInt();
            }

            System.out.println("Ingrese los datos del arreglo B");
            for(int i=0; i<10; i++) {
                System.out.println("Ingrese el numero " + (i+1) + ":");
                B[i] = scanner.nextInt(); 
            }
        }

        int i = 0;
        int j = 0;
        while (i < 10) {
            for (int k = 0; k < 3 && i + k < 10; k++) {
                C[j] = A[i + k];
                j++;
            }
            for (int k = 0; k < 3 && i + k < 10; k++) {
                C[j] = B[i + k];
                j++;
            }
            i += 3;
        }

        System.out.println("Arreglo C: ");
        for(j = 0; j < 20; j++) {
            System.out.println(C[j]);
        }
    }
}
