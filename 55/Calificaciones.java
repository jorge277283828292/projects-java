//Da el promedio de un estudiante deacuerdo a su notas en los ultimos 10 examenes.
import java.util.Scanner;

public class Calificaciones {

    public static void ingresaCalificaciones(int[] calificacion) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < calificacion.length; i++) {
                System.out.print("Calificación " + (i + 1) + ": ");
                calificacion[i] = sc.nextInt();
            }
        }
    }

    public static void calcularPromedio(int[] calificacion) {
        int suma = 0;
        for (int i = 0; i < calificacion.length; i++) {
            suma += calificacion[i];
        }
        System.out.println("El promedio es igual: " + (suma / calificacion.length));
    }

    public static void main(String[] args) {
        int[] calificacion = new int[10]; 
        Calificaciones.ingresaCalificaciones(calificacion); 
        Calificaciones.calcularPromedio(calificacion);
    }
}