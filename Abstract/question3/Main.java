package Abstract.question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of the student A(3 subjects): ");
        System.out.println("Subject 1: ");
        double marksA1 = scanner.nextDouble();
        System.out.println("Subject 2: ");
        double marksA2 = scanner.nextDouble();
        System.out.println("Subject 3: ");
        double marksA3 = scanner.nextDouble();
        A a = new A(marksA1, marksA2, marksA3);
        double percentageA = a.getPercentage();

        System.out.println("Enter the marks of the student B(4 subjects): ");
        System.out.println("Subject 1: ");
        double marksB1 = scanner.nextDouble();
        System.out.println("Subject 2: ");
        double marksB2 = scanner.nextDouble();
        System.out.println("Subject 3: ");
        double marksB3 = scanner.nextDouble();
        System.out.println("Subject 4: ");
        double marksB4 = scanner.nextDouble();
        B b = new B(marksB1, marksB2, marksB3, marksB4);
        double percentageB = b.getPercentage();
        System.out.println("The percentage obtain by the student A: " + percentageA);
        System.out.println("The percentage obtain by the student B: " + percentageB);
        
        scanner.close();

    }
}
