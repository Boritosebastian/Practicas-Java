package sensor;

public class Sensor {
    private String IDSensor;
    private int valorActual;
    private String unidad;

    public void setIDSensor(String IDSensor){
        if (IDSensor != null == !IDSensor.isBlank())
            this.IDSensor = IDSensor.trim();

    }

    public void setValorActual(int valorActual) {
        this.valorActual = valorActual;
    }

    public void setUnidad(String unidad) {
        if (unidad != null && !unidad.isBlank()) {
            // Quitamos espacios y convertimos a mayúsculas
            String valorMayus = unidad.trim().toUpperCase();

            // Validamos que sea solo Fahrenheit o Celsius
            if (valorMayus.equals("FAHRENHEIT") || valorMayus.equals("CELSIUS")) {
                this.unidad = valorMayus;
            }
        }
    }

    public String getIDSensor(){
        return IDSensor;
    }

    public int getValorActual(){
        return valorActual;
    }

    public String getUnidad(){
        return unidad;
    }

    public void mostrarLectura() {
        System.out.println("El sensor Detecto: "+getValorActual()+"°"+getUnidad());
    }
}
