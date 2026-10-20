package videojuego;

public class MainVideoJuego {
    static void main() {
        VideoJuego v1 = new VideoJuego();
        VideoJuego v2 = new VideoJuego();
        VideoJuego v3 = new VideoJuego();

        v1.nombre = "Mario Bros";
        v1.genero = "Aventura";
        v1.version = "10.5.32";
        v1.activo = false;
        v2.nombre = "Crash Bandicoot";
        v2.genero = "Aventura, Acción";
        v2.version = "3.23";
        v2.activo = true;
        v3.nombre = "Valorant";
        v3.genero = "Hero Shotter";
        v3.version = "55.4.4";
        v3.activo = false;

        v1.mostrarInformacion();
        v1.mostrarEstado();
        v2.mostrarInformacion();
        v2.mostrarEstado();
        v3.mostrarInformacion();
        v3.mostrarEstado();
    }
}
