import java.util.*;

public class Greatest_of_Three {
    public static void main(String[] args){
        int number1, number2, number3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers to compare:");
        number1 = s.nextInt();
        number2 = s.nextInt();
        number3 = s.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println(number1 + " is the greatest");
            }
            else{
                System.out.println(number3 + " is the greatest");
            }
        }
        else if(number2>number1){
            if(number2>number3){
                System.out.println(number2 + " is the greatest");
            }
            else{
                System.out.println(number3 + " is the greatest");
            }
        }
        else{
            System.out.println(number3 + " is the greatest");
        }
    }
}

