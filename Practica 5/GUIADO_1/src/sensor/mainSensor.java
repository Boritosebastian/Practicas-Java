package sensor;

public class mainSensor {
    static void main() {
        sensor sensor1 = new sensor();
        sensor sensor2 = new sensor();

        sensor1.nombre = "Entrada";
        sensor1.tipo = "Proximidad";
        sensor1.lectura = 32;

        sensor2.nombre = "Salida";
        sensor2.tipo = "Temperatura";
        sensor2.lectura = 18;

        sensor1.mostrarLectura();
        sensor2.mostrarLectura();
    }
}
