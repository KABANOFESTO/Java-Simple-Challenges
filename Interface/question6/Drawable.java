package Interface.question6;

 interface Drawable {
     void draw();
}
class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Triangle");
        // Add code here to actually draw a triangle
    }
}
