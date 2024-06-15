import java.util.*;

public class LinearSearch {

    public static int LinearSearch(String menu[], String key2){
        for(int i=0; i<menu.length; i++){
            if((menu[i]).equals(key2)){
                return i;
            }
        }
        return -1;
    }
    
    public static int LinearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        // int numbers[] = {2,4,6,8,10,12,14,16};
        // int key = 10 ;


        // int index= LinearSearch(numbers, key);

        // if(index == -1){
        //     System.out.println(" Not Found...! ");
        // }
        // else{
        //     System.out.println("Key is at Index : " + index);
        // }

        String menu[]={"burger","pizza","hotdog","roll","eggs","chips"};
        String key2 = "roll";

        int index2 = LinearSearch(menu, key2);

        if(index2 == -1){
            System.out.println(" Not Found...! ");
        }
        else{
            System.out.println("Key is at Index : " + index2);
        }

    }
    
}
