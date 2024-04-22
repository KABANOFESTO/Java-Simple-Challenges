package Interface.question4;
import java.util.ArrayList;
import java.util.List;
 interface Account {
     void deposit(double amount);
     void withdraw(double amount);
     double calculateInterest();
     double viewBalance();
}
class SavingAccount implements Account{
     private double balance;
     private double interestrate;
     SavingAccount(double balance,double interestrate){
         this.balance = balance;
         this.interestrate = interestrate;
     }
     public void deposit(double amount){
         balance += amount;
     }
     public void withdraw (double amount){
         if(amount <= balance){
             balance -= amount;
         }
         else{
             System.out.println("Insufficient balance");
         }
     }
     public double calculateInterest(){
         return balance *interestrate;
     }
    public double viewBalance() {
        return balance;
    }
    public void addInterest() {
        double interest = calculateInterest();
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}
class CurrentAccount implements Account {
    private double balance;

    CurrentAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double calculateInterest() {
        // Current account does not earn interest
        return 0;
    }

    public double viewBalance() {
        return balance;
    }


    public void overdraftLimit(double limit) {
        if (balance < 0 && Math.abs(balance) > limit) {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
class Bank {
    private List<Account> accounts;

    Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account " + (i + 1) + ": Balance - " + accounts.get(i).viewBalance());
        }
    }
}

