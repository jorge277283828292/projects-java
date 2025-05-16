//Da el valor de la hipotenusa, de acuerdo a los catetos ingresados.
import java.util.Scanner;

public class hipotenusa {
    public static void main(String[] args) {
        double cateto1, cateto2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor del cateto 1: ");
        cateto1=sc.nextDouble();
        System.out.println("Introduce el valor del cateto 2: ");
        cateto2=sc.nextDouble();
        System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)));
    }
}
