
package ejercicios;

import java.util.Scanner;

public class Ejercisio32 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
   System.out.println("Ing. el nro");
   int divisor = leer.nextInt();
   int cociente = 1,residuo = 1;
   String nroConv = "";
   while (cociente > 2){
     cociente = divisor / 2;
     residuo = divisor % 2;
     nroConv = residuo + nroConv;
     divisor = cociente;
     
   }
   nroConv = cociente + nroConv;
   System.out.println("El nro. en base 2 es " + nroConv);
    }
}
