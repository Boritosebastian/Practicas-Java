package tarea;

public class mainTarea {
    static void main() {
        tarea T1 = new tarea();

        T1.titulo = "Definir estructuras";
        T1.responsable = "Arquitecto de Software";
        T1.horasEstimadas = 10;
        T1.completada = true;

        T1.mostrarInformacion();
        T1.mostrarEstado();
        T1.completada = false;
        T1.mostrarEstado();
        T1.mostrarResponsable();

    }
}
