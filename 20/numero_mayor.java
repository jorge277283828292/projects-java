public class numero_mayor {
    static int numeroMaximo(int t[]) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) max = t[i];
        }
        return max;
    }
}