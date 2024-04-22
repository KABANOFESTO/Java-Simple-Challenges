package Rdb;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check Information about your salary:");
        System.out.println("Enter your yearly Salary:");
        double salar = scanner.nextDouble();
        System.out.println("Enter loan year:");
        int loan = scanner.nextInt();

        Bankloan bankloan = new Bankloan(salar);
        double yearly = bankloan.salary();
        double months = bankloan.months();
        double totalLoan = bankloan.totalLoan();
        if (salar <= 450000 && salar >= 400000) {
            double resTotal = totalLoan * loan;
            if (loan <= 10) {
                System.out.println("yearly Salary:" + yearly + "RWF");
                System.out.println("Monthly Salary:" + months + "RWF");
                System.out.println("Total Loan:" + resTotal + "RWF");
            } else {
                System.out.println("year must equal or under 10 years");
            }
        } else {
            System.out.println("not allowd");
        }

        scanner.close();
    }
}
