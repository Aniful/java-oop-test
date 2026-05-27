package org.example;

public class BankAccount {
    private int ownerID;
    private String accountNumber;
    private double balance;
    private String ownerName;

    static int ID = 0;

    BankAccount(String accountNumber, double balance, String ownerName) {
        this.ownerID = ID++;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != "") {
            this.ownerName = ownerName;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != "") {
            this.accountNumber = accountNumber;
        }
    }

    public void getInfo() {
         System.out.printf("Имя: %s, Номер счета: %s, Баланс: %s\n", ownerName, accountNumber, balance);
    }

    public void deposit(double amout) {
        balance += amout;
        System.out.println("Текущий баланс: " + getBalance());
    }

    public void withraw(double amount) throws Exception {

        if (amount < balance) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("Ошибка. Сумма на счету после снятия будет отрицательной.");
        }

        System.out.println("Текущий баланс: " + getBalance());
    }

    public void withraw(double amount, String reason) {
        if (balance - amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Ошибка. Сумма на счету после снятия будет отрицательной.");
        }

        System.out.println("Текущий баланс: " + getBalance() + ". " + reason);
    }
}