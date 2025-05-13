//Este programa consta de que el usuario ingresa 10 numeros a un array y este los mostrara un espacio hacia adelante del que fueron ingresados.
import java.util.Scanner;

public class PosicionArray {
    public static void main(String[] args) {
        int a[]= new int[10];
        int ultimo;
        try (Scanner s = new Scanner(System.in)) {
            for(int i=0;i<10;i++) {
                System.out.println("Introduce un numero entero: ");
                a[i]=s.nextInt();
            }
        }
        ultimo=a[9];
        for(int i=8;i>=0;i--) {
            a[i+1]=a[i];
            a[0]=ultimo;
        }
        a[0]=ultimo;
        System.out.println("Mostar arreglo desplazado una posicion: ");
        for(int i=0;i<10;i++) {
            System.out.println(a[i]);
        }
    }
}
