public class OopsEncapsulation {
    //access specifiers/ modifiers: public, private, protected and default
    private String name="Alpha";
    private int age=69;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void displayDetails(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {

    }
}
