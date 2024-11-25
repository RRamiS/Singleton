import java.util.Random;

public class Tarea {
    private String nombre;

    public Tarea(String nombre) {
        this.nombre = nombre;
    }

    public void ejecutar() {
        GestorDeRegistros gestor = GestorDeRegistros.obtenerInstancia();
        gestor.registrar("La tarea \"" + nombre + "\" ha comenzado.");

        if (nombre.equals("Procesamiento de datos")) {
            procesarDatos();
        } else if (nombre.equals("Generación de reportes")) {
            generarReporte();
        }

        gestor.registrar("La tarea \"" + nombre + "\" ha finalizado.");
    }

    private void procesarDatos() {
        GestorDeRegistros gestor = GestorDeRegistros.obtenerInstancia();
        Random random = new Random();
        int totalDatosProcesados = random.nextInt(100) + 1; // Generar un número aleatorio de datos
        gestor.registrar("Datos procesados: " + totalDatosProcesados + " registros.");
    }

    private void generarReporte() {
        GestorDeRegistros gestor = GestorDeRegistros.obtenerInstancia();
        Random random = new Random();
        String[] categorias = {"Ventas", "Clientes", "Productos", "Finanzas"};
        String categoria = categorias[random.nextInt(categorias.length)];
        int totalItems = random.nextInt(50) + 10; // Generar un número aleatorio de ítems
        gestor.registrar("Reporte generado: Categoría \"" + categoria + "\", total ítems: " + totalItems + ".");
    }
}
