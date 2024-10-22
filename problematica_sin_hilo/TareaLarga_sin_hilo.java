package problematica_sin_hilo;

class TareaLarga_sin_hilo {
    private String nombreTarea;

    public TareaLarga_sin_hilo(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public void ejecutar() {
        // Medir el tiempo de inicio
        long inicio = System.nanoTime();
        System.out.println("Inicio de " + nombreTarea);

        for (int i = 1; i <= 5; i++) {
            System.out.println(nombreTarea + " - Paso " + i);
            try {
                // Simular un proceso largo
                Thread.sleep(1000); // Pausa de 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Medir el tiempo de finalización
        long fin = System.nanoTime();
        long tiempoEjecucionNano = fin - inicio;

        // Convertir nanosegundos a segundos
        long tiempoEjecucionSegundos = tiempoEjecucionNano / 1_000_000_000;
        long horas = tiempoEjecucionSegundos / 3600;
        long minutos = (tiempoEjecucionSegundos % 3600) / 60;
        long segundos = tiempoEjecucionSegundos % 60;

        // Calcular uso de memoria
        Runtime runtime = Runtime.getRuntime();
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Finalización de " + nombreTarea);
        System.out.printf("Tiempo de ejecución de %s: %02d:%02d:%02d\n", nombreTarea, horas, minutos, segundos);
        System.out.println("Uso de memoria durante " + nombreTarea + ": " + memoriaAntes + " bytes");
    }
}
