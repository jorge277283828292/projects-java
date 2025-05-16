//Solo se permite ingresar letras.
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        String cadena = "";
        int valorASCII = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese una palabra: ");
            cadena = sc.next();
            contador = 0; // Reset counter for each word.

            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                valorASCII = (int) caracter;
                if (valorASCII < 97 || valorASCII > 122) {
                    contador++;
                }
            }

            if (contador == 0) {
                break; 
            } else {
                System.out.println("La palabra contiene caracteres no permitidos. Intente de nuevo.");
            }
        }
        System.out.println("Palabra ingresada correctamente: " + cadena);
        sc.close(); 
    }
}
