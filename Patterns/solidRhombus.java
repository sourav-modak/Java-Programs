import java.util.*;

public class solidRhombus {
    
    public static void SolidRhombus(int n){
        for(int i=1; i<=n; i++){
            {
                for(int j=1; j<=n-i; j++){
                    System.out.print("   "); 
                }
                for(int k=1; k<=n;k++){
                    System.out.print(" * "); 
                }      
        }
        System.out.println();        
    }
    }
    
    
    public static void main(String args[]){

        SolidRhombus(10);
        
    }
    }

