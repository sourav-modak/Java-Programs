import java.util.*;
public class BinomialCoefficient {

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

     public static int BinomialCoeff(int n, int r){
        int nf = findFactorial(n);
        int rf = findFactorial(r);
        int nmrf = findFactorial(n-r);
        int bicf = nf/(rf*nmrf);
        return bicf;
    }
    
    public static void main(String args[]){
      

        System.out.println( BinomialCoeff(5,2));
    }
    
}
