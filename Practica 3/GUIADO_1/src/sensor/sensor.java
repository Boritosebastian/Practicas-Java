package sensor;

public class sensor {
    private String nombre;
    private String tipo;
    private double lectura;

    void mostrarLectura(){
        System.out.println(nombre+" "+tipo+" "+lectura);
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setLectura(double lectura){
        this.lectura = lectura;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public double getLectura(){
        return lectura;
    }
}
