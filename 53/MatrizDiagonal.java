//Matriz con 0 y una linea diagonal de 1.
import java.util.Arrays;

public class MatrizDiagonal {
    public static void main(String[] args) {
        int matriz[][]=new int [10][10];
        for(int i=0;i<matriz.length;i++) {
            matriz[i][i]=1;
        }
        for(int i=0;i<matriz.length;i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}
