//Elimina los numeros repetidos del la lista.
public class repetidos {
    public static void main(String[] args) {
        char[] a={'1','2','3','4','5','6','7','1','1','1'};

            for(int i=0;i<a.length;i++) {
                for(int j=0;j<a.length-1;j++) {
                    if(i!=j) {
                        if(a[i]==a[j]) {
                            a[j]=' ';
                        }
                    }
                }
            }
        for(int i=0;i<a.length;i++) {
            System.out.println("[" + a[i] + "]");
        }
    }
}
