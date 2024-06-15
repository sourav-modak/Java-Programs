import java.util.*;

public class MaxSubarraySum_KadanesAlgorithm {

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs=0;
        int cs2 =0;
        int ms2=Integer.MIN_VALUE;

            for(int i=0; i<numbers.length; i++ ){
                cs = cs + numbers[i];
                cs2 = numbers[i];
                 if(cs<0){
                    cs=0;
                }
                ms = Math.max(cs,ms);
                ms2 = Math.max(cs2,ms2);
            }
            if (ms2<0){
                System.out.println(" Max Subarray sum is : " + ms2);
            }else{
                System.out.println(" Max Subarray sum is : " + ms);
            }
        
    }

    public static void main(String args[]){
        //int numbers[]= {-2,-3,4,-1,-2,1,5,-3};
        int numbers[]= {-2,-3,-4,-1,-5,-3};
        
        kadanes(numbers);
    }
    
}
