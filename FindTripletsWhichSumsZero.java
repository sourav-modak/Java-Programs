import java.util.*;

public class FindTripletsWhichSumsZero {

    public static void Triplets(int nums[]){

        System.out.print("[ ");

        for( int i=0; i<nums.length; i++){

            for(int j=i; j<nums.length;j++){
                for(int k=j; k<nums.length; k++)

                if(( i!=j && i!=k && j!=k) && ((nums[i]+nums[j]+nums[k]) ==0)){ 
                    System.out.print( "[ " + nums[i] + " ," + nums[j] + " ," + nums[k] + " ]  ," );
                    
                }     
            }
        }
        System.out.print(" ] ");
    }

    public static void TripletsKisan(int nums[]){
        Arrays.sort(nums); 
        System.out.print("[");
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                for (int k = j + 1; k < n; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) continue;
                    if (nums[i] + nums[j] + nums[k] == 0) {
                            System.out.print( "[ " + nums[i] + " ," + nums[j] + " ," + nums[k] + " ]  ," );
                    }
                }
            }
        }
        System.out.print(" ] ");
    }

    public static void main(String args[]){
        int nums [] = {-1, 0,  1, 2, -1, -4};
        TripletsKisan(nums);
    }
}
