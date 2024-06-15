import java.util.*;
public class MaxSubarraySum_PrefixSum {
    

    public static void MaxSubarraySum(int numbers[]){
        
        int maxSum=Integer.MIN_VALUE; 
        int CurrSum=0;
        int prefix[]= new int [numbers.length];
        
        //Calculate prefix array
        prefix[0]=numbers[0];
        for (int i=1;i<prefix.length;i++){
            prefix[i]= prefix[i-1] + numbers[i] ;
        }

        for(int i=0; i<numbers.length; i++){
            int start=i;
            for (int j=i; j<numbers.length; j++){
                int end=j;
                CurrSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                
                    if (CurrSum>maxSum){
                        maxSum=CurrSum;
                    }     
            } 
        }
    
        System.out.println( " Max Sum : " + maxSum);
    }

    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        
        MaxSubarraySum(numbers);
    }
}
