
package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Ingresa la clave secreta");
        Scanner ingreso = new Scanner(System.in);
        String texto = ingreso.next();
        int intentos=1;
        while(intentos < 3){
            if(texto.equals("yosoy")){
                System.out.println("Chevere, ingresaste !!!");
                break;
            }else {
                System.out.println("Ing. la clave otra vez, intento" + intentos+1);
                texto = ingreso.next();
                intentos++;
            }
        }
        if (intentos==3){
            
        }
        System.out.println("Fuera!!! acabaste tus intentos insectos... ");
    }
   
}
