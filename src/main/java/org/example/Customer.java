package org.example;

public class Customer extends User {
    private BankAccount bankAccount;

    public Customer(String name, String email, BankAccount bankAccount) {
        super(name, email);
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {

        return "Имя: " + getName() + ", Номер счета: " + bankAccount.getAccountNumber();
    }
}
