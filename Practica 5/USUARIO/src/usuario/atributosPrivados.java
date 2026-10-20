package usuario;

public class atributosPrivados {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public void mostrarUsuario(){
        System.out.println(getUsername()+" "+getCorreo()+" "+getNivel());
    }

    public void mostrarActivo(){
        String resultado = getActivo()? "Activo" : "Inactivo";
        System.out.println(getUsername()+" se encuentra "+resultado);
    }

    public void activar() {
        if(getActivo() == false) {
            setActivo(true);
            System.out.println(getUsername()+" Ha sido activado");
        }
    }

    public void desactivar() {
        if(getActivo() == true) {
            setActivo(false);
            System.out.println(getUsername()+" Ha sido desactivado");
        }
    }



    //Creacion de metodos SET
    public void setUsername(String username){
        if (username != null && !username.isBlank()) {
            this.username = username.trim();
        } else{
            System.out.println("ERROR El nombre no puede ser nulo ni estar en blanco");
        }
    }

    public void setCorreo(String correo){
        if (correo != null && !correo.isBlank()){
            this.correo = correo.trim();
        } else{
            System.out.println("ERROR El correo no puede ser nulo ni estar en blanco");
        }
    }

    public void setNivel(int nivel){
        if(nivel >= 0){
            this.nivel = nivel;
        } else{
            System.out.println("EL numero debe ser mayor o igual a 0");
        }
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }

    //Creacion de metodos GET
    public String getUsername(){
        return username;
    }

    public String getCorreo(){
        return correo;
    }

    public int getNivel(){
        return nivel;
    }

    public boolean getActivo(){
        return activo;
    }

}
