//Una matriz en la cual solo se podran agregar numeros positivos.
import java.util.Scanner;

public class MatrizPositivos {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("====INTRODUCE LOS NUMEROS DE LA MATRIZ====");

            for (int[] matriz1 : matriz) {
                for (int j = 0; j < matriz1.length; j++) {
                    boolean numeroValido = false;
                    while (!numeroValido) {
                        System.out.println("Introduce un numero: ");
                        int num = s.nextInt();
                        if (num >= 0) {
                            matriz1[j] = num;
                            numeroValido = true;
                        } else {
                            System.out.println("El número es negativo. No podrá acceder a la matriz.");
                        }
                    }
                }
            }
        }

        System.out.println("Mostrar matriz: ");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "\t");
            }
            System.out.println();
        }
    }
}
