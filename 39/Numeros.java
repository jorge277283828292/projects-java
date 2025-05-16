//Pide al usuario que indique la cantidad de numeros que va a ingresar, luego los ingresa y por ulltimo devuelve:
//Suma, Media, Mayor y Menor. De los numeros ingresados.
import java.util.Scanner;

public class numeros {
    public int devuelveSuma(int arr[]) { //Suma
    int suma=0;
    for(int i=0;i<arr.length;i++) {
        suma=suma+arr[i];
    }
        return suma;
    }
    public double devuleveMedia(int sum, int arr[]) { //Media
        return sum/arr.length;
    }
    public int devuelveMayor(int arr[]) { //Mayor
    int maximo=arr[0];
    for(int i=0;i<arr.length;i++) {
        if(arr[i]>maximo)maximo=arr[i];
    }
        return maximo;
    }
    public int devuelveMenor(int arr[]) { //Menor
        int minimo=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<minimo)minimo=arr[i];
        }
            return minimo;
        }
    public static void main(String[] args) { //Datos
    Scanner s=new Scanner(System.in);
    System.out.println("Introduce la cantidad de numeros: ");
    int cantidadNumeros=s.nextInt();
    int arr[]=new int[cantidadNumeros];
        System.out.println("Introduce la cantidad de numeros del arreglo: ");
        for(int i=0;i<cantidadNumeros;i++) {
            arr[i]=s.nextInt();
        }
        numeros n1=new numeros();
        int sum=n1.devuelveSuma(arr);
        System.out.println("La suma es: " + sum);
        double media=n1.devuleveMedia(sum, arr);
        System.out.println("La media es: " + media);
        int mayor=n1.devuelveMayor(arr);
        System.out.println("El numero mayor es: " + mayor);
        int menor=n1.devuelveMenor(arr);
        System.out.println("Este es el numero menor: " + menor);

    }
}