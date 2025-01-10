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
public class Problema4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String nombre;
        String cedula;
        while (bandera) {
            System.out.println("Ingrese su nombre completo");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su numero de cedula");
            cedula = entrada.nextLine();

            System.out.println("Que proceso desea realizar\n"
                    + "1. Calcular valor de la planilla de luz\n"
                    + "2. Calcular el predio de un bien inmueble");
            int numero = entrada.nextInt();
            switch (numero) {
                case 1:
                    calcularLuz(nombre, cedula);
                    break;
                case 2:
                    calcularPredio(nombre, cedula);
                    break;
            }
            entrada.nextLine();
            System.out.println("Ingrese (si) para salir del proceso ");
            String salida = entrada.nextLine();
            if (salida.equalsIgnoreCase("si")) {
                bandera = false;
            }

        }

    }

    public static void calcularLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double kilovatio;
        double num;
        double operacion;
        System.out.println("Ingrese el valor del kilovatio");
        kilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos");
        num = entrada.nextDouble();
        operacion = kilovatio * num;
        System.out.printf("Cliente %s con cedula %s debe cancelar el "
                + "valor de $%.2f\n", a, b, operacion);

    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double inmueble;
        double operacion;

        System.out.println("Ingrese el valor del inmueble");
        inmueble = entrada.nextDouble();

        operacion = inmueble * 0.2;

        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble "
                + "valorado en $%.2f y tiene que pagar de predio $%.2f\n", a, b,
                inmueble, operacion);

    }

}
