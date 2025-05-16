//Este programa es sencillo solicita al usuario en este caso 10 numeros para un array,
//y cuando se cumpla el ciclo el dira cual es el numero mayor entre todos.
import java.util.Scanner;

public class array_mayor {
    public static void main(String[] args) {
        int array[]=new int[10];
        int mayor=array[0];
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=====================");
                System.out.println("Ingrese 10 numeros: ");
                    System.out.println("=====================");
                    for(int i=0;i<array.length;i++){
                        array[i]=scanner.nextInt();
                        System.out.println("=======");
                        if(array[i]>mayor){
                            mayor=array[i];
                        }   
                    }
        }
        System.out.println("El mayor es: " + mayor);
                System.out.println("=======");
                }

}
