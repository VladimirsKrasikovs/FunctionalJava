package org.example.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer p1 = new Customer("Maria", "877");
        greetCustomer(p1);

        //Functional interface
        greetCustomerCOnsumer.accept(p1);

        greetCustomerCOnsumerV2.accept(p1,false);

    }

    static Consumer<Customer> greetCustomerCOnsumer = customer ->
            System.out.println("Hello " + customer.customerName+
                    " Thanks for registering phonenumber: " + customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerCOnsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName+
                    " Thanks for registering phonenumber: "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "******"));

    static void greetCustomer (Customer customer){
        System.out.println("Hello " + customer.customerName+
                " Thanks for registering phonenumber: " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;


        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
