import java.util.*;
public class DecimalToBinary {
    
     public static int DecToBin(int n){
         int pow =0;
         int Bin =0;
         while (n>0){
             int LastDigit=n%2;
             Bin= Bin + LastDigit*((int)(Math.pow(10,pow)));//had to typecast as Math.pow takes double value
             pow++;
             n= n/2;
         }
         return Bin;
         } 
         
 
     public static void main(String args[]){
        
         System.out.println(DecToBin(5));
     }
    
}
