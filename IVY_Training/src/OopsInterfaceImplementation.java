public class OopsInterfaceImplementation implements DemoInterface{
    @Override
    public void type(){
        System.out.println("super robot");
    }

    public void action(){
        System.out.println("walk");
    }

    public static void main(String[] args) {
        OopsInterfaceImplementation sample = new OopsInterfaceImplementation();
        sample.type();
        sample.action();
        sample.specs();
        DemoInterface.source();
        model x = new model();
        x.detail();
    }
}
