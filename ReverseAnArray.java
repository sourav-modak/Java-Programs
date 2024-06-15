import java.util.*;
public class ReverseAnArray {
    
    public static void ReverseArray(int numbers[]){
        int start = 0;
        int end = numbers.length-1;
       
            while(start<end){
                int temp = numbers[start];
                numbers[start]=numbers[end];
                numbers[end]=temp;
                start++;
                end--;
            }
        
        }
    
    
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        ReverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
