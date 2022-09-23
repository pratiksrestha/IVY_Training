interface Hobbies {
    void activity();
}
interface Talent {
    void skill();
}
public class ElderChild extends Parent{
    private int ID = 6009;
    String name = "Alpha";

    public static void main(String[] args) {
        ElderChild sample = new ElderChild();
        System.out.println(sample.name+" "+sample.familyID+" "+ sample.familyName+" "+sample.ID);
    }
}

class MiddleChild extends Parent{
    private int ID = 7009;
    String name = "Bravo";

    public static void main(String[] args) {
        MiddleChild sample = new MiddleChild();
        System.out.println(sample.name+" "+sample.familyID+" "+ sample.familyName+" "+sample.ID);
    }
}

class YoungerChild extends ElderChild implements Hobbies, Talent{
    @Override
    public void activity(){
        System.out.println("Football");
    }

    @Override
    public void skill(){
        System.out.println("Leadership");
    }
    private int ID = 8009;
    String name="Charlie";
    public static void main(String[] args) {
        YoungerChild sample = new YoungerChild();
        ElderChild info = new ElderChild();
        System.out.println(sample.name+" "+sample.familyID+" "+ sample.familyName+" "+sample.ID);
        System.out.println(info.name+" is the eldest.");
        sample.activity();
        sample.skill();
    }

}
class Parent{
    int familyID = 9999;
    String familyName = "Shrestha";
}