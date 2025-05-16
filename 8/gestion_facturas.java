//Este programa consta de que el usario va indicar ciertas caracteristicas de un producto para la generacion de la factura,
//el usuario indicara el codigo de producto, los ilos vendidos, el precio por kilo, y asi hasta 5 facturas y luego el programa,
//indicara cuales facturas superaron los 100 euros(en este caso), el total de kilos vendidos, y el total de las facturas.
import java.util.Scanner;

public class gestion_facturas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int kilos=0;
            float precio=0.0f;
            float importeFactura=0.0f;
            float totalFactura=0;
            int contador=0;
            int totalKilos=0;

            for(int i=1; i<=5; i++){
                System.out.println("Factura " + i + ":");
                System.out.print("Código del producto: ");
                System.out.print("Kilos vendidos: ");
                kilos = scanner.nextInt();
                System.out.print("Precio por kilo: ");
                precio = scanner.nextFloat();
                importeFactura=kilos*precio;
                totalFactura=importeFactura+totalFactura;
                
                if (importeFactura>1000){
                    contador++;
                }
                totalKilos=totalKilos+kilos;
            }
            System.out.println("Total de facturas superiores a 1000 euros: " + contador);
            System.out.println("Total de kilos vendidos: " + totalKilos);
            System.out.println("Total de las facturas: " + totalFactura);
        }

    }
}
