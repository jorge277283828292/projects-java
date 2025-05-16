//Imprime una matriz pero aumentando 5+ el valor en cada numero.
public class almacenar {
    public static void main(String[] args) {
        int matriz[] []=new int [3] [3];
        int serie=0;

    for(int i=0;i<3;i++) {
        for(int j=0;j<3;j++) {
            serie=serie+5;
            matriz[i] [j]=serie;
        }
    }
    System.out.println("Imprimir numero de matriz: ");
        for(int i=0;i<3;i++) {
            System.out.println("\n");
            for(int j=0;j<3;j++) {
                System.out.print(matriz[i] [j] + "\t");
            }
        }
    }
}
