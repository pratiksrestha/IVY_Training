class AreaOfShapes{
    int area(int length, int breadth){
        return length*breadth;
    }
    float area(float radius){
        return 3.14f*radius*radius;
    }
}

class Shape{
    void name(){
        System.out.println("the shape of the object in unknown");
    }
}

class Circle extends Shape{
    void name(){
        System.out.println("the shape of the object in circle");
    }
}
public class OopsPolymorphism {
    public static void main(String[] args) {
        AreaOfShapes sample = new AreaOfShapes();
        System.out.println("area of rectangle:");
        System.out.println(sample.area(10,20));
        System.out.println("area of circle:");
        System.out.println(sample.area(6.25f));//compile time static polymorphism: overloading

        Shape shape =new Shape();
        shape.name();

        Circle circle = new Circle();
        circle.name(); //run time dynamic polymorphism: overriding
    }
}
