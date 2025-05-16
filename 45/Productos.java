//Da un descuento dependiendo de la cantidad de productos vendidos por el usuario.
import javax.swing.JOptionPane;

public class productos {
    public static void main(String[] args) {
        String nombreProyecto=JOptionPane.showInputDialog("Ingrese el numero del proyecto: ");
        double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos: "));
        double totalPago=cantidad*precio;
        if(cantidad>=20) {
            double descuento=totalPago*0.15;
            totalPago=totalPago-descuento;
            JOptionPane.showMessageDialog(null, "Has adquirido un 15% de descuento");
        }
        JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalPago);
    }
}
