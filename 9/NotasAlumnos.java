//Este programa es sencillo, solo consta de que se solicitaran las notas de 10 alumnos, 
//y este le dira que si cumplen con la condicional estaran aprobados o reprobados. Ademas,
//dira si algun estudiante tuvo nota de excelencia y el total de ellos.
import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int aprobados=0;
            int reprobados=0;
            int excelentes=0;
            float calificacion=0.0f;
            int i = 1;

            while (i<=10) {
                System.out.println("Ingrese la nota del alumno " + i + ": ");
                calificacion=scanner.nextFloat();
                if(calificacion==90 || calificacion==100){
                    excelentes++;
                } else if (calificacion>=60 && calificacion<90) {
                    aprobados++;
                } else if (calificacion<60) {
                    reprobados++;
                } else {
                    System.out.println("Nota no válida. Debe estar entre 0 y 100.");
                    continue; 
                }
                i++;
                
            }
            System.out.println("Total de alumnos aprobados: " + aprobados);
            System.out.println("Total de alumnos reprobados: " + reprobados);
            System.out.println("Total de alumnos excelentes: " + excelentes);
            System.out.println("Total de alumnos: " + (aprobados + reprobados + excelentes));
        }
    }
}
