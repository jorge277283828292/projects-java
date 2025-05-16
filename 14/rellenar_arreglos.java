//Es sencillo en si es que el usuario digita los datos de las dos primeras arrays y luego las imprime en un tercer array.
import java.util.Scanner;

public class rellenar_arreglos {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        int i, j;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Introducir datos en el array 'a': ");
            for (i = 0; i < a.length; i++) {
                System.out.println("Posicion: " + (i + 1) + ":");
                a[i] = scanner.nextInt();
            }

            System.out.println("Introducir datos en el array 'b': ");
            for (i = 0; i < b.length; i++) {
                System.out.println("Posicion " + (i + 1) + ":");
                b[i] = scanner.nextInt();
            }
        }

        System.out.println("Pasar los numeros al array 'c':");
        j = 0;
        for (i = 0; i < 10; i++) {
            c[j++] = a[i];
            System.out.println(c[j - 1]);
            c[j++] = b[i];
            System.out.println(c[j - 1]);
        }
    }
}
