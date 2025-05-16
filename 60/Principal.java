//Devuelve la informacion de algunos empleados.
public class principal {
    public static void main(String[] args) {
        
        empleado[] arr = {
            new empleado("Pepe", 45, 2000),
            new empleado("Ana", 20, 1000),
            new empleado("Leticia", 39, 1800),
            new empleado("Maria", 18, 800),
            new empleado("Juan", 38, 1900),
            new empleado("Alma", 48, 1000)
        };

        for (empleado arr1 : arr) {
            System.out.println(arr1);
        }
    }
}