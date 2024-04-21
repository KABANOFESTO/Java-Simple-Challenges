package Abstract.question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Area a = new Area();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rectangle ' s  length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the rectangl e  ' s  breadth: ");
        double breadth = scanner.nextDouble();
        System.out.println("Area of rectangle  =  " + a.RectangleArea(length, breadth));

        System.out.println("Enter the Square's    s ide: ");
        double side = scanner.nextDouble();
        System.out.println("Area of Square =   " + a.SquareArea(side));

        System.out.println("Enter the Circle's   radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle = " + a.CircleArea(radius));
        scanner.close();

    }
}
