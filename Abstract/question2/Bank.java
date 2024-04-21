package Abstract.question2;

abstract class Bank {
    abstract int getBalance();
}
class BankA extends Bank{
    private int balance =100;
    int  getBalance(){
        return balance;
    }
}
class BankB extends Bank{
    private int balance =150;
    int  getBalance(){
        return balance;
    }
}
class BankC extends Bank{
    private int balance = 200;
    int  getBalance(){
       return balance;
    }
}
