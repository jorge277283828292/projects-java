//Pide al usuario la nota del alumno del 1 al 10, y luego dependiendo de la nota le da una beca en dolares.
import java.util.Scanner;

public class beca_alumno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double promedio=0;
        int cantidadBeca=0;
    do {
        System.out.println("Ingrese el promedio del alumno(De 1 a 10): ");
        promedio=sc.nextDouble();
            if(promedio<0 || promedio>10)System.out.println("Promedio fuera del rango.");
        }while(promedio<0 || promedio>10);
            if(promedio>=9 && promedio<=10)cantidadBeca=100;
            else if(promedio>=8)cantidadBeca=60;
            else if(promedio>=6)cantidadBeca=30;
            else System.out.println("Tu promedio no es aprobado");
                System.out.println("Tu promedio es: " + promedio + "\nRecibiras " + cantidadBeca + " dolares de beca.");
    }
}   