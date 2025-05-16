//Este programa es similar al anterior nada mas que este dara el promedio de los numeros ingresado,
//dado el caso de que el usuario ingreso 0 para romper el bucle.
import java.util.Scanner;

public class captura_numeros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num=0, suma=0, cantidadNumeros=0;
            double promedio=0;
                System.out.println("Introduce un numero positivo y entero(0 para finalizar): ");
                num=scanner.nextInt();
                while(num>0){
                    suma+=num;
                    cantidadNumeros++;
                    System.out.println("Introduce un numero positivo y entero: ");
                    num= scanner.nextInt();
                } if (cantidadNumeros == 0) {
                    System.out.println("No se puede calcular el promedio, ya que no se han introducido números.");
                } else {
                    promedio=(double)suma/cantidadNumeros;
                    System.out.printf("El promedio de los numeros es: %.2f%n", promedio);
                }
        }
    }
}
