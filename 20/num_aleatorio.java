//Contsa de que el programa genera numeros aleatorios y este los ingresa a un array.
public class num_aleatorio {
    public static void main(String[] args) {
        int max;
        int t[] = new int[100];

        System.out.println("Llenar el arreglo con numeros aleatorios, entre 1 y 100");

        System.out.println("Los numeros aleatorios añadidos son: ");
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 100 + 1);
            System.out.println(t[i]);
        }

        class numero_mayor {
            public static int numeroMaximo(int[] arr) {
                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }
                return max;
            }
        }
        max = numero_mayor.numeroMaximo(t);
        System.out.println("El número mayor es: " + max);
    }
}