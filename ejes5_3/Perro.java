package ejes5_3;

public class Perro extends Mamifero {

    public Perro() {
        super();
    }

    public Perro(Sexo s, int e, int p, Alim a) {
        super(s, e, p, a);
    }

    

    public void ladra() {
        System.out.println("Bark bark");

    }

    @Override
    public void come() {
        System.out.println("Espero que me des algo de carne ><");
    }

    public void peleaCon(Perro s) {
        Sexo sex = this.getSexo();
        Perro s2 = s;
        switch (s2.getSexo()) {
            case MACHO:
                if (sex.equals(s2.getSexo())) {
                    System.out.println("Le voy a reventar");
                } else {
                    System.out.println("No peleo con Hembras");
                }
                break;
             case HEMBRA:
                if (sex.equals(s2.getSexo())) {
                    System.out.println("La voy a reventar, Sujetame los pendientes");
                } else {
                    System.out.println("Le voy a reventar");
                }
                break;

            default:
                break;
        }

    }
}
