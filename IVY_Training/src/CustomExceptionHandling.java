//WAP to create your own exception class and show the usage of throw and throws keywords as well as try catch finally block

class InvalidIdNumberException  extends Exception
{
    public InvalidIdNumberException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

public class CustomExceptionHandling
{
    static void validate (int id) throws InvalidIdNumberException{
        if(id < 18){
            throw new InvalidIdNumberException("ID is not valid");
        }
        else {
            System.out.println("Valid ID");
        }
    }

    public static void main(String args[])
    {
        try
        {
            validate(13);
        }
        catch (InvalidIdNumberException ex)
        {
            System.out.println("Caught the exception");

            System.out.println("Exception occurred: " + ex);
        }

        System.out.println("Thank you");
    }
}