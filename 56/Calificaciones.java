//Solicita 10 calificaciones y luego te da su: Promedio, Aprobados, 
//Reprobados, y el porcentaje de reprobados.
import java.util.Scanner;

public class Calificaciones {

    public static void ingresaCalificaciones(int[] calif) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < calif.length; i++) {
                System.out.print("Calificación " + (i + 1) + ": ");
                calif[i] = sc.nextInt();
            }
        }
    }

    public static void AproReb(int[] calif) {
        int cantAprobados = 0;
        for (int i = 0; i < calif.length; i++) {
            if (calif[i] >= 6) {
                cantAprobados++;
            }
        }
        System.out.println("La cantidad de aprobados es: " + cantAprobados);
        System.out.println("La cantidad de reprobados es: " + (calif.length - cantAprobados));
    }

    public static void porcentajeReprobados(int[] calif) {
        int cantReprobados = 0;
        for (int i = 0; i < calif.length; i++) {
            if (calif[i] < 6) {
                cantReprobados++;
            }
        }
        double porcentaje = (double) cantReprobados / calif.length * 100;
        System.out.println("El porcentaje de reprobados es: " + porcentaje + "%");
    }

    public static void calcularPromedio(int[] calif) {
        double suma = 0;
        for (int i = 0; i < calif.length; i++) {
            suma += calif[i];
        }
        double prom = suma / calif.length;
        System.out.println("El promedio es igual: " + prom);
    }

    public static void main(String[] args) {
        int[] calif = new int[10];
        Calificaciones.ingresaCalificaciones(calif);
        Calificaciones.calcularPromedio(calif);
        Calificaciones.AproReb(calif);
        Calificaciones.porcentajeReprobados(calif);
    }
}