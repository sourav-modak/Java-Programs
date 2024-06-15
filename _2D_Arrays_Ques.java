import java.util.*;

public class _2D_Arrays_Ques {

    public static void PrintNoOf7s(int array[][]){
        int n = array.length;
        int m = array[0].length;
        int count=0;
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]==7){
                    count++;
                }
            }
        }

        System.out.println("No of 7s in the given array is " + count);
    }
    
    public static void SumOf2ndRow(int nums[][]){
        
        int sum=0;

        for(int j=0; j<nums[0].length; j++){
                sum+= nums[1][j];
            }

        System.out.println("Sum of 2nd Row is " + sum);
    }

    public static void TransposeOfMatrix(int arr[][]){

        int arr2[][]= new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr2[j][i]=arr[i][j];
            }
        
        }
        for(int i=0; i<arr[0].length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr2[i][j]+ " ");
            }
            System.out.println();
        }
    }



    public static void main(String [] args){

        // int [][] array= {{4,7,8},{8,8,7}};
        // PrintNoOf7s(array);

        // int [][] nums ={{1,4,9},{11,4,3},{2,2,3}};
        // SumOf2ndRow(nums);

        // int [][] arr=  {{4,7,8},
        //                 {8,8,7}};
        // TransposeOfMatrix(arr);

        int [][] arr = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
                        
        TransposeOfMatrix(arr);
    }
    
}
