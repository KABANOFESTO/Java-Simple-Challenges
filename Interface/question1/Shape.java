package Interface.question1;
 interface Shape {
     double getArea ();
 }
 class Rectangle implements Shape{
     private double length,breadth;
     Rectangle(double length,double breadth){
         this.length = length;
         this.breadth = breadth;
     }
     public double getArea(){
         return length * breadth;
     }

 }
 class Circle implements Shape{
        private double radius;
        Circle(double radius){
            this.radius = radius;
        }
        public double getArea(){
            return Math.PI *radius *radius;
        }
     }
     class Triangle implements Shape{
                  private double height, base;
                  Triangle(double height,double base){
                      this.height = height;
                      this.base = base;
                  }
                  public double getArea(){
                      return 0.5 * height * base;
                  }
     }

