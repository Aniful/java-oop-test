package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws Exception {

        BankAccount firstUser = new BankAccount("009928283333", 900.0, "Filip G");
        firstUser.getInfo();
        try {

            firstUser.withraw(100.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        Customer FilipCustomer = new Customer(firstUser.getOwnerName(), "Fil@li.su", firstUser);
//        System.out.println(FilipCustomer.toString());
//
        User FilipUser = new User(firstUser.getOwnerName(), "Fil@li.su");
//        System.out.println(FilipUser.toString());

        Bank bank = new Bank();
        bank.addCustomer(FilipCustomer);
        try {
            bank.findCustomerByName("Filip Gkjh");
        } catch (CustomerNotFoundException e) {
            e.getMessage();
        }



    }
}
