public class HalfPyramidPattern {
    public static void main(String args[]){
        int height=5;

        for(int i=1; i<=height; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        } 


    }
}
