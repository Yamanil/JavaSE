
package ejercicios;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int N = ingreso.nextInt();
        double suma = 0;
        for(int j=1;j<=N; j ++){
            suma+= j;
            
        }
        System.out.println("La suma es:" + suma);
    }
}
