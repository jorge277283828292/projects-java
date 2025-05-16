//Pide un numero par y devuelve los numeros de en medio de este.
import java.util.Scanner;

public class ing_numeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] digitos = new int[12];
        int num = 0;
        int tamano = 0;
        String cadena = "";
        do {
            System.out.println("Ingrese un numero par: ");
            num=sc.nextInt();
            cadena=String.valueOf(num);
            tamano=cadena.length();

        } while(tamano % 2!=0 && tamano <4 && tamano >12);
        for(int i=0; i<tamano;i++) {
            digitos[i]=Integer.parseInt(cadena.substring(i, i + 1));
        }

        for(int i=0;i<1;i++) {
            int valor=tamano/2-1;
            System.out.println(digitos[valor] + "," + digitos[valor + 1]);
        }
    }
}