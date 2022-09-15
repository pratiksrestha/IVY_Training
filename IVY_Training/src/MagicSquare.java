import java.util.*;

public class MagicSquare {
    static String checkNumber(int [][]arr) {
        int sum_r=0,sum_c=0,sum_dl=0,sum_dr=0,n=arr.length;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr.length;j++) {
                sum_r=sum_r+arr[i][j];
                sum_c=sum_c+arr[j][i];

            }
            sum_dl=sum_dl+arr[i][i];
            sum_dr=sum_dr+arr[i][n-1];
            //System.out.println(arr[i][n-1]);
            n=n-1;
        }

        //System.out.println("diagonal sum dl "+sum_dl+" d sum dr "+sum_dr+" sum_r "+sum_r+" sum_c "+sum_c);
        if(sum_r==sum_c && sum_dr==sum_dl)
            return "MagicSqaure";
        else
            return "Not MagicSqaure";
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        System.out.println("enter the elements ");
        for(int outer=0;outer<n;outer++) {
            for(int inner=0;inner<n;inner++) {
                arr[outer][inner]=sc.nextInt();
            }
        }
        String op= checkNumber(arr);
        System.out.println(op);
//        int[][] TwoDOne = new int[10][10];
//        System.out.println("Enter the size of the matrix: rows x columns:: ");
//        Scanner s = new Scanner(System.in);
//        int rows, columns;
//        rows = s.nextInt();
//        columns = s.nextInt();
//        if(rows!=columns){
//            System.out.println("Matrix needs to be a square i.e. number of rows and columns should be equal.");
//        }
//        else{
//            System.out.println("Enter the values of the matrix: row wise");
//            for(int i=0; i<rows;i++) {
//                for (int j = 0; j<columns; j++) {
//                    TwoDOne[i][j]= s.nextInt();
//                }
//            }
//            for(int i=0; i<rows;i++) {
//                for (int j = 0; j<columns; j++) {
//                    System.out.print(TwoDOne[i][j]);
//                }
//                System.out.println();
//            }
//
//            int RowSumValue=0, ColumnSumValue=0, DiagonalSumValue=0, RowTemp=0, ColumnTemp=0, DiagonalTemp=0, RowFlag=0, ColumnFlag=0, DiagonalFlag=0, flag=0;
//            for(int i=0; i<rows;i++) {
//                for (int j = 0; j<columns; j++) {
//                    RowSumValue = RowSumValue + TwoDOne[i][j];
//                    ColumnSumValue = ColumnSumValue + TwoDOne[i][j];
//                }
////                System.out.println(RowSumValue);
//                RowSumValue=0;
//                if(RowFlag==0){
//                    RowTemp=RowSumValue;
//                    RowFlag++;
//                }
//                else{
//                    if(RowSumValue==RowTemp){
//                        continue;
//                    }
//                    else{
//                        flag++;
//                        System.out.println("This matrix is not a Magic Square.");
//                        break;
//                    }
//                }
//            }
//
//
//            for(int j=0; j<rows;j++) {
//                for (int i = 0; i<columns; i++) {
//                        ColumnSumValue = ColumnSumValue + TwoDOne[i][j];
//                }
//                ColumnSumValue=0;
//                if(ColumnFlag==0){
//                    ColumnTemp=ColumnSumValue;
//                    ColumnFlag++;
//                }
//                else{
//                    if(ColumnSumValue==ColumnTemp){
//                        continue;
//                    }
//                    else{
//                        flag++;
//                        System.out.println("This matrix is not a Magic Square.");
//                        break;
//                    }
//                }
//            }
//
//
//            for(int i=0; i<rows;i++) {
//                for (int j = 0; j<columns; j++) {
//                    if(i==j || j==columns-i-1){
//                        DiagonalSumValue = DiagonalSumValue + TwoDOne[i][j];
//                    }
//                                    System.out.println(RowSumValue);
//                }
//                if(DiagonalFlag==0){
//                    DiagonalTemp=DiagonalSumValue;
//                    DiagonalFlag++;
//                }
//                else{
//                    if(DiagonalSumValue==DiagonalTemp){
//                        continue;
//                    }
//                    else{
//                        flag++;
//                        System.out.println("This matrix is not a Magic Square.");
//                        break;
//                    }
//                }
//            }
//
//
//        }
    }
}



