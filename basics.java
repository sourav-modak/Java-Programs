import java.util.*;

public class basics{
    public static void main(String args[]){
        System.out.println("i'm back");

        int n=5;

        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
               for (int k=1; k<=j; k++){
                System.out.print("*");
               } 
               System.out.println();
            }
            System.out.println();
        }
    }
}