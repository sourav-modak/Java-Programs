import java.util.*;

public class _2D_Array {

    public static void main(String args[]){

        int matrix[][] = new int[3][3];

        Scanner sc= new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");

                if(max<matrix[i][j]){
                    max =matrix[i][j];
                }
                if(min>matrix[i][j]){
                    min =matrix[i][j];
                }

            }
            System.out.println();
            
        }
            System.out.println("Maximum value is " + max );
            System.out.println("Mimimum value is " + min );
    }
}
