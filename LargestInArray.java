import java.util.*;

public class LargestInArray {
    
    public static int LargestInArr(int numbers[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        return max;
    }

    public static int SmallestInArr(int numbers[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        return min;
    }
    
    public static void main(String args[]){
        int numbers[]= {1,2,6,3,12}; //-infinity (minimum integer valus possible)

        System.out.println("Largest num is: " + LargestInArr(numbers));
        System.out.println("Smallest num is: " + SmallestInArr(numbers));
        
    }
}
