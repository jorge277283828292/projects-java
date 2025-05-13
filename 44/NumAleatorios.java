//Genera una lista de 100 numeros en un rango de 1 a 100.
public class NumAleatorios {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            int aleatorio=(int) (Math.random()*100+1);
                System.out.println(aleatorio);
        }
    }
}
