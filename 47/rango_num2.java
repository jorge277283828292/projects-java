//Solicita al usuario que ingrese un numero entre 1 al 10, y si no se cumple no se finaliza el programa.
import javax.swing.JOptionPane;

public class rango_num2 {
    public static void main(String[] args) {
        int numero;
        boolean estaEnRango;
        do {
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero del 1 al 10: "));
            estaEnRango=(numero>=1 && numero <=10);
            if(!estaEnRango){
                System.out.println("Numero fuera de rango de 1 a 10");
                System.out.println("Introduce el numero otra vez");
            }   
        }while(estaEnRango==false);
            System.out.println("Pusiste el numero " + numero);
            System.out.println("Programa finalizado");
    }
}
