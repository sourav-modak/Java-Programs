import java.util.*;

public class ShortestPathToDestination_NSEW {
    
    public static float ShortestPath(String path){
        int x=0, y = 0;
        for (int i=0; i<path.length(); i++){
            
            char dir=path.charAt(i);

            if(dir=='N'){
                y++;
            }
            if(dir=='S'){
                y--;
            }
            if(dir=='W'){
                x++;
            }
            if(dir=='E'){
                x--;
            }
        }

        float ShortestPath = (float)Math.sqrt(x*x + y*y);
        return ShortestPath;
    }
    
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));

}
}
