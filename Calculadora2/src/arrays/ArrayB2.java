
package arrays;

public class ArrayB2 {
        public static void main(String[] args) {
        int matrix[][] = new int [5][5];
         for(int j=0; j< 5 ; j++){
          for(int k=0; k< 5; k++){
              if(j==k){
                  matrix[j][k]=1;
              }else{
                  matrix [j][k]=0;
              }
              
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


