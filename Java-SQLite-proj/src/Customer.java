// Class for Customers; holds a customer's basic information

public class Customer extends AbstractClass {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String phoneNum;
    protected String emailAddr;

    public Customer(int id, String firstName, String lastName, String phoneNum, 
        String emailAddr){
            //adds all fields to the Customers table
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNum = phoneNum;
            this.emailAddr = emailAddr;
    }
    public Customer(String firstName, String lastName, String phoneNum, 
        String emailAddr){
            //adds all fields to the Customers table
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNum = phoneNum;
            this.emailAddr = emailAddr;
    }
    public Customer(int id){
        this.id = id;
    }
    public Customer(){}
    
    //getters
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getEmailAddr(){
        return emailAddr;
    }
    //setters
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = firstName;
    }
    public String getFullName(){
        return String.format("%s, %s %s", id, firstName, lastName);
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setEmailAddr(String emailAddr){
        this.emailAddr = emailAddr;
    }    

    // public <T> String printArrayList(T arrayList){
    //     String string = "";
    //     for (T o : arrayList){
    //         string += o;
    //     }
    //     return string;
    // }

    /*
    Unimplimented methods—need a table  
        public void removeCard(Card card){
            //remove Card where card.getCardNum = cardNum in Cards table
        }
        public void removeAccount(Account account){
            //remove Account where account.getAccNo = accNo in Accounts table
        }
    */    
}