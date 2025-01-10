/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

        int proceso;
        System.out.println("Selecciona una opcion:\n"
                + "(1) Calcular el area de un Cuadrado\n"
                + "(2) Calcular el area de un Triangulo\n"
                + "(3) Calcular el area de un Rectangulo");

        System.out.print("Ingrese el numero del area a calcular: ");
        proceso = entrada.nextInt();
        switch (proceso) {
            case 1:
                areaCuadrado();
                break;
            case 2:
                areaTriangulo();
                break;
            case 3:
                areaRectangulo();
                break;

        }
    }

    public static void areaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        double lado;
        double area;

        System.out.println("Ingrese valor del lado del cuadrado:");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.printf("El area del cuadrado es:%.0f\n", area);
    }
    
    public static void areaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del triangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo:");
        altura = entrada.nextDouble();
        area = (base*altura)/2;
        System.out.printf("El area del triangulo es:%.1f\n", area);
    }
    
     public static void areaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Ingrese la base del rectangulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del rectangulo:");
        altura = entrada.nextDouble();
        area = base*altura;
        System.out.printf("El area del rectangulo es:%.0f\n", area);
    }
   
}
    
    

