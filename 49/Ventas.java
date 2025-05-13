//Pide el nombre del vendedor, la computadoras vendidas, y las ventas a fin de mes, y con ello calcula el sueldo.
import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        int computadorasVendidas=0;
        double totalVentas=0,sueldoTotal=0;
        String nombreVendedor;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre del vendedor: ");
        nombreVendedor=sc.next();
        System.out.println("Ingrese la cantidad de computadoras vendidas: ");
        computadorasVendidas=sc.nextInt();
        System.out.println("Ingrese el monto total de la venta del mes: ");
        totalVentas=sc.nextDouble();
        sueldoTotal=5000+200*computadorasVendidas+0.05*totalVentas;
        System.out.println("El empleado " + nombreVendedor + " vendio un total de " + computadorasVendidas + ", y su sueldo total es de: " + sueldoTotal);
    }
}
