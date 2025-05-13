//Pide un numero secreto y tienes 3 intentos de adivinar.
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cont = 0;
        String numsecreto = "", num = "";
        numsecreto = JOptionPane.showInputDialog("Introduce el número secreto"); 
        do {
            num = JOptionPane.showInputDialog("Adivina el número secreto. Intento " + (cont + 1));
            cont++;
        } while (!num.equalsIgnoreCase(numsecreto) && cont < 3);
        if (cont == 3) {
            JOptionPane.showMessageDialog(null, "Error. El número secreto era: " + numsecreto);
        } else {
           JOptionPane.showMessageDialog(null, "Acertaste");
        }
    }
}
