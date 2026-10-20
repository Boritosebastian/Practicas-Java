package tarea;

public class tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("Titulo:"+titulo+" Responsable:"+responsable+" Horas estimadas:"+horasEstimadas);
    }

    void mostrarEstado(){
        String estado = completada ?"En Proceso":"Completada";
        System.out.println(titulo+": "+estado);
    }

    void mostrarResponsable(){
        System.out.println(titulo+": "+responsable);
    }

}
