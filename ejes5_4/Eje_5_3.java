package ejes5_4;
/**
 * crear las clases Animal mamifero ave gato perro canario pinguino y lagarto, y
 * tres metodos en cada. Luego probarlas
 * 
 * @author ECD
 * @input las opciones del menú y los km que se van a recorrer
 * @output los valores resultado de las opciones
 * 
 * 
 */
public class Eje_5_3 {

    public static void main(String[] args) {

        fraccion a = new fraccion(4, 6);
        fraccion b = new fraccion(2, 8);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Dividida a entre b: " + a.dividide(b));
        System.out.println("Multiplicar a por b: " + a.multiplica(b));
        System.out.println("a invertida: " + a.invierte());
        System.out.println("b invertida: " + b.invierte());
        a.simplifica();
        b.simplifica();
        System.out.println("a simplificada: "+ a);
        System.out.println("b simplificada: "+ b);
    }
}