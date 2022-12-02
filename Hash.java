
package hash;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mendo
 */
public class Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo[] = new int[7];
        int arreglo2[] = {7, 6, 5, 1, 14, 9, 26};
        
        System.out.println("Ingresa el elemento a buscar");
        int ele = leer.nextInt();
        
        int i, c = 0, c2 = 0;
        while (c < arreglo.length) {
            i = arreglo2[c] % (arreglo.length);
            if(arreglo[i]!=0){
                do {
                    i++;
                    if(i==7){
                        i=0;
                    }
                    c2++;
                } while (arreglo[i]!=0 && c2<=arreglo.length+1);
            }
            //System.out.println(Arrays.toString(arreglo));
            if(arreglo2[c] == ele){
                System.out.println("La clave del elemento buscado es: "+i);
            }
            arreglo[i] = arreglo2[c];
            System.out.println(Arrays.toString(arreglo));
            c++;
        }
        System.out.println("El arreglo con las claves asignadas es: " + Arrays.toString(arreglo));
        
    }
}
