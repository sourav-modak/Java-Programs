import javax.sql.rowset.spi.SyncResolver;

public class CharacterPattern {
    public static void main(String args[]){
        int n=10;
        char ch='A';

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(" " + ch+ " ");
                ch++;
            }
            System.out.println();
         
        }
    }
}
