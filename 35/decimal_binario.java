//Convierte el numero Decimal a Binario.
import java.util.Scanner;

public class decimal_binario {
    public static void main(String[] args) {
        int a[];
        int cont,num;
        Scanner s=new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        num=s.nextInt();
        a=new int [8];

        if(num<0 || 255<num) {
            System.out.println("El numero se encuantra fuera del rango");
        }else{
        cont=0;
        if(num==0) {
            a[cont]=0;
            cont++;
        }
        while(num!=0) {
            a[cont]=num%2;
            num=num/2;
            cont++;
        }
        System.out.println("En binario: ");

        for (int i = cont - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.println("");
        }
    }
}
