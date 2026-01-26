package ejes5_2_3;

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
public class Eje_5_2_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = 0;
        int c = 0;
        String n;
        String g;
        String a;
        int du;
        Disco[] d1 = new Disco[10];
        do {
            System.out.println();
            System.out.println("DISCOS");
            System.out.println("=========");
            System.out.println("1.Añadir un disco");
            System.out.println("2.Añadir un disco con todos los datos");
            System.out.println("3.Mostrar un disco");
            System.out.println("4.Mostrar todos los discos");
            System.out.println("5.Eliminar un disco");
            System.out.println("6.Cambiar autor de un disco");
            System.out.println("7.Cambiar título de un disco");
            System.out.println("8.Cambiar género de un disco");
            System.out.println("9.Cambiar duración de un disco");
            System.out.println("10.Salir");
            System.out.println("Elige una opción (1-10): ");
            try {
                d = s.nextInt();
                s.nextLine();
            } catch (Exception e) {
                System.out.println("-");
                System.out.println("Error en el valor.");
                s.nextLine();
                d = 0;
                continue;
            }
            if (d > 10 | d < 0) {
                System.out.println("-");
                System.out.println("El valor tiene que ser 1-10");
                d = 0;
                continue;
            }

            switch (d) {

                case 1:
                    System.out.println("¿Que titulo quieres que tenga?");
                    n = s.nextLine();
                    System.out.println("¿Que genero tiene?");
                    g = s.nextLine();
                    d1[c] = new Disco(n, g);
                    c++;
                    break;
                case 2:
                    System.out.println("¿Que titulo quieres que tenga?");
                    n = s.nextLine();
                    System.out.println("¿Que genero tiene?");
                    g = s.nextLine();
                    System.out.println("¿Que autor tiene?");
                    a = s.nextLine();
                    System.out.println("¿Que duración tiene(s)?");
                    du = s.nextInt();
                    d1[c] = new Disco(n, g, a, du);
                    c++;
                    break;
                case 3:
                    System.out.println("¿Que número de disco quieres ver? "+"tienes un total de: "+c+" Discos introducidos");
                    du = s.nextInt();
                    if (du > c ){
                        System.out.println("Ese disco no Existe");
                    } else if (c ==0 ){
                        System.out.println("No tienes discos que ver");
                    } else {
                    System.out.println(d1[du-1]);
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("¿Que disco quieres cambiar?");
                    System.out.println("¿A cuanto tiempo quieres cambiarlo? (s)");
                    
                    break;

                default:
                    break;
            }

        } while (d != 10);
        s.nextLine();
        s.close();
    }

}
