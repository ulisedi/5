package ejes5_2_2;

import java.util.Scanner;

/**
 * Una empresa quiere implementar un programa que lleve el control de las
 * incidencias que se producen en sus ordenadores. Cada incidencia tiene un
 * código: 1, 2, 3, 4, etc. Cuando se crea una nueva incidencia, se le asigna
 * un código de forma automática y se pone el estado como “pendiente”. Al
 * crear una incidencia hay que indicar también el número de puesto (un número
 * entero). Cuando se resuelve una incidencia, hay que proporcionar información
 * sobre cómo se ha resuelto o qué es lo que fallaba, además, el estado pasa a
 * “resuelta”. El siguiente trozo de código que va dentro del main genera la
 * salida
 * que se muestra a continuación.
 * 
 * @author ECD
 * @input nada
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_2_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Gato[] g1 = new Gato[10];
        String ele;
        for (int i = 0; i < g1.length; i++) {
            g1[i] = new Gato();
            System.out.println("Para el gato Nº: " + (i + 1) + " ¿Que nombre tiene?");
            try {
                ele = s.nextLine();
            } catch (Exception e) {
                System.out.println("Error en el volor introducido");
                i--;
                s.nextLine();
                continue;
            }
            g1[i].setNombre(ele);
            System.out.println("¿Y que Sexo? (hembra/macho/ambos)");

            try {
                ele = s.nextLine();
            } catch (Exception e) {
                System.out.println("Error en el volor introducido");
                i--;
                s.nextLine();
                continue;
            }
            if (ele.equals("macho")) {
                g1[i].setSexo("macho");
            } else if (ele.equals("ambos")) {
                g1[i].setSexo("ambos");
            }

        }

        for (int i = 0; i < g1.length; i++) {
            System.out.println(g1[i]);
        }
        s.close();
    }

}
