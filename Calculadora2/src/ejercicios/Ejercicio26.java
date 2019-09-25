
package ejercicios;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Ing. el nro");
       Scanner ingreso = new Scanner(System.in);
        int N = ingreso.nextInt();
        double factorial =1;
       for(int k=N ; k >= 1 ; k--){
           factorial*=k;
       }
       
    }
}
