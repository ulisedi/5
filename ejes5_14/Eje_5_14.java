package ejes5_14;

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
public class Eje_5_14 {

    public static void main(String[] args) {
        FichaDomino f1 = new FichaDomino(6, 1);
        FichaDomino f2 = new FichaDomino(0, 4);
        FichaDomino f3 = new FichaDomino(3, 3);
        FichaDomino f4 = new FichaDomino(0, 1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        // Programación orientada a objetos 203
       System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));

    }
}
