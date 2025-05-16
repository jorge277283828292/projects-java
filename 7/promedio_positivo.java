//Este programa consta de lo siguiente, de los primeros 10 numeros que el usuario indique se le calculara el promedio de este,
//y si hay numeros negativos hara el mismo procedimiento.
import java.util.Scanner;

public class promedio_positivo {
    public static void main(String[] args) {
        int num = 0, positivos = 0, negativos = 0;
        int sumaPositivos = 0, sumaNegativos = 0;
        double promedioPositivos = 0, promedioNegativos = 0;
        int i = 0;
        try (Scanner scanner = new Scanner(System.in)) {

            while (i < 10) {
                System.out.print("Ingrese un número: ");
                num = scanner.nextInt();
                if (num==0) {
                } else if(num >0){
                    positivos++;
                    sumaPositivos = sumaPositivos + num;
                } else {
                    negativos++;
                    sumaNegativos = sumaNegativos + num;
                }
                i++;
            }
            if (positivos > 0) {
                promedioPositivos = (double) sumaPositivos / positivos;
                System.out.println("Promedio de números positivos: " + promedioPositivos);
            } else {
                System.out.println("No se ingresaron números positivos.");
            }
        }
        if (negativos > 0) {
            promedioNegativos = (double) sumaNegativos / negativos;
            System.out.println("Promedio de números negativos: " + promedioNegativos);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }
    }
}
