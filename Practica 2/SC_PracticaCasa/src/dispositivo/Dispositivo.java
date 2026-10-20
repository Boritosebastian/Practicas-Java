package dispositivo;

public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

    void mostrarInformacion(){
    System.out.println("Nombre: "+nombre+" Tipo: "+tipo);
    }

    void mostrarEstado(){
        String estado = activo?"Estado Activo":"Estado Inactivo";
        System.out.println(nombre+": "+estado);
    }

    void habilitar(){
        if(activo == false){
            activo = true;
            System.out.println(nombre+" Ha sido activado");
        }
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre.trim();
        } else{
            System.out.println("ERROR El nombre no puede ser nulo ni estar en blanco");
        }
        this.nombre = nombre;
    }

    public void setTipo(String tipo){
        if (tipo != null = !tipo.isBlank()){
            this.tipo = tipo.trim();
        } else{
            System.out.println("ERROR El tipo no puede ser nulo ni estar en blanco");
        }
        this.tipo = tipo;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public boolean IsActivo(){
        return activo;
    }
}
