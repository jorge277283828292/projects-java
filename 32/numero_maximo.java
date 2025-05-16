//Solicita al usuario 2 numeros y devuelve cual de los dos es el mayor.
import java.util.Scanner;

public class numero_maximo {
    static int maximo(int a, int b) {
    int max=0;

    if(a>b) {
        max=a;
    }else{
        max=b;
    }
    return(max);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int max=0;
        int a=0, b=0;
    
    System.out.println("Introduzca un numero: ");
    a=s.nextInt();
    System.out.println("Introduzca otro numero: ");
    b=s.nextInt();

    max=maximo(a, b);
    System.out.println("El numero maayor es: " + max);
    }
}
