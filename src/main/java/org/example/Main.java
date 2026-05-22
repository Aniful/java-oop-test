package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        BankAccount firstUser = new BankAccount("009928283333", 900.0, "Filip G.");
        firstUser.getInfo();
        firstUser.withraw(1000.0);

    }
}
