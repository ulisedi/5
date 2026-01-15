package ejes5_4;

public class fraccion {

    private int numerador;
    private int denominador;

    //

    public fraccion() {

        denominador = 0;
        numerador = 1;

    }

    public fraccion(int n, int d) {

        denominador = n;
        numerador = d;

    }

    //

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    ///
    public void multiplicar(fraccion f) {
        int f1 = this.getDenominador() * f.getDenominador();
        int f2 = this.getNumerador() * f.getNumerador();
        setDenominador(f1);
        setNumerador(f2);
    }

    public String dividir(fraccion f) {
        String f3 = " " + this.getDenominador() * f.getNumerador();
        f3 += "/" + this.getNumerador() * f.getDenominador();
        return f3;
    }

    public void simplifica() {
        int a = Math.abs(this.numerador);
        int b = Math.abs(this.denominador);
        int resto;

        if (b == 0) {
            System.out.println("No puede ser el denominador cero");
            return;
        }

        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }

        this.numerador = this.numerador / a;
        this.denominador = this.denominador / a;
    }

    public void invierte() {

        int n = this.getDenominador();
        this.setDenominador(this.getNumerador());
        this.setNumerador(n);

    }

    public String toString() {
        String cadena = "\n" + this.getNumerador() + "/" + this.getDenominador();
        return cadena;
    }
}
