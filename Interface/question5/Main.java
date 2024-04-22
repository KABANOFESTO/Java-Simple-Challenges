package Interface.question5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 10);
        System.out.println("Original Width: " + rectangle.getWidth());
        System.out.println("Original Height: " + rectangle.getHeight());
        rectangle.resizeWidth(10);
        rectangle.resizeHeight(4);

        System.out.println("Resized Width: " + rectangle.getWidth());
        System.out.println("Resized Height: " + rectangle.getHeight());
    }
}
