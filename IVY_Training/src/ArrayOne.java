import java.util.*;

public class ArrayOne {
    public static void main(String args[]){
        //1D array
        int oneDone[] = {9,2,3,4,5,6};
        int oneDtwo[] = new int[5];
        for(int i:oneDone) {
            System.out.println(i);
        }
        for(int i=0; i<oneDone.length; i++){
            System.out.println(oneDone[i]);
        }
        Scanner s = new Scanner(System.in);
        oneDtwo = new int[5];
        for(int i=0; i<oneDtwo.length; i++){
            oneDtwo[i]=s.nextInt();
        }

        for(int i=0; i<oneDtwo.length; i++){
            System.out.println(oneDtwo[i]);
        }
    }
}
