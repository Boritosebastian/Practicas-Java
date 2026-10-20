package negocio;

public class carro {
    public int potencia;
    double velocidad;

    public carro(int potencia,double velocidad){
        /*this.potencia = potencia;
        this.velocidad = velocidad;*/
        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros++;
    }

    private static int numCarros = 0;
    private static final double IVA = 0.12;

    public carro(){
        numCarros++;
    }




    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }

    public double calcularPrecioVenta(double precio){
        return precio +(precio * IVA);
    }

    public void setPotencia(int potencia){
        if(potencia > 0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        //Se actualiza si el dato no es correcto
        if (velocidad < 0)
            velocidad = 0;
        this.velocidad = velocidad;
    }

    public static int getNumCarros(){
        return numCarros;
    }

    public static double getIva(){
        return IVA;
    }

    public int getPotencia(){
        return potencia;
    }

    public double getVelocidad(){
        return velocidad;
    }


}
