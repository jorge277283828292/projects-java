//Muestra los caracteres de un String aleatoriamente.
public class palabra_aleatoria {
    public static void main(String[] args) {
        String [] a = {"J", "O", "R", "G", "E"};
        int letra = a.length;
        System.out.println("La palabra tiene " + letra + " caracteres.");
        for (int i = 0; i < letra; i++) {
            int numRandom = (int) (Math.random() * letra);
            System.out.println(a[numRandom]);
        }
    }
}