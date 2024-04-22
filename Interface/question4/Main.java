package Interface.question4;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount savings = new SavingAccount(1000, 0.05);
        CurrentAccount current = new CurrentAccount(500);

        bank.addAccount(savings);
        bank.addAccount(current);

        bank.showAccounts();

        savings.deposit(500);
        current.withdraw(200);

        bank.showAccounts();

        savings.addInterest();
        current.overdraftLimit(1000);
    }
}
