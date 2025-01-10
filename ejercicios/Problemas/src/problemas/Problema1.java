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
public class Problema1 {
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        arregloPares(informacion);
        
    }

    public static void arregloPares(int[][] datos) {
        String pares = "";
        
        for(int i = 0; i < datos.length; i++){
            for( int j = 0; j < datos.length; j++){
                if(datos[i][j]%2 == 0){
                     pares = String.format("%s%d\n", pares, datos[i][j]);
                }
            }
        }
        System.out.printf("%s\n",pares);

    }

}
