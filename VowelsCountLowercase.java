import java.util.*;
public class VowelsCountLowercase {
    
    public static String LowercaseVowels(String str){
        Integer count =0;

        for (int i=0; i<str.length(); i++){
            
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ){
                count++;
            }
        }

        return count.toString();

    } 
    
    
    public static void main(String args[]){
        String str= "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(LowercaseVowels(str));
    }
}
