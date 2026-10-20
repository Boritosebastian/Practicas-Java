package proyecto;

public class atributos {
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    public void mostrarInformacion(){
        System.out.println(getNombre()+" "+getProgreso()+"% "+getResponsable());
    }

    public void mostrarEstado(){
        String estado = getTerminado()? "Terminado" : "En progreso";
        System.out.println(getNombre()+": "+estado);
    }

    public void avanzar() {
        this.progreso += 20;
        if(this.progreso <= 100){
            this.progreso = progreso;
        } else {
            this.progreso -= 20;
            System.out.println("ERROR El progreso supera los 100");
        }
    }

    //crear set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setProgreso(int progreso){
        if(progreso >= 0 && progreso <= 100){
            this.progreso = progreso;
        }else {
            System.out.println("El progreso debe estar entre 0 y 100");
        }
    }

    public void setResponsable(String responsable){
        this.responsable = responsable;
    }

    public void setTerminado(boolean terminado){
        this.terminado = terminado;
    }

    //crear get
    public String getNombre(){
        return nombre;
    }

    public int getProgreso(){
        return progreso;
    }

    public String getResponsable(){
        return responsable;
    }

    public boolean getTerminado(){
        return terminado;
    }

}
