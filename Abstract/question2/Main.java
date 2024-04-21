package Abstract.question2;

public class Main {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        System.out.println("Bank A Balance = $"+a.getBalance());
        System.out.println("Bank B Balance = $"+b.getBalance());
        System.out.println("Bank C Balance = $"+c.getBalance());
    }
}
