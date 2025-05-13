//Este programa nos dira si el alumno aprobo o no su calificacion, y esto lo mostrara en una ventana emergente.
import javax.swing.JOptionPane;

public class EstReprobados {
    public static void main(String[] args) {
        int calificacion = 0;
        String numControl;
        boolean reprobado = false;

        for(int i = 0; i < 5; i++) {
            numControl = JOptionPane.showInputDialog("Alumno " + (i+1) + "\nIntroduce el número de control:");
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificación:"));
            if(calificacion < 6)reprobado=true;
            if(reprobado==true) {
                JOptionPane.showMessageDialog(null, "El alumno " + numControl + " ha reprobado.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno " + numControl + "No ha aprobado");
            }
        }
    }
}
