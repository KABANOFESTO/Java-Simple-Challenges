package Rdb;

interface Bank {
    double salary();

    double months();

    double totalLoan();
}

class Bankloan implements Bank {

    private double payAmount;

    Bankloan(double payAmount) {
        this.payAmount = payAmount;
    }

    public double salary() {
        return payAmount;
    }

    public double months() {
        return payAmount / 12;
    }

    public double totalLoan() {
        double result = payAmount * 7 / 100;
        double res = result;
        return res;
    }
}
