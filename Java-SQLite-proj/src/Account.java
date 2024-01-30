// Class for an Account; holds an ID and a Customer

public class Account extends AbstractClass {
    protected int id;
    protected Customer customer;

    //constructors
    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }
    public Account(Customer customer){
        this.customer = customer;
    }
    public Account(){}
    
    //getters
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
}
