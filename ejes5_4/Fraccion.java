package ejes5_4;

public abstract class Fraccion {

    private double numerador;
    private double denominador;

    /////////////

    public Fraccion() {

        denominador = 0;
        numerador = 0;

    }

    public Fraccion(double d, double n) {

        denominador = d;
        numerador = n;

    }

    ///////////

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    //////////////////////
    public void multiplicar() {

    }

    public void dividir() {

    }

    public void simplificar() {

    }

    public void invierte() {
       numerador n= this.getDenominador();
      denominador d= this.getNumerador();
    }

}
