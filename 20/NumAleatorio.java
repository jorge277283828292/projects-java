//Contsa de que el programa genera numeros aleatorios y este los ingresa a un array.
package 20;

public class NumAleatorio {
    public static void main(String[] args) {
        int max;
        int t[]=new int[100];

        System.out.println("Llenar el arreglo con numeros aleatorios, entre 1 y 100");

        System.out.println("Los numeros aleatorios añadidos son: ");
    for(int i=0;i<t.length;i++) {
        t[i]=(int)(Math.random()*100+1);
            System.out.println(t[i]);
    }
    max=NumeroMayor.numeroMaximo(t);
        System.out.println();
    }
}