
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        double ventas[] = new double[30];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las 30 ventas del mes:");
        for (int i=0; i<ventas.length; i++){
            System.out.println("Venta " + (i+1));
            ventas[i] = scanner.nextDouble();
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