import java.util.*;

public class Types_of_Loops {
    public static void main(String[] args){

        int i;
        for(i=1; i<=20; i++){ //even numbers
            if(i%2==0){
                System.out.println(i);
            }
        }
        int numbers[] = {1,2,3,4,5}; // for-each loop
        for(int j : numbers)
            System.out.println(j);

        int k=0;
        while(k<5){
            System.out.println(k);
            k++;
        }

        int s=5;
        do{
            System.out.println(s);
            s++;
        }
        while(s<10);
    }
}
