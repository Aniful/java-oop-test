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
         System.out.printf("Имя: %s, Номер счета: %s, Баланс: %s", ownerName, accountNumber, balance);
    }

    public void deposit(double amout) {
        balance += amout;
    }

    public void withraw (double amout) {
        balance -= amout;
    }
}