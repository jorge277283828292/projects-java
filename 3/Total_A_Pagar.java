//Este programa consta de que el usuario indique una cantidad de pan, 
//ademas de que si se cumple cierto criterio se le dara un descuento.
import java.util.Scanner;

public class total_a_pagar {
    public static void main(String[] args) {
        int CantPiezas;
        double TotalPago;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la cantidad de pan que desea comprar: ");
            CantPiezas = scanner.nextInt();
        }
        if (CantPiezas >= 100) {
            TotalPago = CantPiezas * 4.0;
        } else if (CantPiezas >= 50) {
            TotalPago = CantPiezas * 4.5;
        } else {
            TotalPago = CantPiezas * 5.0;
        }
        System.out.println("El cliente compro " + CantPiezas + " piezas de pan");
        System.out.println("El total a pagar es: " + TotalPago + " colonees");
    }
}
