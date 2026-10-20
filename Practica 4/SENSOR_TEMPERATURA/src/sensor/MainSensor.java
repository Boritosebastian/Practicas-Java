package sensor;

public class MainSensor {
    static void main() {
        Sensor S1 = new Sensor();
        Sensor S2 = new Sensor();

        S1.setIDSensor("M43Rg5");
        S1.setValorActual(34);
        S1.setUnidad("Fahrenheit");

        S2.setIDSensor("R32T66");
        S2.setValorActual(-5);
        S2.setUnidad("Celsius");

        S1.mostrarLectura();
        S2.mostrarLectura();

    }

}
