//Un arreglo que recibe los numeros y gracias a un metodo los acomoda de menor a mayor.
import java.util.Arrays;
import java.util.Scanner;

public class arreglo_ordenado {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println(" =======Rellenar Arreglo======= ");
        for (int k = 0; k < a.length; k++) {
            System.out.println("Introduce un numero:");
            a[k] = s.nextInt();
        }

        ordenarArreglo(a);
        System.out.println("Arreglo Ordenado");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Arrays.sort(a);
        System.out.println("\nArreglo Ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        s.close();
    }

    public static void ordenarArreglo(int[] a) {
        boolean ordenado = false;
        while (!ordenado) {
            int contadorIntercambio = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                    contadorIntercambio++;
                }
            }
            if (contadorIntercambio == 0) {
                ordenado = true;
            }
        }
    }
}