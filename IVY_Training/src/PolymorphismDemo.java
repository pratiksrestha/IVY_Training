class Sport{
    int area_of_field(int length, int breadth){
        return length*breadth;
    }
    String area_of_field(String sport){
        return "the sport is played indoors using a "+ sport;
    }
    float area_of_field(float radius){
        return 3.14f*radius*radius;
    }
}

class Players{
    void size(){
        System.out.println("the size of the sport is unknown");
    }
}

class Football extends Players{
    void size(){
        System.out.println("11 players in one team can play at a time.");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Sport sample = new Sport();
        System.out.println("Football field");
        System.out.println(sample.area_of_field(100,30));
        System.out.println("Cricket field");
        System.out.println(sample.area_of_field(7.5f));
        System.out.println("Chess");
        System.out.println(sample.area_of_field("chess board"));

        Players player =new Players();
        player.size();

        Football football = new Football();
        football.size();
    }
}
