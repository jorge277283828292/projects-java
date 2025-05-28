import java.util.ArrayList;
import java.util.Scanner;


public class GestorTareas {
    public static void main(String[] args) {
    ArrayList<String> tareas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    do {
        System.out.println("\nGestor de Tareas");
        System.out.println("1. Añadir tarea");
        System.out.println("2. Ver tareas");
        System.out.println("3. Eliminar tarea");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
        opcion = scanner.nextInt();
    switch (opcion) {
        case 1:
            System.out.println("Introduce la tarea que deseas ingresar: ");
            String tarea = scanner.next();
            tareas.add(tarea);
            System.out.println("Tarea añadida: " + tarea);
            scanner.nextLine(); // Limpiar el buffer
            break;
        case 2:
            if (tareas.isEmpty()) {
                System.out.println("No hay tareas pendientes.");
            }else {
                System.out.println("Lista de tareas:");
                for (int i = 0; i < tareas.size(); i++) {
                    System.out.println((i + 1) + ". " + tareas.get(i));
                }
            }
            break;
        case 3:
            if (tareas.isEmpty()) {
                System.out.println("No hay tareas pendientes.");
            }else {
                System.out.print("Introduce el número de la tarea a eliminar: ");
                int numeroTarea = scanner.nextInt();
                if (numeroTarea > 0 && numeroTarea <= tareas.size()) {
                    tareas.remove(numeroTarea - 1);
                    System.out.println("Tarea eliminada.");
                } else {
                    System.out.println("Número de tarea inválido.");
                }
            }
            break;
        case 4:
            System.out.println("¡Hasta luego!");
            break;
        default:
            System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            break;
    }
    } while (opcion != 4);
    
    }
}
