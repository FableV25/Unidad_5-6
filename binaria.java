/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos_busqueda;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class binaria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 0;
        int[] arreglo = {6, 32, 8, 2, 5, 4, 2, 76, 34, 21, 90, 34, 56};
        int n = leer.nextInt();
        int i, j, aux;
        for (i = 0; i < arreglo.length - 1; i++) {
            for (j = 0; j < arreglo.length - i - 1; j++) {                                                              
                if (arreglo[j + 1] < arreglo[j]) {
                    aux = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        
        System.out.println(arreglo[0]);
    }
}
