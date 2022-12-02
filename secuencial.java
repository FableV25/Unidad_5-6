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
public class secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int c = 0;
        int [] arreglo = {6,32,8,2,5};
        System.out.println("Ingresa el valor a buscar: ");
        int n = leer.nextInt();
        while(arreglo[c] != n && c <= arreglo.length){
            c++;
        }
        System.out.println("El valor está en: "+c);
        
    }
    
}
