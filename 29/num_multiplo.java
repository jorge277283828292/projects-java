//Solicita al usuario que ingrese un numero y si es multiplo de 3 rompe el ciclo y si en 5 intentos no es multiplo de 3 el programa se finaliza.
import java.util.Scanner;

public class num_multiplo {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int num=0;
    boolean multiplo3;
    multiplo3=false;
    ciclo : for(int i=0;i<5;i++) {
    System.out.println("Introduzca un numero: ");
    num=teclado.nextInt();
    if(num %3==0) {
        multiplo3=true;
    }
        if(multiplo3==true) {
    System.out.println("Si es multiplo de 3\n");
            break;
    }else{
    System.out.println("No es multiplo de 3\n");
    }
    }
        }
}
}
