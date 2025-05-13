//Crea una matriz 4x5.
public class MatrizMarco {
    public static void main(String[] args) {
        int i,j;
        int matriz[][];
        
        matriz=new int [4][5];

        for(i=0;i<4;i++) {
            for(j=0;j<5;j++) {
            if(i==0 || i==3) {
                matriz[i][j]=1;
            }
            if(j==0 || j==4) {
                matriz[i][j]=1;
            }
        }
    }
    System.out.println("=====Matriz de 4 x 5=====");
    for(i=0;i<4;i++) {
        System.out.println();
    for(j=0;j<5;j++) {
        System.out.print(matriz[i][j] + " ");
    }
    }
    System.out.println();
    }
}
