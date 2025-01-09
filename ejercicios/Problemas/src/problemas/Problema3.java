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

public class Problema3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        String promedioCualitativo;
        System.out.println("ingrese nota1");
        nota1 = entrada.nextDouble();
        System.out.println("ingrese nota2");
        nota2 = entrada.nextDouble();
        System.out.println("ingrese nota3");
        nota3 = entrada.nextDouble();
        System.out.println("ingrese nota4");
        nota4 = entrada.nextDouble();
        promedioCualitativo = promedioCualitativo(nota1, nota2, nota3, nota4);
        String cadena = "el promedio de las notas: "+nota1+", "+nota2+", "+ nota3+", "+ nota4 +"es "+promedioCualitativo;
        String salida = cualitativoMayuscula(cadena);
        System.out.printf("%s",salida);
    }

    public static String promedioCualitativo(double a, double b, double c, double d) {
        double suma;
        double promedio;
        String parametro = "";
        suma = a + b + c + d;
        promedio = suma / 4;
        if (promedio >= 0 && promedio <= 5) {
            parametro = "regular";
        } else if (promedio > 5 && promedio <= 8) {
            parametro = "bueno";
        } else if (promedio > 8 && promedio <= 9) {
            parametro = "muy bueno";
        } else if (promedio > 9 && promedio <= 10) {
            parametro = "sobresaliente";

        }
        return parametro;
    }
    public static String cualitativoMayuscula(String parametro){
        String m2 = parametro.toUpperCase();
        return m2;
    }
}
