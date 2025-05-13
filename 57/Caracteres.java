//Muestra el codigo ascii de todas las letras en inversa.
public class Caracteres {
    public static void main(String[] args) {
        for(char car='z';car>='a';car--) {
            System.out.println("El caracter " + (int)car + " es: " + car);
        }
    }
}
