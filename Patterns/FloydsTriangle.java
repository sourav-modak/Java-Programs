import java.util.*;
public class FloydsTriangle {

    public static void FloydsTriangle(int h){
        int count =1;
        for (int i=1; i<=h; i++){
            for (int j=1; j<=i ; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        
    }
    
    public static void main(String args[]){
        FloydsTriangle(5);
    }
    
}
