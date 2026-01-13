package ejes5_3;

public abstract class Animal {
    public enum Sexo {
        MACHO, HEMBRA
    }

    public enum Alim {
        CARNE, PLANTAS, OMNI
    }

    private String nombre;
    private int peso;
    private int edad;
    private Sexo sexo;
    private Alim alim;

    

    ///////////////

    public Animal() {
        sexo = Sexo.MACHO;
        edad = 0;
        peso = 0;
        alim = Alim.OMNI;

    }

    public Animal(Sexo s, int e, int p, Alim a) {
        sexo = s;
        edad = e;
        peso = p;
        alim = a;
    }

    /////////////
    /// 
    public Alim getAlim() {
        return alim;
    }

    public void setAlim(Alim alim) {
        this.alim = alim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    ////////////////////////
    public void anda() {
        System.out.println("tap tap tap");
    }

    public void duerme() {
        System.out.println("zzzzzzzzzzzzzzz");
    }

    public void hacerNecesidades() {
        System.out.println("Tocoplom ");
    }

}
