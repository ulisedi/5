package ejes5_3;

import java.util.Scanner;

import ejes5_3.Animal.Alim;
import ejes5_3.Animal.Sexo;

/**
 * crear las clase vehiculos y dos subclasescoche y bicicleta. un meno donde nos
 * permita sumar y ver el resultado de los km
 * 
 * @author ECD
 * @input las opciones del menú y los km que se van a recorrer
 * @output los valores resultado de las opciones
 * 
 * 
 */
public class Eje_5_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Perro pip = new Perro(Sexo.MACHO,2,3,Alim.OMNI);
         Perro pip2 = new Perro(Sexo.MACHO,2,3,Alim.OMNI);

        pip.come();
        pip2.peleaCon(pip);
        s.close();
    }

}
