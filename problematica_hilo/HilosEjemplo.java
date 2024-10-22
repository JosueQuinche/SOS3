package problematica_hilo;

public class HilosEjemplo {
    public static void main(String[] args) {
        // Crear dos hilos, uno para cada tarea
        Thread hilo1 = new Thread(new Tarealarga_hilo("Tarea 1"));
        Thread hilo2 = new Thread(new Tarealarga_hilo("Tarea 2"));

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();

        try {
            // Esperar a que ambos hilos terminen
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todas las tareas han finalizado.");
    }
}
