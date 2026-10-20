package modulo;

public class modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Nombre:"+nombre+" Lenguaje:"+lenguaje+" Version:"+version);
    }

    public void marcarTerminado() {
        if(activo == true){
            activo = false;
            System.out.println(nombre+" Proceso Terminado ");
        }
    }

    void mostrarEstado(){
        String estado = activo ?"En Proceso":"Terminado";
        System.out.println(nombre+": "+estado);
    }

    void mostrarVersion(){
        System.out.println(nombre+": "+version);
    }
}
