//Genera numeros aleotrios y los ingresa a un array pero con el metodo "Random".
public class obt_num {
    public static void main(String[] args) {
        int a[]=new int[100];
        System.out.println("Numeros aleatorios entre 1 y 100: ");
            for(int i=0;i<10;i++) {
                a[i]=(int)(Math.random()*100);
                    System.out.println(a[i]);
            }
    }
}