package servicio;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public void iniciar(){
        if(this.activo){
            System.out.println("El servicio " + getNombre() + " ya esta activo");
        } else {
            this.activo = true;
            System.out.println("Servicio " + getNombre() + " iniciado en el puerto " + getPuerto());
        }
    }

    public void detener(){
        if(!this.activo){
            System.out.println("El servicio " + getNombre() + " ya esta detenido");
        } else {
            this.activo = false;
            System.out.println("Servicio " + getNombre() + " detenido");
        }
    }

    public void registrarPeticion(){
        if(this.activo){
            this.cantidadPeticiones++;
            System.out.println("Peticion registrada. Total: " + getCantidadPeticiones());
        } else {
            System.out.println("ERROR No se puede registrar la peticion, el servicio esta detenido");
        }
    }

    public void mostrarInformacion(){
        String estado = getActivo()? "Activo" : "Detenido";
        System.out.println(getNombre() + " | Puerto: " + getPuerto() + " | " + estado + " | Peticiones: " + getCantidadPeticiones());
    }

    //crear set
    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacio");
        }
    }

    public void setPuerto(int puerto){
        if(puerto > 0){
            this.puerto = puerto;
        } else {
            System.out.println("El puerto debe ser mayor que 0");
        }
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    public void setCantidadPeticiones(int cantidadPeticiones){
        if(cantidadPeticiones >= 0){
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("La cantidad de peticiones no puede ser negativa");
        }
    }

    //crear get
    public String getNombre(){
        return nombre;
    }

    public int getPuerto(){
        return puerto;
    }

    public boolean getActivo(){
        return activo;
    }

    public int getCantidadPeticiones(){
        return cantidadPeticiones;
    }

}
