public class ButterflyPattern {
    public static void ButterflyPattern(int h){
        for (int i=1; i<=h; i++){
            for (int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1; j<=2*(h-i); j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();

        }

        for (int i=h; i>=1; i--){
            for (int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1 ; j<=2*(h-i); j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    
    }
    
    public static void main(String args[]){
        ButterflyPattern(5);
    }
    
}
