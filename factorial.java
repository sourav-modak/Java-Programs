import java.util.*;
public class factorial {

    public static int findFactorial(int num){
        int n = num;
        int fact = 1;
        if(n == 0){
            return 1;
        }
        else{
        for(int i=n; i>1; i--){
            fact = fact*i;
        }
        return fact;
        }
    }

     
    
    public static void main(String args[]){
      
        System.out.println( findFactorial(5) );
        
    }
    
}
