//Se genera un array con numeros aleatorios y te dice cual es el menor de esos.
public class menor {
    public static void main(String[] args) {
        int m;
        int t[] = new int[6];

        System.out.println("Llenar el arreglo con numeros enteros, entre 1 y 100");

        System.out.println("Los numeros aleatorios añadidos son: ");
        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random() * 100);
            System.out.println(t[i]);
        }

        m = NumMenor.numMenor(t);
        System.out.println("El numero menor es: " + m);
    }
}

class NumMenor {
    static int numMenor(int t[]) {
        int menor;
        menor = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < menor)
                menor = t[i];
        }
        return menor;
    }
}
