public class GenericMethodDemo {
    public <T,U> void genericsMethod(T []arr, U name){
        for(T item:arr){
            System.out.println("Items in array are "+item);
        }
        System.out.println("The other datatype number is "+name);
    }

    public static void main(String[] args){
//        String[] arr={"one", "two", "three"};
//        char anyChar = 'R';
        Integer []arr={1,2,3,4,5};
        String anyChar="Pratik";
        GenericMethodDemo obj=new GenericMethodDemo();
        obj.genericsMethod(arr, anyChar);

    }
}
