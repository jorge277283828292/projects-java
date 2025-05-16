//Este programa consta de que se genera un array con los 10 numeros ingresados por el usuario, 
//ademas de que despues de terminar el bucle se imprimira la array en el siguiente orden:
//Primero, Ultimo, Segundo, Penultimo, Tercero, etc...
import java.util.Scanner;

public class num_arreglo {
    public static void main(String[] args) {
        int j;
        int a[]=new int[10];
        try (Scanner Scanner = new Scanner(System.in)) {
            for(j=0;j<a.length;j++) {
                System.out.println("Introduce un numero: "+(j+1));
                a[j]=Scanner.nextInt();
            }
        }   
        for(j=0;j<10;j++) {
            System.out.println(a[j]);
            System.out.println(a[9-j]);
        }
    }
}
