import java.util.*;

public class Collatz_Sequence {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting point of the sequence: ");
        number = s.nextInt();
        if(number==1){
            System.out.println("1");
            System.out.println("0");
        }
        else {
            System.out.println(number);
            while (number > 1) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = 3 * number + 1;
                }
                System.out.println(number);
            }
        }
    }
}
