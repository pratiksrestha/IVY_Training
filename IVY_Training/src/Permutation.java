import java.util.*;

public class Permutation {
    static List<Integer> nextPermutation(int size, int numbers[]){
        List<Integer>al=new ArrayList<>();
        if(numbers.length<=1 || numbers==null) return al;

        int i=numbers.length-2;
        while(i>=0 && numbers[i]>=numbers[i+1]) i--;

        if(i>=0){
            int j=numbers.length-1;
            while(numbers[j]<=numbers[i]) j--;
            swap(numbers,i,j);
        }

        reverse(numbers,i+1,numbers.length-1);
        for(int h:numbers){
            al.add(h);
        }
        return al;
    }

    public static void swap(int numbers[], int left, int right){
        int temp=numbers[left];
        numbers[left]=numbers[right];
        numbers[right]=temp;
    }
    public static void reverse(int numbers[],int i,int j){
        while(i<j){
            swap(numbers,i++,j--);
        }
    }
    public static void main(String[] args) {
        int size;
        System.out.println("enter the size of the sample: ");
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        System.out.println("enter the values of the sample: ");
        int[] numbers=new int[size];
        List permutated_number;
        for(int i=0; i<size; i++){
            numbers[i]=s.nextInt();
        }
        permutated_number= nextPermutation(size, numbers);
        System.out.println(permutated_number);
    }
}



