//Crea una matriz 3x5.
public class CharMatriz {
    public static void main(String[] args) {
        final int FILAS=3;
        final int COLUMNAS=5;
        char[][] letras=new char [FILAS][COLUMNAS];
        char letraSiguiente = 'A';

        for(int f=0;f<FILAS;f++) {
            for(int c=0;c<COLUMNAS;c++) {
                letras[f][c]=letraSiguiente;
                letraSiguiente++;
            }       
        }
        for(int f=0;f<FILAS;f++) {
            for(int c=0;c<COLUMNAS;c++) {
                System.out.print(letras[f][c]+" ");
            }
            System.out.println();
        }
    }
}
