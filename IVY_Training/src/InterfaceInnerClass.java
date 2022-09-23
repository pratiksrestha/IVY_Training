
interface TestInterface
{
    void printer();
    class OuterClass
    {
        public void print()
        {
            System.out.println("Outer");
        }
    }
}
class InterfaceInnerClass implements TestInterface
{
    public void printer()
    {
        System.out.println("Inner");
    }

    public static void main(String args[])
    {
        InterfaceInnerClass sample = new InterfaceInnerClass();
//         InterfaceInnerClass.printer();
//        InterfaceInnerClass.printer(new TestInterface().printer());
        OuterClass result=new OuterClass();
        result.print();


    }
}