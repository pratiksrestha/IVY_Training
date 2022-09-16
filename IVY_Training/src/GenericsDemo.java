public class GenericsDemo <T>{
    T value;

    public GenericsDemo(T value) {
        this.value = value;
    }

    public void printValue(){
        System.out.println(value);
    }

    public static void main(String[] args){
        GenericsDemo<Integer> obj = new GenericsDemo<>(23);
        GenericsDemo<String> obj1 = new GenericsDemo<>("pratik");
        GenericsDemo<Float> obj2 = new GenericsDemo<>(3.14f);
        obj.printValue();
        obj1.printValue();
        obj2.printValue();
    }
}
