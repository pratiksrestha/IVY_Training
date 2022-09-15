import java.util.*;

public class ArrayTwo {
    public static void main(String args[]){
        //2D array
        int TwoDOne[][] = {{1,2,3}, {2,3,4}, {3,4,5}};
        for(int i=0; i<TwoDOne.length;i++){
            for(int j=0; j<TwoDOne.length;j++){
                System.out.print(TwoDOne[i][j]);
            }
            System.out.println();
        }
    }
}
