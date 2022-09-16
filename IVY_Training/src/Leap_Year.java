import java.util.*;

public class Leap_Year {
    public static void main(String[] args) {

        int year;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year you want to check whether it is a leap year or not::");
        year = s.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
