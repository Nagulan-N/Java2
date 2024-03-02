package demo;

public class Account {
	private double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Your balance :"+balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    public void displayBalance() {
        System.out.printf("Balance: $%.2f%n", balance);
    }

}
