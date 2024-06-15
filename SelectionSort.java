import java.util.*;

public class SelectionSort {
    
    public static void SelectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos=i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i]= arr[minPos];
            arr[minPos]= temp;

        }

    }

    public static void arrPrint(int arr[]){
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.print(" ]");
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        SelectionSort(arr);
        arrPrint(arr);
    }


}
