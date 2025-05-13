//Consiste en que el programa solicita al usuario la cantidad de piezas que desea, 
//luego el precio y por ultimo este calculara el precio dando un descuento.
import java.util.Scanner;

public class TotalAPagar {
    public static void main(String[] args) {
        int piezasNum=0;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Cantidad de piezas: ");
            piezasNum=s.nextInt();
            System.out.println("Precio por pieza: ");
            double Precio=s.nextDouble();
            double pagoTotal=calcularPago(piezasNum,Precio);
            System.out.println("El pago total es: " + pagoTotal);
        }
    }   
    public static double calcularPago(int piezas, double pre) {
        double pagoTotal=0;
        if(piezas>=100) {
            pagoTotal=(pre*piezas) - (pre*0.20*piezas);
        }else{
            pagoTotal=pre*piezas;
        }
        return pagoTotal;
    }
}
