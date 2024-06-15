import java.util.*;

public class DiagonalSum {

    public static int diagonalSum(int matrix[][]){

        int Sum =0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j< matrix.length; j++){
        //         if(i==j || i+j == matrix.length-1){
        //           Sum+=matrix[i][j];  
        //         }
        //     }
        // }


        // for(int i=0; i<matrix.length; i++){
        //     Sum+= matrix[i][i];
 
        //     if(i!=matrix.length-1-i)
        //     Sum+= matrix[i][matrix.length-i-1];
                 
        //  }

        for(int i=0; i<matrix.length; i++){
            Sum+= matrix[i][i];
 
            if(i!=matrix.length-i-1)
            Sum+= matrix[i][matrix.length-i-1];
                 
         }

        return Sum;
    }
    
    
    public static void main(String args[]){
        //  int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};

        int matrix[][]={{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};

        System.out.println("Diaginal sum is " + diagonalSum(matrix));
                        
    }

 
}
