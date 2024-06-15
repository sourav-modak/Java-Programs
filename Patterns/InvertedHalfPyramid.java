import java.util.*;
public class InvertedHalfPyramid {
    
    public static void InvertedPyramid(int h){
        for(int i=1;i<=h; i++){
            for(int j=1; j<=h-i;j++){
                System.out.print("   ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        InvertedPyramid(4);
    }
    
}
