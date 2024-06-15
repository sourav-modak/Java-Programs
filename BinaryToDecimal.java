import java.util.*;
public class BinaryToDecimal {

    public static int BinToDec(int n){
       int pow=0;
       int Dec=0;
       while (n>0){
        int LastDigit = n%10;
        Dec = Dec + LastDigit*((int)Math.pow(2,pow)); //had to typecast as Math.pow takes double value
        pow++;
        n=n/10;
       } 
       return Dec;
    }
    

    public static void main(String args[]){
        System.out.println(BinToDec(101));
        
    }
} 

