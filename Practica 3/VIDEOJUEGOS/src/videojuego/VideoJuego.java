package videojuego;

public class VideoJuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarEstado() {
        String estado = activo ? "Estado Activo" : "Estado Inactivo";
        System.out.println(nombre + ": " + estado);
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " +nombre + " Genero: " + genero + " Version: " + version);
    }

    public void cerrar(){
        if(activo == true){
            activo = false;
            System.out.println(nombre+" Ha sido cerrado");
        }
    }

    void abrir(){
        if(activo == false){
            activo = true;
            System.out.println(nombre+" Se ha iniciado");
        }
    }
}
