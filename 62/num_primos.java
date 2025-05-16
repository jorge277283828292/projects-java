//Da los numeros primos y cantidad de una lista.
public class num_primos {
    public static void main(String[] args) {
        int arr[] = {4, 11, 7, 8, 4, 6, 2, 1, 13, 83, 14, 20};
        int contador = 0;

        for (int num : arr) {
            if (esPrimo(num)) {
                System.out.println("Número primo: " + num);
                contador++;
            }
        }
        System.out.println("Cantidad de números primos: " + contador);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}