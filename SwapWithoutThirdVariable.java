public class SwapWithoutThirdVariable {

    public static void main(String args[]){
        int a=10; 
        int b=15;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("A equals: " + a + "  B equals: " + b );

    }
    
}
