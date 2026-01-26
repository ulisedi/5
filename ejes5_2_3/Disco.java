package ejes5_2_3;
public class Disco {
    private static int codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;
    private int ccodigo;

    public Disco(String t, String g,String a , int d) {
        ccodigo++;
        codigo = ccodigo;
        titulo = t;
        autor = a;
        genero = g;
        duracion = d;
    }

    public Disco(String t, String g) {
        ccodigo++;
        codigo = ccodigo;
        titulo = t;
        genero = g;
        autor= "";
        duracion=0;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion+" s";
        cadena += "\n------------------------------------------";
        return cadena;
    }
}
