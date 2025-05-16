//Da la cantidad de veces que se repiten los numeros de la lista.
import java.util.Arrays;

public class frecuencias {

    public static void main(String[] args) {
    int[] arr = {1, 0, 0, 4, 1, 3, 4, 0, 2, 1};
    Arrays.sort(arr);
    int Contador=0;
    int auxiliar=arr[0];

    for(int i=0;i<arr.length;i++) {
        if(auxiliar==arr[i]) {
            Contador++;
        }else{
            System.out.println("El numero " + arr[i] + " se repite " + Contador + " veces");
            Contador=1;
            auxiliar=arr[i];
        }
    }
    System.out.println("El numero " + auxiliar + " se repite " + Contador + " veces");
    }
}