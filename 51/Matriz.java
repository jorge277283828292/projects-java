//Recorre los numeros de una matriz 3x4 y los imprime.
public class Matriz {
    public static void main(String[] args) {
        int matriz[][]={{0,2,4,6},{8,10,12,14},{16,18,20,22}};
        int i=0;
        while(i<3){
          for(int j=0;j<4;j++) {  
            System.out.print("|" + matriz[i][j] + "| ");
          }  
          System.out.println("");
          i++;
        }
    }
}
