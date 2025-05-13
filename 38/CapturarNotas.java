//Solicita al usuario las notas de 5 alumnos en los tres trimestres y da su promedio,
//y luego le dice al usuario que eija uno para ver su promedio.
import java.util.Scanner;

public class CapturarNotas {
    public static void main(String[] args) {
        int trimestre1[], trimestre2[], trimestre3[];
        int num, i;
        int suma_trimestre1, suma_trimestre2, suma_trimestre3;
        double media_alumno;
        Scanner s=new Scanner(System.in);

        trimestre1=new int [5];
        trimestre2=new int [5];
        trimestre3=new int [5];

        System.out.println("Notas del primer trimestre: ");
        for(i=0;i<5;i++) {
            System.out.println("Alumno " + (i+1) + " :");
            trimestre1[i]=s.nextInt();
        }

        System.out.println("Notas del segundo trimestre: ");
        for(i=0;i<5;i++) {
            System.out.println("Alumno " + (i+1) + " :");
            trimestre2[i]=s.nextInt();
        }

        System.out.println("Notas del tercer trimestre: ");
        for(i=0;i<5;i++) {
            System.out.println("Alumno " + (i+1) + " :");
            trimestre3[i]=s.nextInt();
        }

        suma_trimestre1=0;
        suma_trimestre2=0;
        suma_trimestre3=0;
        for(i=0;i<5;i++) {
            suma_trimestre1+=trimestre1[i];
            suma_trimestre2+=trimestre2[i];
            suma_trimestre3+=trimestre3[i];
        }
        System.out.println("Media primer trimestre: " + suma_trimestre1/5.0);
        System.out.println("Media segundo trimestre: " + suma_trimestre2/5.0);
        System.out.println("Media tercer trimestre: " + suma_trimestre3/5.0);
        System.out.println();

        System.out.println("Indroduzca posicion del alumno (de 0 a 4): ");
        num=s.nextInt();
        media_alumno=(double)(trimestre1[num]+trimestre2[num]+trimestre3[num])/3;
        System.out.println("La media del alumno es: " + media_alumno);
    }
}
