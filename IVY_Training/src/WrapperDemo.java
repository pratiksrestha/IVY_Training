import java.util.*;

public class WrapperDemo {
    public static void main(String[] args){

        Integer number=10;
        int anotherNumber=number.intValue();
        System.out.println(anotherNumber);

        String sample_string = "20";
        int parsed_interger = Integer.parseInt(sample_string);
        System.out.println(parsed_interger);

        Float decimal = 30.39f;
        float floatNumber = decimal.floatValue();
        System.out.println(floatNumber);

        //Autoboxing and Autounboxing
        //Autoboxing is the conversion of primitive data types to the object of their corresponding WrapperClass.
        int x = 30;
        Integer z=x;
        //Auto unboxing is the conversion of WrapperClass to the corresponding primitive data types.
        Integer a = 50;
        int y = a.intValue();
        int q = a;
        System.out.println(q);
    }
}
