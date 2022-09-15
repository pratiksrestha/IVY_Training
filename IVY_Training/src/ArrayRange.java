import java.util.*;

public class ArrayRange {
    public static void main(String[] args){
        int[][] TwoDOne = new int[10][10];
        System.out.println("Enter the size of the matrix: rows x columns:: ");
        Scanner s = new Scanner(System.in);
        int rows, columns;
        rows = s.nextInt();
        columns = s.nextInt();
            System.out.println("Enter the values of the matrix: row wise");
            for(int i=0; i<rows;i++) {
                for (int j = 0; j<columns; j++) {
                    TwoDOne[i][j]= s.nextInt();
                }
            }
            for(int i=0; i<rows;i++) {
                for (int j = 0; j<columns; j++) {
                    System.out.print(TwoDOne[i][j]);
                }
                System.out.println();
            }

            int MaxValue=0, MinValue=TwoDOne[0][0];
            for(int i=0; i<rows;i++) {
                for (int j = 0; j<columns; j++) {
                    if(TwoDOne[i][j]>MaxValue){
                        MaxValue = TwoDOne[i][j];
                    }
                    if(TwoDOne[i][j]<MinValue){
                        MinValue = TwoDOne[i][j];
                    }
                }
            }
        System.out.println(MaxValue + "\n" + MinValue);
        int range = MaxValue-MinValue;
        System.out.println((range));
    }
}
