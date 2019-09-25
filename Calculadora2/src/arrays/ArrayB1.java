
package arrays;


public class ArrayB1 {
    public static void main(String[] args) {
        int matrix[][] = new int [4][4];
        int valor=1;
         for(int j=0; j< 4 ; j++){
          for(int k=0; k< 4; k++){
              matrix[j][k] = valor;
              valor += 1;
              
          }                  
     }
         for (int j = 0; j < 4; j++){
             for(int k=0; k< 4; k++){
                 System.out.print(matrix[j][k] +"\t");
             }
             System.out.println("");
         }
    }
}
