//Pide un numero de 8 digitos y devuelve las primeras 4 posiciones.
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]digitos=new int[8];
        int num=0;
        int tamano=0;
        String cadena="";
        do {
            System.out.println("Ingresa un numero de 8 digitos: ");
            num=sc.nextInt();
            cadena=String.valueOf(num);
            tamano=cadena.length();

        }while(tamano!=8);
        for(int i=0;i<tamano;i++) {
            digitos[i]=Integer.parseInt(cadena.substring(i,i+1));   
        }
        for(int i=0;i<tamano-4;i++) {
            System.out.println("Posicion " + i + ": " + digitos[i+2]);
        }
    }    
}
