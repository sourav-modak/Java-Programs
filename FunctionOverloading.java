import java.util.*;
public class FunctionOverloading {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b, float c){
        return a+b+c;
    }
    
    public static void main(String args[]){
        System.out.println(sum(5,2));
        System.out.println(sum(5,2,3));
        System.out.println(sum(5.3f,2.9f,4.5f));
    }
    
}
