import java.util.*;
public class InvertedHalfPyramidWithNumbers {
    
    public static void InvertedHalfNumPyramid(int h){
        for(int i=1; i<=h; i++){
            
            for (int j=1; j<=h-i+1; j++ ){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){

        InvertedHalfNumPyramid(5);
    }
}
