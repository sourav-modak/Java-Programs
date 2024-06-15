import java.util.*;
public class BasicSortingQues {
    
    public static void bubbleSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                    
                if(arr[j]<arr[i]){

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
    }

    
    public static void selectionSort(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;

        }
    }

    public static void insertionSort(int arr[]){

        for (int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            
            while ( prev>=0 && arr[prev]>curr){

                arr[prev + 1] = arr[prev];
                prev--;
                }

                arr[prev+1]=curr;
                
        }

    }


    public static void printArr(int arr[]){
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " " );
        }
        System.out.print(" ]");
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};

        //bubbleSort(arr);
        //selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }
}
