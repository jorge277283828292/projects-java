//Este programa solicita al usuario que ingresa las ultimas 30 ventas del mes, 
//y luego dira cuales son mayores a $2000, se le pueede cambiar el valor,
//pero n este caso lo estas solicitando con 2000.
import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        double ventas[] = new double[30];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese las 30 ventas del mes:");
            for (int i=0; i<ventas.length; i++){
                System.out.println("Venta " + (i+1));
                ventas[i] = scanner.nextDouble();
            }
        }
        int i = 0;
        int total = 0;
        while (i < 30) {
            if (ventas[i]>=2000) {
                System.out.println("$" + ventas[i]);
            total++;
            }
                i++;
        }
        System.out.println("El total de ventas mayores a 2000 es: " + total);
    }
}