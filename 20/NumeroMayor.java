    package num20;

    public class NumeroMayor {
        static int numeroMaximo(int t[]) {
            int max;
            max=t[0];
            for(int i=0;i<t.length;i++) {
                if(t[i]>max)max=t[i];
            }
            return max;
        }
    }
