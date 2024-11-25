import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeRegistros gestor = GestorDeRegistros.obtenerInstancia();
        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Ejecutar tarea: Procesamiento de datos");
            System.out.println("2. Ejecutar tarea: Generación de reportes");
            System.out.println("3. Ejecutar tarea: Respaldo");
            System.out.println("4. Mostrar todos los registros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Tarea tarea1 = new Tarea("Procesamiento de datos");
                    tarea1.ejecutar();
                    break;
                case 2:
                    Tarea tarea2 = new Tarea("Generación de reportes");
                    tarea2.ejecutar();
                    break;
                case 3:
                    Tarea tarea3 = new Tarea("Respaldo");
                    tarea3.ejecutar();
                    break;
                case 4:
                    gestor.mostrarRegistros();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}