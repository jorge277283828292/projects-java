//Calcula el suelldo del usuario dependiendo de las horas trabajadas.
import javax.swing.JOptionPane;

public class sueldo_empleado {
    public static void main(String[] args) {
        final double precioHora=40;
        double horas=0;
        double sueldoTotal=0;

        horas=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas trabajadas esta semana: "));
        if(horas<=40) {
            sueldoTotal=horas*precioHora;
            System.out.println("El empleado trabajo " + horas + "horas.");
                System.out.println("No trabajo horas extras");
        }else if(horas<=56) {
            sueldoTotal=4*precioHora+(horas-48)*2*precioHora;
            System.out.println("El empleado trabajo " + horas + "horas.");
                System.out.println("Trabajo " + (horas-48) + "horas extras.");
        }else{
            sueldoTotal=48*precioHora+8*2*precioHora+(horas-56)*3*precioHora;
        }
            System.out.println("El sueldo total es: " + sueldoTotal);
    }
}
