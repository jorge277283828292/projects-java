//En este caso estaremos trabajando con una biblioteca en la cual nos mostrar ventanas emergementes en la cual no dira cuanto sueldos deseamos ingresar,
//luego de ingresarlos nos dira cual de todos los sueldos es el mayor.
import javax.swing.JOptionPane;

public class SueldoMayor {
    public static void main(String[] args) {
        int cantidadSueldos = 0;
        int sueldo = 0;
        int sueldoMaximo = 0;
        boolean primerSueldo = true;

        cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a ingresar: "));
        for(int i=1; i<=cantidadSueldos;i++) {
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo " + i + ": "));  
            if(primerSueldo) {
                sueldoMaximo=sueldo;
                primerSueldo=false;
            }else if(sueldo>sueldoMaximo) {
                sueldoMaximo=sueldo;
        }   
    }
    
    JOptionPane.showMessageDialog(null, "El sueldo mayor es: " + sueldoMaximo);
}
}