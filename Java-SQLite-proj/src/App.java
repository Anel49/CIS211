// Used to create and edit databases

import java.sql.Connection;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        final String accountsStr = "Accounts";
        final String customersStr = "Customers";

        Connection connAccounts = DBConnection.connect(accountsStr + ".db");
        Connection connCustomers = DBConnection.connect(customersStr + ".db");

        //Customer objects
        Customer c1 = new Customer(1, "Katherine", "Higgins",
            "919-931-6101", "claudia2012@gmail.com");
        Customer c2 = new Customer(2, "Adeline", "Barba",
            "832-889-4947", "gennaro2014@gmail.com");
        Customer c3 = new Customer(3, "Robert", "Cassidy",
            "314-369-8636", "terrence_ber@gmail.com");

        Customer c2u = new Customer(3, "Robert", "James",
            "314-369-8636", "terrence_ber@gmail.com");
        Customer c2d = new Customer(2, "Adeline", "Barba",
            "832-889-4947", "gennaro2014@gmail.com");

        //creation of the Customers table and adding a few entries to it
        if (connCustomers != null){
            if (SQLfunctions.createTable(connCustomers, customersStr)){
                SQLfunctions.addCustomer(connCustomers, c1);
                SQLfunctions.addCustomer(connCustomers, c2);
                SQLfunctions.addCustomer(connCustomers, c3);

                //printing all Customers
                System.out.println("Printing all Customers...");
                printCustomers(SQLfunctions.getAllCustomers(connCustomers));
                System.out.println();

                //updating a Customer
                System.out.println("Updating a Customer...");
                printCustomer(c3);
                SQLfunctions.updateCustomer(connCustomers, c2u);
                Customer updatedCustomer = SQLfunctions.getCustomer(connCustomers, c2u.id);
                printCustomer(updatedCustomer);
                System.out.println();

                //deleting a Customer
                SQLfunctions.deleteCustomer(connCustomers, c2d);
                System.out.println("Printing all Customers after delete...");
                printCustomers(SQLfunctions.getAllCustomers(connCustomers));
                System.out.println();
            }
        }

        //Account objects
        Account acc1 = new Account(1, c1);
        Account acc2 = new Account(2, c3);

        Account a2u = new Account(2, c3);
        Account a2d = new Account(1, c1);

        //creation of the Accounts table and adding an entry to it
        if (connAccounts != null){
            if (SQLfunctions.createTable(connAccounts, accountsStr)){
                SQLfunctions.addAccount(connAccounts, acc1);
                SQLfunctions.addAccount(connAccounts, acc2);
                
                //printing all Accounts
                System.out.println("Printing all Accounts...");
                printAccounts(SQLfunctions.getAllAccounts(connAccounts));
                System.out.println();

                //updating an Account
                //couldn't get it to work :/ tried many, many combinations...
                System.out.println("Updating an Account...");
                printAccount(acc2);
                SQLfunctions.updateAccount(connAccounts, a2u);
                Account updatedAccount = SQLfunctions.getAccount(connAccounts, acc2.id);
                printAccount(updatedAccount);
                System.out.println();

                //deleting Account
                SQLfunctions.deleteAccount(connAccounts, a2d);
                System.out.println("Printing all Accounts after delete...");                
                printAccounts(SQLfunctions.getAllAccounts(connAccounts));
                System.out.println();
            }
        }
    }
    private static void printAccount(Account account){
        System.out.println("Account " + account.id + ":");
        System.out.println("    CustomerID: " + account.customer.id);
    }
    private static void printAccounts(ArrayList<Account> accounts){
        for (Account a : accounts){
            printAccount(a);
        }
    }
    private static void printCustomer(Customer c){
        System.out.println("Customer " + c.id + ":");
        System.out.printf("    %s, %s", c.lastName, c.firstName + "\n");
        System.out.println("    " + c.phoneNum);
        System.out.println("    " + c.emailAddr);
    }
    private static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers){
            printCustomer(c);
        }
    }
}
