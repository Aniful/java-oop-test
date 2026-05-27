package org.example;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> arrayListCustomer = new ArrayList<Customer>();

    public void addCustomer(Customer customer) {
        arrayListCustomer.add(customer);
        System.out.println("Добавление клиента выполнено успешно.");
    }

    public void findCustomerByName(String name) throws CustomerNotFoundException{
        boolean isCustomer = false;

        for(Customer customer : arrayListCustomer){
            if (customer.getName() == name) {
                isCustomer = true;
                System.out.println("Клиент уже присутствует в базе данных.");
            }
        }

        if (isCustomer == false) {
            throw new CustomerNotFoundException("Клиент еще не добавлен в базу данных.");
        }
    }
}
