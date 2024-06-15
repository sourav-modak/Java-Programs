import java.util.*;
public class MaxSubarraySum_BruteForce {

    public static void MaxSubarraySum(int numbers[]){
        
        int maxSum=Integer.MIN_VALUE; 
        int minSum=Integer.MAX_VALUE; //Also found min subarray sum for practice
        int CurrSum=0;

        for(int i=0; i<numbers.length; i++){

            for (int j=i; j<numbers.length; j++){

                CurrSum=0;
                for (int k=i; k<=j; k++){
                    
                    System.out.print( numbers[k] + " " );
                    //subarray Sum
                    CurrSum += numbers[k]; 
                }
                System.out.print(", And it's sum is " + CurrSum);
                    if (CurrSum>maxSum){
                        maxSum=CurrSum;
                    }
                    if(CurrSum <minSum){
                        minSum=CurrSum;
                    }
                
                System.out.println();
            }
            System.out.println();
        }
    
        System.out.println( " Min Sum : " + minSum + ", Max Sum : "+ maxSum);
    }

    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        
        MaxSubarraySum(numbers);
    }


}
