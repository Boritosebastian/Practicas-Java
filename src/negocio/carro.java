package negocio;

public class carro {
    public int potencia;
    double velocidad;

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }

}
