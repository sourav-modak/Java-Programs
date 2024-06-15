import java.util.*;
public class MissingNumber {

    public static void MissingNumber(int nums[]){
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){
                System.out.println("Missing Number is : " + i);
                break;
            }
        }
    }
    
    public static void MissingNumberP2(int nums[]){
        int n_xor=nums.length;
        for(int i=0; i<nums.length; i++){
            n_xor = n_xor ^ i;
            n_xor = n_xor ^ nums[i];
        }
        System.out.println("Missing Number (part2) is : " + n_xor);
    }

    public static void main(String args[]){
        int nums[]={3,0,1};
        MissingNumberP2(nums);

    }
    
    
}
