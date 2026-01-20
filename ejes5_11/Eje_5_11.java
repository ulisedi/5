package ejes5_11;

/**
 * modificar el ejercicio anterior para que podamos, introduccir tambien una
 * variable, de tipo de tarifa
 * y luego hacer un nuevo metodo de "llamada" para que tambien calcule lo
 * tarifado segun la tarifa del movil.
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_11 {

    public static void main(String[] args) {
        TarjetaRegalo t1 = new TarjetaRegalo(100);
        TarjetaRegalo t2 = new TarjetaRegalo(120);
        System.out.println(t1);
        System.out.println(t2);
        t1.gasta(45.90);
        t2.gasta(5);
        t2.gasta(200);
        t1.gasta(3.55);
        System.out.println(t1);
        System.out.println(t2);
        TarjetaRegalo t3 = t1.fusionaCon(t2);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
