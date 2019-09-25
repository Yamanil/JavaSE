
package arrays;


public class ArrayU3 {
    public static void main(String[] args) {
        int cant = ((int)(Math.random()*10+5));
        int Nros[]= new int[cant];
        for(int m=0; m < Nros.length; m++){
            int pruebita = (int)(Math.random()*20+1);
            for(int i = 0; i < Nros.length ; i ++){
                if(pruebita == Nros[i]){
                    pruebita = (int)(Math.random()*20+1);
                    
                }
            }
            Nros[m] = pruebita;
                  System.out.print(Nros[m] + "\t");
        }
        
    }
 
}
