package ejes5_2_4;

import java.util.Scanner;

/**
 * 
 * 
 * @author ECD
 * @input dependiendo de la operacion que se quiera hacer
 * @output los valores resultado de las opciones pedidas en el ejercicio
 * 
 * 
 */
public class Eje_5_2_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int d = 0;
        int c = 0;
        String n = "";
        String g = "";
        String a = "";
        int du = 0;
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
                    // a) con el siguiente if se comprueba que la cantidad de objetos intanciados no
                    // supere 10
                    if (c < 10) {

                        System.out.println("¿Que titulo quieres que tenga?");
                        n = s.nextLine();
                        System.out.println("¿Que genero tiene?");
                        g = s.nextLine();

                        d1[c] = Disco.crearDsc(n, g);
                        c++;
                    } else {
                        System.out.println("Se ha alcanzado el maximo de discos");
                    }
                    break;
                case 2:
                    // a) con el siguiente if se comprueba que la cantidad de objetos intanciados no
                    // supere 10
                    if (c < 10) {

                        System.out.println("¿Que titulo quieres que tenga?");
                        n = s.nextLine();
                        System.out.println("¿Que genero tiene?");
                        g = s.nextLine();
                        System.out.println("¿Que autor tiene?");
                        a = s.nextLine();
                        try {
                            System.out.println("¿Que duración tiene(s)?");
                            du = s.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error");
                            s.nextLine();
                            continue;
                        }
                        d1[c] = Disco.crearDs(n, g, a, du);
                        c++;
                    } else {
                        System.out.println("Se ha alcanzado el maximo de discos");
                    }
                    break;
                case 3:
                    if (c != 0) {
                        System.out.println(
                                "¿Que número de disco quieres ver? " + "tienes un total de: " + c
                                        + " Discos introducidos");
                        try {
                            du = s.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error");
                            s.nextLine();
                        }

                        if (du > c | du < 0) {
                            System.out.println("Ese disco no Existe");
                        } else {
                            System.out.println(d1[du - 1]);
                        }
                    } else {
                        System.out.println("No hay discos que cambiar");
                    }
                    break;
                case 4:
                    if (c != 0) {
                        for (int i = 0; i < c; i++) {
                            System.out.println(d1[i]);
                        }
                    } else {
                        System.out.println("No hay discos que enseñar");
                    }
                    break;
                case 5:

                    if (c != 0) {
                        for (int i = 0; i < c; i++) {
                            System.out.println(d1[i]);
                        }
                        System.out.println("¿Que Disco quieres borrar?");
                        try {
                            du = s.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error");
                            System.out.println("------");
                            s.nextLine();
                        }
                        // b) si no esta en el rango significa que no existe. lo compruebo con el if
                        if (du > c | du < 0) {
                            System.out.println("Ese disco no Existe");
                        } else {
                            d1[du - 1].borrarD();
                        }
                    } else {
                        System.out.println("No hay discos que borrar");
                    }
                    break;
                case 6:
                    if (c != 0) {
                        for (int i = 0; i < c; i++) {
                            System.out.println(d1[i]);
                        }
                        System.out.println("¿En que disco quieres cambiar el autor?");
                        try {
                            du = s.nextInt();
                        } catch (Exception e) {
                            s.nextLine();

                        }
                        if (du > c | du < 0) {
                            System.out.println("Ese disco no Existe");
                        } else {

                            System.out.println("¿a que autor quieres cambiarlo?");
                            try {
                                a = s.nextLine();
                            } catch (Exception e) {
                                System.out.println("Error");
                                s.nextLine();

                            }
                            d1[du - 1].setAutor(a);
                        }
                    } else {
                        System.out.println("No hay discos que cambiar");
                    }
                    break;
                case 7:
                    if (c != 0) {
                        for (int i = 0; i < c; i++) {
                            System.out.println(d1[i]);
                        }
                        System.out.println("¿En que disco quieres cambiar el Titulo?");
                        try {
                            du = s.nextInt();
                        } catch (Exception e) {
                            s.nextLine();

                        }
                        if (du > c | du < 0) {
                            System.out.println("Ese disco no Existe");
                        } else {
                            System.out.println("¿a que titulo quieres cambiarlo?");
                            try {
                                a = s.nextLine();
                            } catch (Exception e) {
                                System.out.println("Error");
                                s.nextLine();

                            }
                            d1[du - 1].setTitulo(a);

                        }
                    } else {
                        System.out.println("No hay discos que cambiar");
                    }
                    break;
                case 8:

                    if (c != 0) {
                        for (int i = 0; i < c; i++) {
                            System.out.println(d1[i]);
                        }
                        System.out.println("¿En que disco quieres cambiar el genero?");
                        try {
                            du = s.nextInt();
                        } catch (Exception e) {
                            s.nextLine();

                        }
                        if (du > c | du < 0) {
                            System.out.println("Ese disco no Existe");
                        } else {
                            System.out.println("¿a que genero quieres cambiarlo?");
                            try {
                                a = s.nextLine();
                            } catch (Exception e) {
                                System.out.println("Error");
                                s.nextLine();

                            }
                            d1[du - 1].setGenero(a);
                        }
                    } else {
                        System.out.println("No hay discos que cambiar");
                    }
                    break;
                case 9:
                    if (c != 0) {
                        for (int i = 0; i < c; i++) {
                            System.out.println(d1[i]);
                        }
                        System.out.println("¿En que disco quieres cambiar la Duración?");
                        try {
                            du = s.nextInt();
                        } catch (Exception e) {
                            s.nextLine();
                              System.out.println("Error");
                            continue;
                          
                        }
                        if (du > c | du < 0) {
                            System.out.println("Ese disco no Existe");
                        } else {
                            System.out.println("¿cuanta duracion quires que tenga?");
                            try {
                                du = s.nextInt();
                            } catch (Exception e) {
                                System.out.println("Error");
                                s.nextLine();

                            }
                            d1[du - 1].setDuracion(du);
                        }
                    } else {
                        System.out.println("No hay discos que cambiar");
                    }
                    break;

                default:
                    break;
            }

        } while (d != 10);
        s.nextLine();
        s.close();
    }

}
