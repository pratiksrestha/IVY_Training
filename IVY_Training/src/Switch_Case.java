import java.util.*;
public class Switch_Case {
    public static void main(String args[]){
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the case number:");
        num = s.nextInt();
        switch(num)
        {
            case '1':
                System.out.println("Case1: Value is: "+num);
            case '2':
                System.out.println("Case2: Value is: "+num);
            case '3':
                System.out.println("Case3: Value is: "+num);
            default:
                System.out.println("Default: Value is: "+num);
        }
    }
}
