package ejes5_3;


public abstract class Animal {
public enum Sexo {
    MACHO, HEMBRA
}

    private String nombre;
    private int peso;
    private int edad;

    ////////////////////
    private Sexo sexo;

    public Animal() {
        sexo = Sexo.MACHO;
    }

    public Animal(Sexo s) {
        sexo = s;
    }

    //////////////////

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

}
