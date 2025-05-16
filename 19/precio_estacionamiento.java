//Este programa consta de que el usuario ingresa la cantidad de horas y el programa devuleve la cantidad que debe pagar por el estacionamiento.
import java.util.Scanner;

public class precio_estacionamiento {
    public static void main(String[] args) {
        int Horas=0;
        double precioTotal=0; 
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Cantidad de horas: ");
            Horas=s.nextInt();
        }

        precioTotal=calcularProcio(Horas);
        System.out.println("Total a pagar: " + precioTotal);
    }

    public static double calcularProcio(int horas) {
        double precio, precioResto;
        int restoHoras, dias;
        
        if(horas<=24) {
            if(horas<=3) {
                precio=horas*15;
            }else{
                precio=(3*20)+((horas-3)*15);
                if(precio>=250) {
                    precio=250;
                }
            }
            return precio;
        } else {
            dias=horas/24;
            restoHoras=horas%24;
            precioResto=restoHoras*15;
            if(precioResto>=250) {
                precioResto=250;
            }
            precio=dias*250+precioResto;
        return precio;
        }
    }
}