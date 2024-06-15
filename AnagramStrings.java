import java.util.*;
public class AnagramStrings {
    
    public static boolean isAnagram(String str1, String str2){
        
        if(str1.length()!=str2.length()){
            return false;
        }
        char xor = '0';
        for(int i=0; i<str1.length() ;i++ ){
            xor = xor ^ str1.charAt(i);
        }
        System.out.println(xor);
        if(xor!='0'){
            return false;
        }
        return true;
    }
   
    public static void main(String args[]){

        String str1 = "race";
        String str2 = "care";

        System.out.println(isAnagram(str1,str2));

   } 
}
