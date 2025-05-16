//Llenar una matriz con una serie numerica de 4 en 4.
public class serie_matriz {
    public static void main(String[] args) {
        int matriz[][]=new int[3][4];
        int serie=0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
            matriz[i][j]=serie;

            System.out.print("|" + matriz[i][j] + "|");
                serie+=4;
            }
            System.out.println("");
        }
    }
}
