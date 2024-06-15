import java.util.*;
public class JavaBasics {
    
    public static int CalculateSum(int num1, int num2){
    
        int Sum= num1 + num2;
        return Sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int Sum= CalculateSum(a,b);
        System.out.println("Sum is " + Sum);
    }
    
}
