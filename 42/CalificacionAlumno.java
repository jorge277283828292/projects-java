//Da la nota final de un alumno basandose en su, primer examen, segundo examen, tareas y practicas.
import javax.swing.JOptionPane;

public class CalificacionAlumno {
    public static void main(String[] args) {
        double examen1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del examen 1: "));
        double examen2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del examen 2: "));
        double tareas=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del tareas: "));
        double practicas=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del practicas: "));

        double total_examen1=examen1*0.3;
        double total_examen2=examen2*0.4;
        double total_tareas=tareas*0.1;
        double total_practicas=practicas*0.2;

        double calificacionFinal=total_examen1+total_examen2+total_tareas+total_practicas;
        JOptionPane.showMessageDialog(null, "Esta es la calificacion final: " + calificacionFinal);
    }
}
