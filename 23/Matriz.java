//Genera una matriz con numeros ingresados por el usuario.
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        try (Scanner s = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("Introduce un numero: ");
                    int num = s.nextInt();
                    matriz[i][j] = num;
                }
            }
        }

        System.out.println("Imprimir numeros de la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
