// The motherload! Methods to create, read, update, and delete Accounts
// and Customers from the database.

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SQLfunctions {
    // switch case so I don't have to create two methods
    public static boolean createTable(Connection conn, String table){
        String sql = "CREATE TABLE IF NOT EXISTS " + table + " (\n";
        switch (table) {
            case "Accounts":
                sql +=
                    "   ID integer PRIMARY KEY,\n" +
                    "   CustomerID integer);";
            case "Customers":
                sql +=
                    "   CustomerID integer PRIMARY KEY,\n" +
                    "   FirstName varchar(50),\n" +
                    "   LastName varchar(50),\n" +
                    "   PhoneNum varchar(11),\n" +
                    "   EmailAddr varchar(50));";
        }
        try {
            Statement statement = conn.createStatement();
            statement.execute(sql);
            return true;
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": createTable() error");
            return false;
        }
    }
    // --- ACCOUNT METHODS ---
    //add an Account to the Accounts table
    public static void addAccount(Connection conn, Account account){
            String sql =
                "INSERT INTO Accounts (CustomerID) VALUES (?);";
            try {
                PreparedStatement pstatement = conn.prepareStatement(sql);
                pstatement.setObject(1, account.customer.id);
                pstatement.executeUpdate();
            } catch (SQLException e){
                System.out.println(e.getMessage() + ": addAccount() error");
            }
    }
    //update an Account from the Accounts table
    public static void updateAccount(Connection conn, Account account){
        String sql = 
            "UPDATE Accounts SET ID=?, CustomerID=?;";
        try {
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setInt(1, account.id);
            pstatement.setInt(2, account.customer.id);
            pstatement.executeUpdate();
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": updateAccount() error");
        }
    }
    //delete an Account from the Accounts table
    public static void deleteAccount(Connection conn, Account acc){
            String sql = "DELETE FROM Accounts WHERE ID=?;";
            try {
                PreparedStatement pstatement = conn.prepareStatement(sql);
                pstatement.setInt(1, acc.id);
                pstatement.executeUpdate();
            } catch (SQLException e){
                System.out.println(e.getMessage() + ": deleteAccount() error");
            }
    }
    //getting an Account from the Accounts table where ID = id
    public static Account getAccount(Connection conn, int id){
        Account account =  new Account();
        String sql = "SELECT * FROM Accounts WHERE ID=?;";
        try {
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setInt(1, id);
            ResultSet rs = pstatement.executeQuery();
            if (rs.next()){
                account.id = rs.getInt("ID");
                account.customer = new Customer(rs.getInt("CustomerID"));
            } else {
                account.id = id;
                account.customer = new Customer(404);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": getAccount() error");
        }
        return account;
    }
    //returning all Accounts from the Accounts table
    public static ArrayList<Account> getAllAccounts(Connection conn){
        ArrayList<Account> accounts = new ArrayList<Account>();
        String sql = "SELECT * FROM Accounts;";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Account account = new Account(rs.getInt("ID"),
                    new Customer(rs.getInt("CustomerID")));
                accounts.add(account);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": getAllAccounts() error");
        }
        return accounts;
    }
    // --- CUSTOMER METHODS ---
    //add a Customer to the Customers table
    public static void addCustomer(Connection conn, Customer customer){
            String sql =
                "INSERT INTO Customers (FirstName, LastName, " +
                "PhoneNum, EmailAddr) VALUES (?,?,?,?);";
            try {
                PreparedStatement pstatement = conn.prepareStatement(sql);
                pstatement.setString(1, customer.firstName);
                pstatement.setString(2, customer.lastName);
                pstatement.setString(3, customer.phoneNum);
                pstatement.setString(4, customer.emailAddr);
                pstatement.executeUpdate();
            } catch (SQLException e){
                System.out.println(e.getMessage() + ": addCustomer() error");
            }
    }
    //update a Customer from the Customers table
    public static void updateCustomer(Connection conn, Customer customer){
        String sql = 
            "UPDATE Customers SET FirstName=?, LastName=?, PhoneNum=?, " +
            "EmailAddr=? WHERE CustomerID=?;";
        try {
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setString(1, customer.firstName);
            pstatement.setString(2, customer.lastName);
            pstatement.setString(3, customer.phoneNum);
            pstatement.setString(4, customer.emailAddr);
            pstatement.setInt(5, customer.id);
            pstatement.executeUpdate();
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": updateCustomer() error");
        }
    }
    //delete a Customer to the Customers table
    public static void deleteCustomer(Connection conn, Customer customer){
            String sql = "DELETE FROM Customers WHERE CustomerID=?;";
            try {
                PreparedStatement pstatement = conn.prepareStatement(sql);
                pstatement.setInt(1, customer.id);
                pstatement.executeUpdate();
            } catch (SQLException e){
                System.out.println(e.getMessage() + ": deleteCustomer() error");
            }
    }
    //getting a Customer from the Customers table where ID = id
    public static Customer getCustomer(Connection conn, int id){
        Customer customer =  new Customer();
        String sql = "SELECT * FROM Customers WHERE CustomerID=?;";
        try {
            PreparedStatement pstatement = conn.prepareStatement(sql);
            pstatement.setInt(1, id);
            ResultSet rs = pstatement.executeQuery();
            if (rs.next()){
                customer.id = rs.getInt("CustomerID");
                customer.firstName = rs.getString("FirstName");
                customer.lastName = rs.getString("LastName");
                customer.phoneNum = rs.getString("PhoneNum");
                customer.emailAddr = rs.getString("EmailAddr");
            } else {
                customer.id = id;
                customer.firstName = "Customer";
                customer.lastName = "not";
                customer.phoneNum = "found";
                customer.emailAddr = "";
            }
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": getCustomer() error");
        }
        return customer;
    }
    //returning all Customers from the Customers table
    public static ArrayList<Customer> getAllCustomers(Connection conn){
        ArrayList<Customer> customers = new ArrayList<Customer>();
        String sql = "SELECT * FROM Customers;";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Customer customer = new Customer(rs.getInt("CustomerID"),
                    rs.getString("FirstName"), rs.getString("LastName"),
                    rs.getString("PhoneNum"), rs.getString("EmailAddr"));
                customers.add(customer);
            }
        } catch (SQLException e){
            System.out.println(e.getMessage() + ": getAllCustomers() error");
        }
        return customers;
    }
}
