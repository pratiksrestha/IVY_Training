import java.util.*;

public class Permutation {
    static List<Integer> nextPermutation(int n, int nums[]){
        // code here
        List<Integer>al=new ArrayList<>();
        if(nums.length<=1 || nums==null) return al;

        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;

        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]) j--;
            swap(nums,i,j);
        }

        reverse(nums,i+1,nums.length-1);
        for(int h:nums){
            al.add(h);
        }
        return al;
    }

    public static void swap(int a[], int l, int r){
        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;
    }
    public static void reverse(int a[],int i,int j){
        while(i<j){
            swap(a,i++,j--);
        }
    }
    public static void main(String[] args) {
        int size;
        System.out.println("enter the size of the sample: ");
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        System.out.println("enter the values of the sample: ");
        int[] numbers=new int[size];
        List permutated_number= new ArrayList();
        for(int i=0; i<size; i++){
            numbers[i]=s.nextInt();
        }
        permutated_number= nextPermutation(size, numbers);
        System.out.println(permutated_number);
    }
}



