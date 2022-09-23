import java.lang.management.OperatingSystemMXBean;

public class OopsAbstraction extends Student {
    @Override
    public void stream(){
        System.out.println("i am an engineering student");
    }
    public static void main(String[] args) {
        OopsAbstraction sample = new OopsAbstraction();
        sample.study();
        sample.stream();
    }
}

abstract class Student{ //access specifier abstract class nameoftheclass - abstract class
    public abstract void stream();  //access specifier abstract datatype nameofthemethod - abstract method

    public void study(){
        System.out.println("Student is studying");
    }
}
