import java.util.*;
public class array {

    public static void main(String args[]){

        int QUES[]={1,2,8,3,2,2,2,5,1};
        int count = 1;
        for(int i=0; i<QUES.length; i++ ){
            int item = QUES[i];
            
            if (item==QUES[i]){
                count++;
            }
            
        }
        System.out.println(count);
    }
    
}
