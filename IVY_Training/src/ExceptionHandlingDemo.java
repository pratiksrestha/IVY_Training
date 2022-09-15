import java.util.*;

public class ExceptionHandlingDemo {
    public static void main(String[] args){
        int a,b,c=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        String str = null;
        int len=0;
        try{
            c = a/b;
            len = str.length();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the final block.");
        }
        System.out.println(len);
        System.out.println("result is: "+c);
    }
}
