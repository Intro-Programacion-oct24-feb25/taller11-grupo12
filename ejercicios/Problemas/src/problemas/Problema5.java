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
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int[][] informacion2 = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        int[][] suma = sumaArreglos(informacion, informacion2);

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumaArreglos(int[][] a, int[][] b) {
        int filas = a.length;
        int columnas = a[0].length;
        int[][] suma = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        return suma;
    }
}
