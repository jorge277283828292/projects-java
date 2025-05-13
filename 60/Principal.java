//Devuelve la informacion de algunos empleados.
public class Principal {
    public static void main(String[] args) {
        
        Empleado[] arr = {
            new Empleado("Pepe", 45, 2000),
            new Empleado("Ana", 20, 1000),
            new Empleado("Leticia", 39, 1800),
            new Empleado("Maria", 18, 800),
            new Empleado("Juan", 38, 1900),
            new Empleado("Alma", 48, 1000)
        };

        for (Empleado arr1 : arr) {
            System.out.println(arr1);
        }
    }
}