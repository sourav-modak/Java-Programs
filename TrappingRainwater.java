import java.util.*;

public class TrappingRainwater {

    public static int TrappingRainwater(int height[]){
        int n=height.length;
        // Calculate Left Max Boundary - array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);

        }
        // Calculate Right Max Boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        } 
        int trappedWater=0;
        // loop
        for (int i=0; i<n; i++){

            // Water Level = Minm (Left Max Boundary, Right Max Boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            // Trapped water = Water Level- height[i]
            trappedWater += (waterLevel - height[i]);
        }
        
        return trappedWater;
    }

    public static void main(String [] args){

        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappingRainwater(height));

    }
    
}
