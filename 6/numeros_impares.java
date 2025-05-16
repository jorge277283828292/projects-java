//Este programa indica todos los posible numeros impares en el rango indicado.
public class numeros_impares {
    public static void main(String[] args) {
        long productoImpar = 1;
        for(int i=1; i<20; i+=2) {
            productoImpar = productoImpar * i;
        }
        
        System.out.println("El producto de los 20 primeros números impares es: " + productoImpar);
    }
}   