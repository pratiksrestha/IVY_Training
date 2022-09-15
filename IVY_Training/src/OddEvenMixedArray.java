import java.util.Scanner;

public class OddEvenMixedArray {
    static int array_classifier(int oneDone[],int range){
        int value=0, flag=0;
//        int InputArray[10] = oneDone[];
        for(int i=0; i<range; i++){
            if(oneDone[i]%2==0){
                flag++;
            }
            else{
                flag--;
            }
        }
        if(flag==range){
            value=1;
        }
        else if(flag==-range){
            value=2;
        }
        else{
            value=3;
        }
        return value;
    }

    public static void main(String args[]){
        int oneDone[] = new int[10];
        Scanner s = new Scanner(System.in);
        oneDone = new int[10];
        int range;
        System.out.println("Enter the size of the array: ");
        range = s.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<range; i++){
            oneDone[i]=s.nextInt();
        }
        int typeOFarray = array_classifier(oneDone, range);
        if(typeOFarray==1){
            System.out.println("Even Array");
        }
        else if(typeOFarray==2){
            System.out.println("Odd Array");
        }
        else{
            System.out.println("Mixed Array");
        }
    }
}
