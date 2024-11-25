import java.util.ArrayList;
import java.util.List;

public class GestorDeRegistros {
    private static GestorDeRegistros instancia;
    private List<String> registros;

    private GestorDeRegistros() {
        registros = new ArrayList<>();
        System.out.println("GestorDeRegistros inicializado.");
    }

    public static GestorDeRegistros obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestorDeRegistros();
        }
        return instancia;
    }

    public void registrar(String mensaje) {
        registros.add(mensaje);
        System.out.println("Registro agregado: " + mensaje);
    }

    public void mostrarRegistros() {
        System.out.println("Todos los registros:");
        for (String registro : registros) {
            System.out.println(registro);
        }
    }
}
