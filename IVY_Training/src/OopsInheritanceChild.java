class Address{
    String address="Kathmandu";

}

class ContactNumber extends Address{
    int contact = 9860101;
}

//public class OopsInheritanceChild extends ContactNumber{ //multi level inheritance
//    int roll_no = 10064589;
//    public static void main(String[] args) {
//        OopsInheritanceChild oopsInheritanceChild = new OopsInheritanceChild();
//        System.out.println(oopsInheritanceChild.address+" "+oopsInheritanceChild.contact+" "+oopsInheritanceChild.roll_no);
//    }
//}


//public class OopsInheritanceChild extends OopsInheritanceParent{ //single inheritance: one parent one child
//    int roll_no = 10064589;
//    public static void main(String[] args) {
//        OopsInheritanceChild oopsInheritanceChild = new OopsInheritanceChild();
//        System.out.println(oopsInheritanceChild.name+" "+oopsInheritanceChild.age+" "+oopsInheritanceChild.roll_no);
//    }
//}


public class OopsInheritanceChild extends OopsInheritanceParent implements MultipleTwoInheritance,MultipleOneInheritance{ //multiple inheritance
    int roll_no = 10064589;
    @Override
    public void course(){
        System.out.println("Engineering Course");
    }

    @Override
    public void activity(){
        System.out.println("Football");
    }
    public static void main(String[] args) {
        OopsInheritanceChild oopsInheritanceChild = new OopsInheritanceChild();
        System.out.println(oopsInheritanceChild.name+" "+oopsInheritanceChild.age+" "+oopsInheritanceChild.roll_no);
        oopsInheritanceChild.course();
        oopsInheritanceChild.activity();

    }
}
