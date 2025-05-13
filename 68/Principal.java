//Da el numero mayor entre 3 digitos.
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digitos = new int[3];
        int num = 0;
        int tam = 0;
        int mayor = 0;
        int i = 0;
        String cadena = "";

        do {
            System.out.println("Ingrese un número de 3 dígitos: ");
            num = sc.nextInt();
            cadena = String.valueOf(num);
            tam = cadena.length();
        } while (tam != 3);

        for (i = 0; i < tam; i++) {
            digitos[i] = Integer.parseInt(cadena.substring(i, i + 1));
            if (digitos[i] > mayor) {
                mayor = digitos[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        sc.close();
    }
}
