import java.util.*;

public class ContainsDuplicate{

    public static boolean ifDuplicate(int numbers[]){

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        int numbers[] ={1, 2, 3, 1};
        // int numbers[]={1, 2, 3, 4};
        // int numbers[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(ifDuplicate(numbers));
    }
}