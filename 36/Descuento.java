//Solicita la edad de 5 estudiantes y les consulta si tienen hermanos y si, y si cumplen cierto criterio se les aplicara un descuento.
import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        double costoInscripcion=1250;
        int edadAlumnos[] = new int[5];
        String tieneHermanos[]=new String[5];
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce los datos de cada usuario: ");
        for(int i=0;i<5;i++) {
            System.out.println("Edad del Alumno: " + (i+1) + ":");
            edadAlumnos[i]=s.nextInt();
            System.out.println("¿Tiene hermanos?");
            tieneHermanos[i]=s.next();
        }

        for(int i=0;i<5;i++) {
            if(edadAlumnos[i]>=8 && edadAlumnos[i]<=13) {
                if(tieneHermanos[i].equals("si")) {
                    System.out.println("El alumno: " + (i+1) + "tiene 50% de descuento");
                    System.out.println("Y pagara: " + costoInscripcion*0.5);
                        System.out.println();
                }else{
                    System.out.println("El alumno " + (i+1) + "pagara " + costoInscripcion);
                }
            }
        }
    }
}