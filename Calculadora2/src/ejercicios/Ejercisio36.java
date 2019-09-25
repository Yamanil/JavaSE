
package ejercicios;

import java.util.Scanner;

public class Ejercisio36 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int cantTrab = leer.nextInt(); double totalSueldos=0.0,sueldos = 0.0;
        for(int j=1; j<= cantTrab ; j++){
            System.out.println("Ing.la cant. horas del trabajador" + j);
            int horas = leer.nextInt();
            String sueldo;
            if(horas <=20){
                sueldo = horas*25;
            }else{
                sueldo = horas*25 + (horas - 20)*20;
            }
            totalSueldos += sueldo;
            System.out.print("Elsueldo del trabajador" + j + "es" + sueldo+ "t");
         
        }
        System.out.print("Y el monto desembolsado es:"+totalSueldos+"\t");
    }
}
