import java.util.*;
public class PrintSubarraysSumSelf {
    
    public static void SubArrays(int numbers[]){
        int allSum[]=new int[15];
        
        int counter=0; int maxSum=Integer.MIN_VALUE; int minSum=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            for (int j=i; j<numbers.length; j++){
                int sum=0;
                for (int k=i; k<=j; k++){
                    
                    System.out.print( numbers[k] + " " );
                    sum = sum + numbers[k]; 
                }
                System.out.print("And sum is " + sum);
                    if (sum>maxSum){
                        maxSum=sum;
                    }
                    if(sum<minSum){
                        minSum=sum;
                    }
                    allSum[counter]=sum;
                    counter++;
                
                System.out.println();
            }
            System.out.println();
        }
    
        System.out.println(Arrays.toString(allSum));
        System.out.println("Counter :" + counter + ", Min Sum :" + minSum + ", Max Sum : "+ maxSum);
        
    }
     
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        
        SubArrays(numbers);
        
    }


    
}
