package ejes5_3;

public class Canario extends Ave {
    public Canario() {
        super();
    }

    public Canario(Sexo s, int e, int p, Alim a) {
        super(s, e, p, a);
    }

    @Override
    public void vuela() {
        System.out.println("Literalmente estoy en una jaula, no puedo :c");
    }
}
