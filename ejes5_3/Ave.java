package ejes5_3;

public abstract class Ave extends Animal {
     public Ave() {
        super();
    }

    public Ave(Sexo s, int e, int p, Alim a) {
        super(s, e, p, a);
    }


    public void ponHuevo() {
        int e = this.getEdad();
        if (e > 1) {
            System.out.println("\"Ptclo\"");

        } else {
            System.out.println("Soy muy joven para poner un huevo");
        }

    }

    public void vuela() {
        int e = this.getEdad();
        if (e > 6) {
            System.out.println("soy demasiado mayor ;c");

        } else {
            System.out.println("Soy muy joven para poner un huevo");
        }
        if (e < 7 && e > 1) {
            System.out.println("Me flipa volar pero es complicado");
        }
    }

    public void asearte() {
        System.out.println("bua, lo necesitaba");
    }

}
