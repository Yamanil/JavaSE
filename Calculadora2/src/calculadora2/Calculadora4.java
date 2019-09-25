
package calculadora2;

import java.util.Scanner;
import servicios.CalcuService;


public class Calculadora4 {
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
           CalcuService servicio = new CalcuService();
           resultado = servicio.operar(nro1,nro2,ope);
            System.out.println("deseas seguir: SI-1, NO-2");
            condicion = ingreso.nextInt();   
        }
        System.out.println("el resultado es : "+ resultado );  
    }
}
