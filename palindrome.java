import java.util.*;
public class palindrome {

    public static boolean isPalindrome(int num){
        int myNum=num;
        int rev=0;
        int pow=0;
        while(num>0){
        int LastDigit = num%10;
        rev= rev*10 + LastDigit;
        num = num/10;
        }

        if(myNum==rev){
            return true;
        }
        return false;
    }
    
    public static void main(String args[]){
        System.out.println(isPalindrome(123214));
    }
    
}
