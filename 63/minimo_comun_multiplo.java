//Da el minimo comun multiplo de dos numeros.
import java.util.Scanner;

public class minimo_comun_multiplo {
    public static void main(String[] args) {
        int num1, num2; 
        int max=0;
        int i=0;
        Scanner sc=new Scanner(System.in);
            System.out.println("Ingresa el numero 1: ");
            num1=sc.nextInt();
            System.out.println("Ingrese el numero 2: ");
            num2=sc.nextInt();
            max=num1;

            if(num2>max) {
                max=num2;
                i=max;

                while((i%num1!=0) || (i%num2!=0)) {
                    i++;
                }
                System.out.println("El minimo comun multiplo de " + num1 + " y " + num2 + " es: " + i);
            }
    }
}
