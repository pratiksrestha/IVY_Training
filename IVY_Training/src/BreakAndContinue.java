import java.util.*;

public class BreakAndContinue {
    public static void main(String args[]){
        int number;
        for(number=1; number<=10; number++){
            if(number==5){
             return;
//             continue;
//             break;
            }
            System.out.println("number");
        }
        System.out.println("i do not belong inside the loop");
    }
}
