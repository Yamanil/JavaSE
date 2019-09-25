
package ejercicios;

import java.util.Scanner;

public class Ejercisio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ing. un nro");
        int cant = leer.nextInt();
        int nro = cant ;
        if (nro % 2 !=0){
            nro += 1;
        }
        System.out.println("Esto lo que realmente muestra");
        for (int i = 1 ; i <= cant ; i++){
            System.out.println((nro + (i *2-2)) + "\t");
        
    }
    }
    
}
