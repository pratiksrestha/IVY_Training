public class GenericMethodDemo {
    public <T,U> void genericsMethod(T []arr, U name){
        for(T item:arr){
            System.out.println("Items in array are "+item);
        }
        System.out.println("The other datatype is "+name);
    }

    public static void main(String[] args){
//        String[] arr={"one", "two", "three"};
//        char anyChar = 'R';
        String []arr={"hello","hi","how","are","you"};
        String anyChar="Pratik";
        GenericMethodDemo obj=new GenericMethodDemo();
        obj.genericsMethod(arr, anyChar);

    }
}
