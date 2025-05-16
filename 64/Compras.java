public class compras {
    public void comprasTienda(double total, double importeEntregado) {
        System.out.println("El total de la compra es: " + total);
        System.out.println("Tu importe entregado es: " + importeEntregado);
        if (importeEntregado == total) {
            System.out.println("Compra realizada con exitoso!");
        } else if (importeEntregado < total) {
            System.out.println("Importe incompleto. Favor de efectuar el pago completo");
        } else {
            System.out.println("Compra exitosa. Su cambio es: " + (importeEntregado - total));
        }
    }
}