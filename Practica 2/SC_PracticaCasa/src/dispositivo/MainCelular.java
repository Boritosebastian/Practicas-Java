package dispositivo;

public class MainCelular {
    static void main(){
        Dispositivo c1 = new Dispositivo();
        Dispositivo c2 = new Dispositivo();
        Dispositivo c3 = new Dispositivo();

        c1.nombre = "Iphone";
        c1.tipo = "Telefono";
        c1.activo = true;

        c2.nombre = "Dell";
        c2.tipo = "Laptop";
        c2.activo = false;

        c3.nombre = "Android";
        c3.tipo = "Tablet";
        c3.activo = true;

        c1.mostrarInformacion();
        c1.mostrarEstado();
        c2.mostrarInformacion();
        c2.mostrarEstado();
        c3.mostrarInformacion();
        c3.mostrarEstado();

        c2.habilitar();

        c2.mostrarEstado();
    }
}

