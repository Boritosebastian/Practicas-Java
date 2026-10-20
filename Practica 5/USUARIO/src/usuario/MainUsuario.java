package usuario;

public class MainUsuario {
    static void main() {
        atributosPrivados c1 = new atributosPrivados();
        atributosPrivados c2 = new atributosPrivados();

        c1.setUsername("Pedro");
        c1.setCorreo("Pedro1998@hotmail.com");
        c1.setNivel(5);
        c1.setActivo(true);

        c2.setUsername("Ana");
        c2.setCorreo("Ana2000@gmail.com");
        c2.setNivel(2);
        c2.setActivo(false);

        System.out.println("--------DATOS PERSONALES--------");
        c1.mostrarUsuario();
        c1.mostrarActivo();
        c2.mostrarUsuario();
        c2.mostrarActivo();

        c1.desactivar();
        c2.activar();

        c1.mostrarActivo();
        c2.mostrarActivo();
    }
}
