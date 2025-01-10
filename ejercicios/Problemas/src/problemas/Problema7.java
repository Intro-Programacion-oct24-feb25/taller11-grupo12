/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

    public static void main(String[] args) {
        String[] ciudadesEcuador = arreglo1();
        procedimientoCiudad(ciudadesEcuador);
    }

    public static String[] arreglo1() {
        Scanner entrada = new Scanner(System.in);

        int lim;
        System.out.println("Ingrese el limite de ciudades");
        lim = entrada.nextInt();
        entrada.nextLine();

        String[] ciudades = new String[lim];

        for (int i = 0; i < lim; i++) {
            System.out.println("Ingrese el nombre de la ciudad " + (i + 1) + ":");
            ciudades[i] = entrada.nextLine();
        }

        return ciudades;
    }

    public static void procedimientoCiudad(String[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if ((arreglo[i].length() == 4) || (arreglo[i].length() == 5)) {
                System.out.printf("%s\n", arreglo[i]);
            }
        }
    }

}
