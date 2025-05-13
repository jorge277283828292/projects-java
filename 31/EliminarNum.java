//Pide al usuario que ingrese 10 numeros para ingresarlos a un array y luego pide al usuario que elija una posicion que desea eliminar.
import java.util.Scanner;

public class EliminarNum {
    public static void main(String[] args) {
        int a[]=new int[10];
        int posicion=0;
        Scanner s=new Scanner(System.in);

        for(int i=0;i<10;i++) {
            System.out.println("Elemento ("+i+"): ");
            a[i]=s.nextInt();
        }
        System.out.println();
        System.out.println("Posicion a eliminar: ");
        posicion=s.nextInt();

        for(int i=posicion;i<9;i++) {
            System.out.println(a[i]);
        }
    }
}