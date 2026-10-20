package modulo;

public class mainModulo {
    static void main() {
        modulo login = new modulo();
        modulo inventario = new modulo();
        modulo reportes = new modulo();

        login.nombre = "Login";
        login.lenguaje = "Java";
        login.version = "v1.0.0";
        login.activo = true;

        inventario.nombre = "Inventario";
        inventario.lenguaje = "Java";
        inventario.version = "v1.1.0";
        inventario.activo = false;

        reportes.nombre = "Reportes";
        reportes.lenguaje = "C";
        reportes.version = "v2.0.3";
        reportes.activo = true;

        login.mostrarInformacion();
        login.mostrarEstado();
        inventario.mostrarInformacion();
        inventario.mostrarEstado();
        reportes.mostrarInformacion();
        reportes.mostrarEstado();

        reportes.marcarTerminado();

        reportes.mostrarEstado();
        inventario.mostrarVersion();



    }
}
