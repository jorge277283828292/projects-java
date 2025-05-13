//Solicita el tamaño del array y luego los valores, para al final terminar imprimiendolo.
import java.util.Scanner;

public class Ordenar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tamano;
            System.out.println("Ingrese el tamaño del arreglo: ");
            tamano=sc.nextInt();
            int arr[]=new int[tamano];
            System.out.println("Ingresa los " + tamano + " valores enteros: ");
            for(int i=0;i<tamano;i++) {
                arr[i]=sc.nextInt();
            }

            System.out.println("Arreglo ordenado: ");
            for (int i = 0; i < tamano; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
