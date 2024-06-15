import java.util.*;

public class xPattern{

public static void xPattern(int n){
    for(int i=0; i<n; i++ ){

        for (int j=0; j<2*n; j++){
           
           if( (i+j) == (2*n)-2 || (i==j) ){ 
            System.out.print("X");
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
    }

    for(int i=n-1; i>=1; i-- ){

        for (int j=1; j<=2*n; j++){
           
           if( (i+j) == 2*n || (i==j) ){ 
            System.out.print("X");
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
    }  
}


public static void main(String args[]){
    int n=8;
    xPattern(n);
}
}
