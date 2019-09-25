
package calculadora2;
// calculadora acumulada y con manejo de error
import java.util.Scanner;


public class calculadora3 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int condicion = 1; // -128 a 127
        Double nro1,nro2,resultado = null  ; // decimal +-3.4 *10ala38
        char ope ;
        System.out.println("ing. nro1");
        nro1 = ingreso.nextDouble();
        while(condicion==1){
           System.out.println("ingresa el operador");
           ope = ingreso.next().charAt(0); // + - * /
           System.out.println("ingresa el siguiente numero");
           nro2 = ingreso.nextDouble();
           switch(ope){
               case'+': resultado =  (nro1 + nro2); break;
               case'-': resultado =  (nro1 - nro2); break;
               case'*': resultado =  (nro1 * nro2); break;
               case'/': resultado =  (nro1 / nro2); break;
            }
            System.out.println("deseas seguir: SI-1, NO-2");
            condicion = ingreso.nextInt();   
        }
        System.out.println("el resultado es : "+ resultado );
    }
}