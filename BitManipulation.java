import java.util.*;
public class BitManipulation {

    public static void oddOrEven(int n){
        int bitMask =1;
        if((n & bitMask ) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static int GetIthBit(int n, int i){
        int bitMask = 1<<i;

        if((n & bitMask) ==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return ClearIthBit(n,i);
        }else{
            return SetIthBit(n,i);
        }
    }

    public static int ClearIBits(int n, int i){
        int bitMask = ((~0)<<i);
        return n & bitMask;
    }

    public static int ClearIBits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<n)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }

    public static int SetBits(int n){
        int count=0;
        
        while(n>0){
            if((n & 1)!= 0 ){
                count++;
            }
            n = n>>1;
        }
        return count;
    }


    public static void main(String args[]){
        //oddOrEven(4);
       //System.out.println(ClearIBits(15, 2));
       //System.out.println(isPowerOfTwo(13)); 
       System.out.println(SetBits(15));
    }
}
