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

        denominador = d;
        numerador = n;

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

    //
    public String multiplica(fraccion f) {
        // int a = this.getNumerador() * f.getNumerador();
        // int b = this.getDenominador() * f.getDenominador();
        // setNumerador(a);
        // setDenominador(b);
        return this.getNumerador() * f.getNumerador() + "/" + this.getDenominador() * f.getDenominador();
    }

    // Esto con todos to string a todos
    public String dividide(fraccion f) {
        // int a = this.getDenominador() * f.getNumerador();
        // int b = this.getNumerador() * f.getDenominador();
        // setNumerador(a);
        // setDenominador(b);
        return this.getDenominador() * f.getNumerador() + "/" + this.getNumerador() * f.getDenominador();
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

    public String invierte() {
        // int a = this.getDenominador();
        // int b = this.getNumerador();
        // setNumerador(a);
        // setDenominador(b);
        return this.getDenominador() + "/" + this.getNumerador();

    }

    public String toString() {
        return this.getNumerador() + "/" + this.getDenominador();
    }
}
