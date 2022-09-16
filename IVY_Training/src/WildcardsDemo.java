import java.util.List;
import  java.util.ArrayList;

public class WildcardsDemo {
    public static void main(String[] args){
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.2);
        doubleList.add(6.5);
        doubleList.add(8.6);
        printList(doubleList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Pratik");
        stringList.add("Alpha");
        printList(stringList);

    }

    public static void printList(List<?> listOfAll){
        System.out.println(listOfAll);
    }

}
