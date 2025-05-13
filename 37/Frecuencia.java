//Da la cantidad de caracteres de String.
public class Frecuencia {
    public static int contarCaracteres(String cadenaTexto, char Caracter) {
        int posicion=0;
        int contador=0;
        posicion=cadenaTexto.indexOf(Caracter);
        while(posicion!=-1) {
            contador++;
            posicion=cadenaTexto.indexOf(Caracter,posicion+1);
        }
        return contador;
    }
    
    public static void main(String args[]) {
        int cont=contarCaracteres("Lo siento, tu codigo no compila!", 'o');
        System.out.println("El caracter se repite " + cont + "veces");
    }
}
