package xyz.ivan.skills.oop.easy._03;

// Task: Implement a simple account management system
// Description: Design a BankAccount class:
// Contains attributes: account_number, balance
// Provides methods:
// Deposit method deposit(amount)
// Withdraw method withdraw(amount)
// Display balance method get_balance()

public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Deposit
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw
        boolean success = account.withdraw(200.0);
        if (success) {
            System.out.println("Withdrawal successful, balance: " + account.getBalance());
        } else {
            System.out.println("Withdrawal failed, insufficient balance");
        }

        // Display balance
        System.out.println("Current balance: " + account.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
