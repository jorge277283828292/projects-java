//Este programa consta de que el usuario va a estar ingresando numeros hasta cuantos desee,
//pero si ingresa un 0 el ciclo se rompe y hace una suma de todos los valores indicados.
import java.util.Scanner;

public class PedirNumero {
    public static void main(String[] args) {
        int suma = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            int num = 0;
            do {
                System.out.println("Introduce un numero(0 para finalizar): ");
                num=scanner.nextInt();
                suma=suma+num;
            } while (num != 0);
        }
        System.out.println("La suma total es: " + suma);
        }
    }
    