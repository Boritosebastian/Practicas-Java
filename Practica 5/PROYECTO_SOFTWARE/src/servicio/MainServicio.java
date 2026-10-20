package servicio;

public class MainServicio {
    static void main() {
        Servicio S1 = new Servicio();

        S1.setNombre("ServidorWeb");
        S1.setPuerto(8080);
        S1.setActivo(false);
        S1.setCantidadPeticiones(0);

        //validaciones
        S1.setNombre("");
        S1.setPuerto(-5);
        S1.setCantidadPeticiones(-3);

        S1.mostrarInformacion();
        S1.registrarPeticion();
        S1.iniciar();
        S1.registrarPeticion();
        S1.registrarPeticion();
        S1.registrarPeticion();
        S1.mostrarInformacion();
        S1.detener();
        S1.mostrarInformacion();

    }
}
