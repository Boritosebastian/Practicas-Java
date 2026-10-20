package proyecto;

public class MainProyecto {
    static void main() {
        atributos A1 = new atributos();

        A1.setNombre("IA");
        A1.setProgreso(50);
        A1.setResponsable("Juan");
        A1.setTerminado(false);

        A1.mostrarInformacion();
        A1.mostrarEstado();
        A1.avanzar();
        A1.avanzar();
        A1.avanzar();
        A1.mostrarInformacion();

    }
}
