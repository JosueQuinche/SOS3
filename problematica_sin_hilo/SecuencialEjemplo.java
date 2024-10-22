package problematica_sin_hilo;

public class SecuencialEjemplo {
    public static void main(String[] args) {
        // Crear dos tareas
        TareaLarga_sin_hilo tarea1 = new TareaLarga_sin_hilo("Tarea 1");
        TareaLarga_sin_hilo tarea2 = new TareaLarga_sin_hilo("Tarea 2");

        // Ejecutar las tareas de forma secuencial
        tarea1.ejecutar();
        tarea2.ejecutar();

        System.out.println("Todas las tareas han finalizado.");
    }
}
