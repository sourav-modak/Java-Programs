import java.util.*;
public class SumOfDigitsInAnInteger {

    public static int SumOfDigits(int num){

        int sum=0;
        while(num>0){
            int LastDigit = num%10;
            sum = sum+LastDigit;
            num=num/10;
        }
        return sum;

    }

    public static void main(String args[]){
        System.out.println("Sum is " + SumOfDigits(1277));
    }
    
}
