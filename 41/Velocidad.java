//Solicita la cantidad de velocidad a la que va(Km/h), luego le convierte a metros por segundo(m/s).
import javax.swing.JOptionPane;

public class velocidad {
    public static void main(String[] args) {
        double velocidad=Double.parseDouble(JOptionPane.showInputDialog("Introduce la velocidad: "));
        double conversion=velocidad*1000/3600;
        JOptionPane.showMessageDialog(null,velocidad + "km/h es igual a " + conversion +"m/s");
    }
}
