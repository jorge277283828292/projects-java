//Da la cantidad de cifras que tienen el numero que ingrese el usuario.
import java.util.Scanner;

public class CantidadCifras {
    public static void main(String[] args) {
    int numero, cifras;
    Scanner sc=new Scanner(System.in);
    System.out.println("Introduce un numero entero: ");
    numero=sc.nextInt();
    cifras=0;
    do 
    {
    
    while(numero!=0) {
        numero=numero/10;
        cifras++;
    }
    }
    while(numero!=0);
        System.out.println("La cantidad de cifras de numeros es: " + cifras);
    }
}
