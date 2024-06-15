import java.util.*;

public class ArraysCC {

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String args[]){
        int marks[]= new int[5];

        Scanner sc= new Scanner(System.in);
        marks[0]= sc.nextInt(); //phy
        marks[1]= sc.nextInt(); //chem
        marks[2]= sc.nextInt(); //math

        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        String fruits[]={"apple","mango","grape"};
    

        // System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.toString(fruits));
        // System.out.println(Arrays.toString(marks));
        // System.out.println("marks of Phy  " + marks[0] );
        // System.out.println("marks of Chem  " + marks[1] );
        // System.out.println("marks of Math  " + marks[2] );

        // marks[2]= marks[2]+1;
        // System.out.println(Arrays.toString(marks));
        update(marks);
        for(int i=0; i< marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
    
    
}
