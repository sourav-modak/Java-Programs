import java.util.*;

public class TrappingRainwater_Part2 {

    public static int Trapping_Rainwater2(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
        int rightMax[]= new int[n];

        leftMax[0]=height[0];
        for (int i=1; i<n; i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
            
        }
        rightMax[n-1]=height[n-1];
        for (int i=n-2; i>=0; i--){
            rightMax[i]= Math.max(height[i],rightMax[i+1]);
        }

        int TrappedWater=0;
        for (int i=0; i<n; i++){
            TrappedWater+= ((Math.min(rightMax[i],leftMax[i]))-height[i]);
        }

        return TrappedWater;

    }
    public static void main(String args[]){
        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(Trapping_Rainwater2(height));
        
    }
    
}
