package Interface.question1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.4,7.6);
        Circle circle = new Circle(2.2);
        Triangle triangle = new Triangle(4,6);
        System.out.println("Area of rectangle: "+rectangle.getArea());
        System.out.println("Area of circle: "+circle.getArea());
        System.out.println("Area of triangle: "+triangle.getArea());

    }
}
