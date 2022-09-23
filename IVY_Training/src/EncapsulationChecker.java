public class EncapsulationChecker {
    public static void main(String[] args) {
        OopsEncapsulation ex = new OopsEncapsulation();

//        ex.displayDetails(); works when the displayDetails method is public but not when its private

        System.out.println(ex.getAge());
        System.out.println(ex.getName());
        System.out.println("After changing name:");
        ex.setName("Pratik");
        System.out.println(ex.getName());
    }
}
